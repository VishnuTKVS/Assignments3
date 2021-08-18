package assignments3;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateAccountFB {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vishnuvarthan");
		driver.findElement(By.name("lastname")).sendKeys("Thiruvarangan");
		driver.findElement(By.name("reg_email__")).sendKeys("myfbacc@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("myfbpswrd");
		
		WebElement drpdwn1 = driver.findElement(By.name("birthday_day"));
		Select bday = new Select(drpdwn1);
		bday.selectByValue("20");
		int sizedrpdwn1 = bday.getOptions().size();
		System.out.println("The size of the bday drpdwn is: " + sizedrpdwn1);
	
			
		WebElement drpdwn2 = driver.findElement(By.id("month"));
		Select month = new Select(drpdwn2);
		month.selectByVisibleText("Nov");
		
		WebElement drpdwn3 = driver.findElement(By.id("year"));
		Select year = new Select(drpdwn3);
		year.selectByValue("1994");
		
		
		driver.findElement(By.xpath("//label[text() = 'Male']")).click();
		

	}

}

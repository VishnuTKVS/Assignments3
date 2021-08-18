package assignments3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceSignup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Vishnuvarthan");
		driver.findElement(By.name("UserLastName")).sendKeys("Thiruvarangan");
		driver.findElement(By.name("UserEmail")).sendKeys("mysalesforce@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TKVS");
		driver.findElement(By.name("UserPhone")).sendKeys("8220654128");
		
		WebElement drpdwn1 = driver.findElement(By.name("UserTitle"));
		Select jobtitle = new Select(drpdwn1);
		jobtitle.selectByVisibleText("IT Manager");
		
		WebElement drpdwn2 = driver.findElement(By.name("CompanyEmployees"));
		Select comemp = new Select(drpdwn2);
		comemp.selectByValue("250");
		
		WebElement drpdwn3 = driver.findElement(By.name("CompanyCountry"));
		Select country = new Select(drpdwn3);
		country.selectByValue("SG");
		
		driver.findElement(By.className("checkbox-ui")).click();
		
		driver.close();
		
		

	}

}

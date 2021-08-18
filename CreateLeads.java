package assignments3;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeads {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		//String title = driver.getTitle();
		//System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishnu Varthan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiruvarangan");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn1 = new Select(source);
		drpDwn1.selectByIndex(8);
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDwn2 = new Select(campaign);
		drpDwn2.selectByValue("CATRQ_AUTOMOBILE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("vishnu");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("varthan");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("WELCOME");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SELENIUM AUTOMATION TEST");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("AERONAUTICAL ENGINEERING");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("18 Lakhs");
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpDwn4 = new Select(currency);
		drpDwn4.selectByVisibleText("INR - Indian Rupee");
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpDwn3 = new Select(industry);
		drpDwn3.selectByVisibleText("Computer Software");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("120");
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpDwn5 = new Select(ownership);
		drpDwn5.selectByVisibleText("Corporation");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("0628");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("j7");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("04321");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8220654128");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("252164");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("VISHNU");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vishnutkvstn@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://testleaf.com");
	
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("VishnuVarthan");
	
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("vishnu");
	
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("69/b8 GH OPP");
	
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Same as Address1");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Trichy");
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drpDwn7 = new Select(country);
		drpDwn7.selectByVisibleText("India");
		
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpDwn6 = new Select(State);
		drpDwn6.selectByVisibleText("TAMILNADU");
	
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("621011");
	
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("252698");
		
		driver.findElementByClassName("smallSubmit").click();
		
		String title = "My Home | opentaps CRM";
		String homeTitle = driver.getTitle();
		
		if (title.equals(homeTitle)) {
			System.out.println("In The home page");
					}
		else
			System.out.println("Not in the home page");
		
		
		
		
		
	}

}

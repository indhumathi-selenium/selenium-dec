package Week2.day3;

import org.apache.poi.util.Internal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
		//opt.addArguments("--incognito");
		//opt.addArguments("--headless");
		opt.addArguments("--disable-notifications");
	

		//Instantiate the Browser driver
		ChromeDriver driver= new ChromeDriver(opt);

		//Maximize the browser window.

		driver.manage().window().maximize();
		driver.manage().timeouts();

		//Load the url
		driver.get("http://leaftaps.com/opentaps/");

		//Enter the username as ‘demosalesmanager’
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		//Enter the password as 'crmsfa'
		driver.findElement(By.id("password")).sendKeys("crmsfa");

	
		//Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		  
		  //Click on the CRM/SFA link
		  driver.findElement(By.partialLinkText("CRM/SFA")).click();

		//- Click on the "Accounts" tab. 
		  driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		  
		//- Click on the "Create Account" button.
		  driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		  
		//- Enter an account name. 
		  driver.findElement(By.id("accountName")).sendKeys("raj");
		  
		//- Enter a description as "Selenium Automation Tester." 
		  driver.findElement(By.name("description")).sendKeys("Selenium automation tester");
		  
		//- Select "ComputerSoftware" as the industry. 
		  WebElement sourceOption1 = driver.findElement(By.name("industryEnumId"));
		  Select options1 = new Select(sourceOption1);
		  options1.selectByIndex(3); 
		  
		//- Select "S-Corporation" as ownership using SelectByVisibleText.
		  WebElement sourceOption2 = driver.findElement(By.name("ownershipEnumId"));
		  Select options2 = new Select(sourceOption2);
		  options2.selectByIndex(4); 
		  
		//- Select "Employee" as the source using SelectByValue. 
		  WebElement sourceOption3 = driver.findElement(By.name("dataSourceId"));
		  Select options3 = new Select(sourceOption3);
		  options3.selectByIndex(4);
		  
		//- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex. 
		  WebElement sourceOption4 = driver.findElement(By.name("marketingCampaignId"));
		  Select options4 = new Select(sourceOption4);
		  options4.selectByIndex(6);
			       
		//- Select "Texas" as the state/province using SelectByValue. 
		  //WebElement sourceOption5 = driver.findElement(By.name("currencyUomId"));
		  //Select options5 = new Select(sourceOption5);
		  //options5.selectByValue("TX");
		  
		//- Click the "Create Account" button. - 
		  driver.findElement(By.className("smallSubmit")).click();
		//- Close the browser window.
		  driver.close();
	}

}


 


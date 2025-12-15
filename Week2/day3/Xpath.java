package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class Xpath {

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
		  
		  //Click on the Leads tab.
		  driver.findElement(By.xpath("//a[text()='Leads']")).click();
		  
		  //Click on the Create Lead link from shortcuts.
		  driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		  
		  //Enter a FirstName
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		  
		  //Enter a LastName.
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mothi");
		  
		  //- Enter a CompanyName
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("laal");
		  
		  //Enter a Title .
		  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testleaf Tester");
		  
		  WebElement sourceOption = driver.findElement(By.id("createLeadForm_dataSourceId"));
		  Select sourceOption1 = new Select(sourceOption);
		  sourceOption1.selectByIndex(4);
		  
		  WebElement mktCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		  Select mktCampaign1= new Select(mktCampaign);
		  mktCampaign1.selectByIndex(2);
		  
		  WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		  Select Ownership1= new Select(Ownership);
		  Ownership1.selectByIndex(6);
		
		  
		  //Click the "Create Lead" button
		  driver.findElement(By.name("submitButton")).click();
		  
	}
	}


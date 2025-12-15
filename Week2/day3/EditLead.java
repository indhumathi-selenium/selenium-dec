package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

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
		  
		  //Click on the Create Lead link from shortcuts.
		  driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		  
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("GWG");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("aaaa");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vvvvv");
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("hhhh");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HR");
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("hello");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("123@gmail.com");  
		  
		  driver.findElement(By.name("submitButton")).click();
		  
		  driver.findElement(By.xpath("//a[text()='Edit']")).click();
		  driver.findElement(By.id("updateLeadForm_description")).sendKeys(""); 
		  driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("note it"); 
		  driver.findElement(By.name("submitButton")).click();
		  
		  String title=driver.getTitle();
			System.out.println(title);
	}

}

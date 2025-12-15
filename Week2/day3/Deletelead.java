package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Deletelead {

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
			  
			  //Click " leads." 
			  driver.findElement(By.xpath("//a[text()='Leads']")).click();
			  
			//Click "Find leads." 
			  driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			  
			//Click on the "Phone" tab. - 
			  driver.findElement(By.xpath("//span[text()='Phone']")).click();
			  			  
			  //Enter the phone number
			 driver.findElement(By.xpath("(//input[@id='ext-gen270'])[1]")).sendKeys("9999999999");
			//driver.findElement(By.id("phoneNumber")).sendKeys("987654321");
			  
			//Click the "Find leads" button. -
			  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			  //Capture the lead ID of the first resulting lead. 
			  //Click the first resulting lead. 
			  driver.findElement(By.linkText("12099")).click();

			//- Click the "Delete" button.
			  driver.findElement(By.xpath("//a[text()='Delete']")).click();
			  
			//Click "Find leads again." 
			  driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			  
			
	}

}



 


 
 
//- Enter the captured lead ID. 
//- Click the "Find leads" button. 
//- Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion. - 
//Close the browser.    driver.close();	
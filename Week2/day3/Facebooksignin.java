package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebooksignin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate the Browser driver
				
		ChromeOptions opt = new ChromeOptions();
		ChromeDriver driver= new ChromeDriver(opt);

				//Maximize the browser window. 

				driver.manage().window().maximize();
				driver.manage().timeouts();

				//Load the url
				driver.get("https://en-gb.facebook.com/");
				driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				driver.findElement(By.name("firstname")).sendKeys("sujitha");
				driver.findElement(By.name("lastname")).sendKeys("vishnu");
				
				WebElement day = driver.findElement(By.id("day"));
				  Select day1 = new Select(day);
				  day1.selectByIndex(17);
				  
				  WebElement Month = driver.findElement(By.id("month"));
				  Select Month1 = new Select(Month);
				  Month1.selectByIndex(5);
				  
				  WebElement Year = driver.findElement(By.id("year"));
				  Select Year1 = new Select(Year);
				  Year1.selectByIndex(19);
				  
				  driver.findElement(By.xpath("//label[text()='Female']")).click();
				  driver.findElement(By.name("reg_email__")).sendKeys("987654321");
				  driver.findElement(By.id("password_step_input")).sendKeys("98754321@1");
				  driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
				  
	}

}

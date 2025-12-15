package Week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdvanceXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions Option=new ChromeOptions();
Option.addArguments("--guest");

ChromeDriver driver=new ChromeDriver(Option);

driver.manage().window().maximize();
driver.get("https://www.facebook.com");
driver.findElement(By.xpath("//div[@class='_6lux']/input")).sendKeys("indhu");
driver.findElement(By.xpath("//div[@class='_6luy _55r1 _1kbt']/input")).sendKeys("987664432");
	}

}

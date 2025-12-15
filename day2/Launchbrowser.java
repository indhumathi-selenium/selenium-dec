package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();


driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("testleaf@gmail.com");
driver.findElement(By.id("pass")).sendKeys("123345");
driver.findElement(By.name("login")).click();
String Title=driver.getTitle();
System.out.println(Title);

	}

}

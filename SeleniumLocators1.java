package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators1 {
	public static void main(String arg[]) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://acme-test.uipath.com/login");
	driver.manage().window().maximize();
WebElement elementemail = driver.findElement(By.id("email"));
elementemail.sendKeys("kumar.testleaf@gmail.com");
driver.findElement(By.id("password")).sendKeys("leaf@12");
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
System.out.println("This is a Title:" +driver.getTitle());
driver.findElement(By.xpath("(//a[@onclick])[1]")).click();

driver.findElement(By.className("navbar-toggle")).click();

driver.close();
}
}

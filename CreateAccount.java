package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	WebElement findElement = driver.findElement(By.id("username"));
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("credit");
driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("HDFC.com");
driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("50000");
driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

driver.close();

}
}

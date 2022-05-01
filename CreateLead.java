package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String arg[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		   driver.findElement(By.linkText("Create Lead")).click();
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("APA");
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Meena");
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shanmugam");
		   driver.findElement(By.className("smallSubmit")).click();
		  driver.getTitle();
		  driver.close();



}
}
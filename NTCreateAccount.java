package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {
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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("currencyUomId")).sendKeys("INR - Indian Rupee");
		driver.findElement(By.className("inputBox")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("credit");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("HDFC.com");
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("50000");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String text = driver.findElement(By.className("errorMessageHeader")).getText();
		System.out.println(text);
		String text2 = driver.findElement(By.className("errorMessage")).getText();
		System.out.println(text2);
		driver.close();
		
		


}
}
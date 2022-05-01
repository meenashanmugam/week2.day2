package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

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
	driver.findElement(By.linkText("Find Accounts")).click();
	driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
	driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	driver.findElement(By.linkText("Credit Limited Account")).click();
	driver.findElement(By.linkText("Edit")).click();
	//driver.findElement(By.xpath("//a[@class='subMenuButton'])[1]")).click();
	String text = driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).getAttribute("value");
	System.out.println(text);
	String text2 = driver.findElement(By.xpath("//textarea[@class='inputBox']")).getText();
	System.out.println(text2);
	System.out.println("the title of the page:"  +driver.getTitle());

}
}
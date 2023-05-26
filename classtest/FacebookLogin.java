package sel.classtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click(); 
		
		Thread.sleep(5000);
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Hari");
		
		driver.findElement(By.name("lastname")).sendKeys("Prakash");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8838077003");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123hari");
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select day1 = new Select(day);
		day1.selectByValue("7");
		
		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("Feb");
		
		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByIndex(23);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.close();
		
	}

}

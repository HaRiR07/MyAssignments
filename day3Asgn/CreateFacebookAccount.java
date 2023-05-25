package sel.day3Asgn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get(" https://en-gb.facebook.com/");
		//Maximize the window
		driver.manage().window().maximize();
		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Click on Create New Account button
		WebElement CreateNewAccount = driver.findElement(By.xpath("//a[contains(@data-testid,'open')]"));
		CreateNewAccount.click();
		// Enter the first name
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Hari");
		//Enter the last name
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Prakash");
		//Enter the mobile number
		WebElement mobileNumber = driver.findElement(By.name("reg_email__"));
		mobileNumber.sendKeys("8838077003");
		//enter the password
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("********");
		//enter date
		WebElement birthDateDD = driver.findElement(By.id("day"));
		Select birthDatedd = new Select (birthDateDD);
		birthDatedd.selectByIndex(6);
		//Enter month
		WebElement monthDD = driver.findElement(By.id("month"));
		Select monthdd = new Select (monthDD);
		monthdd.selectByValue("2");
		//Enter year
		WebElement yearDD = driver.findElement(By.id("year"));
		Select yeardd = new Select(yearDD);
		yeardd.selectByVisibleText("2001");
		//Select the radio button "Female"
		WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
		gender.click();
	
	
	}
}

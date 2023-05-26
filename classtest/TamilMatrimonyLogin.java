package sel.classtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimonyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tamilmatrimony.in/");
		
		WebElement reg = driver.findElement(By.id("REGISTERED_BY"));
		Select regFor = new Select(reg);
		regFor.selectByValue("1");
		
		driver.findElement(By.id("NAME")).sendKeys("HariPrakash");
		
		driver.findElement(By.xpath("//input[@id='gendermale']")).click();
		
		WebElement dob = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select dob1 = new Select(dob);
		dob1.selectByVisibleText("7");
		
		WebElement dom = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select dom1 = new Select(dom);
		dom1.selectByIndex(2);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='DOBYEAR']"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("2001");
		
		WebElement relegion = driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select relegion1 = new Select(relegion);
		relegion1.selectByValue("1");
		
		WebElement lan = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select language = new Select(lan);
		language.selectByValue("47");
		
		WebElement cont = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select country = new Select(cont);
		country.selectByVisibleText("India");
		
		WebElement code = driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
		Select countryCode = new Select(code);
		countryCode.selectByValue("98");
		
		driver.findElement(By.id("MOBILENO")).sendKeys("8838077003");
		
		driver.findElement(By.id("EMAIL")).sendKeys("hariprakashrajaram@gmail.com");
		
		driver.findElement(By.id("PASSWORD")).sendKeys("prakash321");
		
		driver.close();
		
		
		
		 
		
		
	}

}

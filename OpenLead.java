package sel.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLead {
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//get the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//locate username field
		WebElement username = driver.findElement(By.id("username"));
		
		//enter input as DemoSalesManager
		username.sendKeys("DemoSalesManager");
		
		//locate password field
		WebElement password = driver.findElement(By.id("password"));
		
		//enter password as crmsfa
		password.sendKeys("crmsfa");
		
		//click on the login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		//click on the crmsfa link
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		
		//click on the leadstab
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();
		
		//click on the createlead 
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		
		//locate companyname
		WebElement companyName = driver.findElement(By.id("createLeadForm_compamyName"));
		
		//enter the companyname as TestLeaf 
		companyName.sendKeys("TestLeaf");
		
		//locate the firstname field
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		
		//enter the first name as Hari
		firstName.sendKeys("Hari");
		
		//locate the lasttname field
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		
		//enter the last name as prakash
		lastName.sendKeys("Prakash");
		
		//locate the firstname local field
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		
		//enter the firstname local as R
		firstNameLocal.sendKeys("R");
		
		//locate the departmentname field
		WebElement departmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		
		//enter the the departmentname as Mechanical
		departmentName.sendKeys("Mechanical");
		
		//locate the description field
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		
		//enter the description as Complete the Assignment
		description.sendKeys("Complete the Assignment");
		
		//locate the email field
		WebElement primaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		
		//enter the primaryEmail as hariprakashrajaram@gmail.com
		primaryEmail.sendKeys("hariprakashrajaram@gmail.com");
		
		//locate createlead field
		WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		
		//click on the createlead button
		createLeadButton.click();
		
		//close the browser
		driver.close();		
		
		
		
		
			
		
		
		
	}

}

package sel.day3Asgn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		// Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Enter UserName 
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
		//Click Leads link
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();
		//Click Find leads
		WebElement findLeadsButton = driver.findElement(By.linkText("Find Leads"));
		findLeadsButton.click();
		//Click on Phone
		WebElement phoneTab = driver.findElement(By.linkText("Phone"));
		phoneTab.click();
		//Locate  phone number
		WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
		//Enter phone number
		phoneNumber.sendKeys("8012787044");
		//Click find leads button
		WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
		findLeads.click();
		//Capture lead ID of First Resulting lead
		WebElement leadId = driver.findElement(By.xpath("//a[text( )='10199']"));
		System.out.println(leadId.getText());
		//Click First Resulting lead
		WebElement firstLead = driver.findElement(By.xpath("//a[text( )='10199']"));
		firstLead.click();
		//Click delete
		WebElement delete = driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']"));
		delete.click();
		//Click Find leads
		WebElement findLeads1 = driver.findElement(By.xpath("//a[text( )='Find Leads']"));
		findLeads1.click();
		//Enter captured lead ID
		WebElement leadID = driver.findElement(By.name("id"));
		leadID.sendKeys("10199");
		//Click find leads button
		WebElement findLeadsButton1 = driver.findElement(By.xpath("//button[text( )='Find Leads']"));
		findLeadsButton1.click();
		driver.close();
		
	}

}

package sel.day3Asgn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		//Click on Email
		WebElement emailTab = driver.findElement(By.linkText("Email"));
		emailTab.click();
		//Locate Email
		WebElement emailAddress = driver.findElement(By.name("emailAddress"));
		emailAddress.sendKeys("hariprakashrajaram@gmail.com");
		//Click find leads button
		WebElement findLeadsButton1 = driver.findElement(By.linkText("Find Leads"));
		findLeadsButton1.click();
		//Capture name of First Resulting lead
		WebElement firstLeadName = driver.findElement(By.xpath("//a[text( )='hareeharan']"));
		String text = firstLeadName.getText();
		System.out.println(text);
		//Click First Resulting lead
		firstLeadName.click();
		//Click Duplicate Lead
		WebElement duplicate = driver.findElement(By.linkText("Duplicate Lead"));
		duplicate.click();
		//Verify the title as 'Duplicate Lead
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Duplicate Lead")) {
			System.out.println("It is verified");
		
		}
		//Click Create Lead
		WebElement submit = driver.findElement(By.name("submitButton"));
		submit.click();
		//Confirm the duplicated lead name is same as captured name
		WebElement duplicateName = driver.findElement(By.id("viewLead_firstName_sp"));
		String text1 = duplicateName.getText();
		if (text1.equals(text)) {
			System.out.println("Both are equal");
		}
		driver.quit();
		
		
	}

}

package sel.day3Asgn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

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
		//Click on contacts Button
		WebElement contactsTab = driver.findElement(By.linkText("Contacts"));
		contactsTab.click();
		// Click on Create Contact
		WebElement createContactsButton = driver.findElement(By.linkText("Create Contact"));
		createContactsButton.click();
		//Enter FirstName Field Using id Locator
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		//Enter firstname as Hari
		firstName.sendKeys("Hari");
		//Enter LastName Field Using id Locator
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		//Enter lastname as Prakash
		lastName.sendKeys("Prakash");
		//Locate FirstName(Local) Field Using id Locator
		WebElement firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		//Enter FirstName(Local)
		firstNameLocal.sendKeys("raja");
		//Locate LastName(Local) Field Using id Locator
		WebElement lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
		//Enter LastName(Local) 
		lastNameLocal.sendKeys("ram");
		//Locate Department Field Using any Locator of Your Choice
		WebElement departmentName = driver.findElement(By.name("departmentName"));
		//Enter departmentName as Mechanical
		departmentName.sendKeys("Mechanical");
		//locate Description Field Using any Locator of your choice
		WebElement description = driver.findElement(By.name("description"));
		//Enter description 
		description.sendKeys("Fresher");
		//Locate the E-mail address Field using the locator of your choice
		WebElement emailAddress = driver.findElement(By.id("createContactForm_primaryEmail"));
		//Enter your email in the E-mail address Field
		emailAddress.sendKeys("hariprakashrajaram@gmail.com");
		//Select State/Province as NewYork Using Visible Text
		WebElement stateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select statedd = new Select(stateDD);
		statedd.selectByValue("NY");
		//locate Create Contact
		WebElement createContactButton = driver.findElement(By.className("smallSubmit"));
		createContactButton.click();
		//Click on edit button 
		WebElement editButton = driver.findElement(By.linkText("Edit"));
		editButton.click();
		//Clear the Description Field using .clear
		WebElement clearDescription = driver.findElement(By.name("description"));
		clearDescription.clear();
		//Fill ImportantNote Field with Any text
		WebElement importantNote = driver.findElement(By.name("importantNote"));
		//enter SubmitAssignment
		importantNote.sendKeys("SubmitAssignment");
		// Click on update button using Xpath locator
		WebElement updateButton = driver.findElement(By.xpath("//input[@value='Update']"));
		updateButton.click();
		//Get the Title of Resulting Page
		System.out.println(driver.getTitle());
		
	}

}

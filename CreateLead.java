package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		//Launch chrome
		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//Loading testing URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//entering username
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		//entering password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crm/sfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Lead tab navigatin+on
		driver.findElement(By.linkText("Create Lead"));
		//entering first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Testlead");
		//entering last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("TestLeaf@1234");
		//entering company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Agilysys");
		//entering title
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Title test");
		//submit button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		if(driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']")).getText().contains("Title test"))
		{

			System.out.println("Title is matching with the given name");
		}

		else

			System.out.println("Title is not matching with the given name");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.quit();

	}



	


}



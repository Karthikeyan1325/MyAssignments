package week2.day1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CreateAccount {



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
		//accounts tab navigate
		driver.findElement(By.linkText("Accounts")).click();
		//click create accounts button
		driver.findElement(By.linkText("Create Account")).click();
		//give account name
		driver.findElement(By.id("accountName")).sendKeys("Johnprousaccount");
		//selecting industry dropdown

		WebElement sourceElement1 = driver.findElement(By.name("industryEnumId"));

		Select dropDown1 = new Select(sourceElement1);

		dropDown1.selectByIndex(3);

		//Selecting ownership dropwn

		WebElement sourceElement2 = driver.findElement(By.name("ownershipEnumId"));

		Select dropDown2 = new Select(sourceElement2);

		dropDown2.selectByVisibleText("S-Corporation");

		//selecting source dropdown

		WebElement sourceElement3 = driver.findElement(By.id("dataSourceId"));

		Select dropDown3 = new Select(sourceElement3);

		dropDown3.selectByValue("LEAD_EMPLOYEE");

		//selecting marketing campaign dropdown

		WebElement sourceElement4 = driver.findElement(By.id("marketingCampaignId"));

		Select dropDown4 = new Select(sourceElement4);

		dropDown4.selectByIndex(6);

		//selecting state/province dropdown

		WebElement sourceElement5 = driver.findElement(By.id("generalStateProvinceGeoId"));

		Select dropDown5 = new Select(sourceElement5);

		dropDown5.selectByValue("TX");

		//clicking create button
		
		driver.findElement(By.className("smallSubmit")).click();
		
		if (driver.findElement(By.className("(//span[@class='tabletext'])[3]")).getText().contains("Johnprousaccount"))
			
			System.out.println("Account name is matching with the given name");
		
		else
			
			System.out.println("test case fails");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.quit();







	}

}

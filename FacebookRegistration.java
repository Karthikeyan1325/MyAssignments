package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//Load the FB URL
		driver.get("https://www.facebook.com/");
		//click create new button
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		//entering first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Karthi");
		//entering Surname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("keyan");
		//Date of birth day selection
		WebElement source1 = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select dropDown1 = new Select(source1);
		
		dropDown1.selectByVisibleText("13");
		//month selection 
		WebElement source2 = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select dropDown2 = new Select(source2);
		
		dropDown2.selectByVisibleText("Nov");
		
		//year selection
		
		WebElement source3 = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select dropDown3 = new Select(source3);
		 
		dropDown3.selectByVisibleText("1998");
		
		//Gender selection
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.quit();
		
		

	}

}

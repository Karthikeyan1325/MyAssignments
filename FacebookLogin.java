package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//Load the FB URL
		driver.get("https://www.facebook.com/");
		//enter email address
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		//enter password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tuna@321");
		//click on login button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//find your account link
		driver.findElement(By.linkText("Find your account and log in.")).click();

		if(driver.findElement(By.xpath("(//h2[text()=\"Find Your Account\"])[2]")).getText().contains("Find Your Account"))

		{

			System.out.println("Find your acccount page is identified");
		}

		else

			System.out.println("Error in finding the page");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.quit();

	}

}

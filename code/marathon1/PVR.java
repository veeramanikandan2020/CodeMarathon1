package code.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVR {
	
	/*
	 * Testcase 3 (PVR cinemas)
==========
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
ChromeDriver driver = new ChromeDriver(options);

01) Launch the Url  https://www.pvrcinemas.com/
02) Click  on Movie Library
03) Select the City -->chennai
04) Select the Genre-->Animation
05) Select the Language-->english
06) Click on Apply
07) Click on first resulting animation movie
08) Click proceed to book
09) Enter the all fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
10) Click on copy to self 
11) Click on  Send Request
12) Click cancel 
13) Close the OTP dialog
14) Verify the ttile of the page
	 * 
	 */

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
        options.addArguments("--disable-notifications");
        
        ChromeDriver driver = new ChromeDriver(options);
        
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		
		driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
		
		WebElement element = driver.findElement(By.name("city"));
		
		Select city = new Select(element);
		
		city.selectByVisibleText("Chennai");
		
//		WebElement SDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
//		
//		Select sec = new Select(SDD);
//		
//		sec.selectByIndex(4);
//		
		

	}

}

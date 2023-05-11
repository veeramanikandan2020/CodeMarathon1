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

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		
        options.addArguments("--disable-notifications");
        
        ChromeDriver driver = new ChromeDriver(options);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		
		driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
		
		WebElement element = driver.findElement(By.name("city"));
		
		Select city = new Select(element);
		
		city.selectByVisibleText("Chennai");
		
		WebElement element2 = driver.findElement(By.name("genre"));
		
		Select genre = new Select(element2);
		
		genre.selectByVisibleText("ANIMATION");
		
		WebElement element3 = driver.findElement(By.name("lang"));
		
		Select lang = new Select(element3);
		
		lang.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		WebElement element4 = driver.findElement(By.id("cinemaName"));
		
		Select cinema = new Select(element4);
		
		cinema.selectByVisibleText("SPI Sathyam Chennai");
		
		WebElement element5 = driver.findElement(By.name("timings"));
		
		Select timing = new Select(element5);
		
		timing.selectByVisibleText("12:00 PM - 03:00 PM");
		
		driver.findElement(By.xpath("(//input[contains(@class,'input-text form-control')])[3]")).sendKeys("4");
		
		driver.findElement(By.xpath("//label[text()='No. of Seats']/following::input")).sendKeys("Veera");
		
		driver.findElement(By.xpath("//label[text()='Name']/following::input")).sendKeys("Veera@gmail.com");
		
		driver.findElement(By.xpath("//label[text()='Email']/following::input")).sendKeys("9626920373");
		
		WebElement element6 = driver.findElement(By.xpath("(//select[contains(@class,'input-text form-control')])[3]"));
		
		Select food = new Select(element6);
		
		food.selectByVisibleText("Yes");
		
		driver.findElement(By.xpath("//label[text()='F&B Requirements']/following::input")).sendKeys("No");
		
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		
		String title = driver.getTitle();
		
		if(title.equals("Movie Library"))
				System.out.println("Title is verified and correct");
		else
			System.out.println("Title is wrong");

	}

}

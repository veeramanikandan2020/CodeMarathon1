package code.marathon1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * ---------------
Testcase:1 (RedBus)
==========
01) Launch Firefox / Chrome and
    add  implicitlyWait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
02) Load https://www.redbus.in/
03) Type "Chennai" in the FROM text box
04) Click the first option from the pop up box
05) Type "Bangalore" in the TO text box
06) Click the first option from the pop up box
07) Select tomorrow's date in the Date field
08) Click Search Buses
09) Print the number of buses shown as results (101 Buses found) (use .getText())
10) Choose SLEEPER in the left menu 
11) Print the name of the second resulting bus (use .getText())
12) Get the Title of the page(use .getTitle())
 * 
 */

public class RedBus {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		
        options.addArguments("--disable-notifications");
        
        ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//li[@class='sub-city']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//li[@class='sub-city' and @data-no = '2']")).click();
		
		driver.findElement(By.xpath("//td[@class='current day']/following-sibling::td"));
		
		driver.findElement(By.xpath("//td[text()='12']")).click();
		
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		String text = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		
		String text2 = driver.findElement(By.xpath("//div[@class='travels lh-24 f-bold d-color']")).getText();
		
		System.out.println(text2);
		
		System.out.println(driver.getTitle());
		

	}

}

package code.marathon1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	/*
	 * 
	 * Testcase:2(Amazon)
===============
01) Launch Chrome  
02) Load https://www.amazon.in/
     add  implicitlyWait
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
03) Type "Bags" in the Search box
04) Choose the 	 item in the result (bags for boys)
05) Print the total number of results (like 50000)
    1-48 of over 50,000 results for "bags for boys"
06) Select the first 2 brands in the left menu
    (like American Tourister, Generic)
07) Choose New Arrivals (Sort)
08) Print the first resulting bag info (name, discounted price)
09) Get the page title and close the browser(driver.close())	
	 */

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		
		System.out.println("Total number of Results:"+driver.findElement(By.xpath("//div[@class='sg-col-inner']")).getText());
		
		driver.findElement(By.xpath("//li[@id='p_89/American Tourister']/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
		
		driver.findElement(By.xpath("//li[@id='p_89/Safari']/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
		
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).click();
		
		String text = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]")).getText();
		
		System.out.println(text);
		
		System.out.println("Title of Page:"+driver.getTitle());
		
		
	}

}

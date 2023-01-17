package org.web.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class smokeTestCases {
	
	public WebDriver driver; 

	@BeforeMethod
	public WebDriver init() throws InterruptedException {
		String filepath =  "./src/main/resources/chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", "C:\\OnlineTrainings\\SeleniumClasses\\Day1\\Practise 1\\bin\\day1\\lib\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", filepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		Thread.sleep(1000);
		return driver;
	}
	
	@AfterMethod
	public void quit() {
		driver.close();
	}
	
	
	public void addProductToCart() throws InterruptedException {
		
		WebElement currency = driver.findElement(By.xpath("//span[contains(text(),'Currency')]"));
		currency.click(); 
		System.out.println("Currency dropdown selected");
		
		currency.findElement(By.xpath("//a[@href='EUR']")).click();
		System.out.println("EUR selected");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Components']")).click();
		System.out.println("Components dropdown selected");
		
		driver.findElement(By.xpath("//a[contains(text(),'Show All Components')]")).click();
		System.out.println("Show all components selected");
		
		driver.findElement(By.xpath("//a[contains(text(),'- Monitors (2)')]")).click();
		Thread.sleep(1000);
		
		WebElement product = driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[2]/form/div/div[1]/a/img"));
		product.click();
		
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		System.out.println("Product is added successfully");
			
	}
	
	public void browseBack() {
		
		WebElement cameras = driver.findElement(By.xpath("//a[normalize-space()='Cameras']"));
		cameras.click();
		
		WebElement product = driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[1]/form/div/div[1]/a/img"));
		product.click();
		
		driver.findElement(By.xpath("//*[@id=\"product-info\"]/ul/li[1]/a")).click();	
	}
}

package org.web.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.web.testcases.smokeTestCases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class StepDefinition extends smokeTestCases{
	
	public WebDriver driver; 
	
	@Given("I am a customer landing on Opencart page")
	public void  customer_landing_on_Opencart_page() throws InterruptedException {		
		driver = init();		
	}

	@And("^I click on the currency (.+)$")
	public void click_on_currency(String currency1) {
		WebElement currency = driver.findElement(By.xpath("//span[contains(text(),'Currency')]"));
		currency.click(); 
		System.out.println("Currency dropdown selected");
		
		currency.findElement(By.xpath("//a[@href='EUR']")).click();
		System.out.println(currency1 + " selected");
	}
	
	@And ("I click on components dropdown")
	public void click_components_dropdown() {
		driver.findElement(By.xpath("//a[text()='Components']")).click();
	}
	
	@And ("^I click on the component (.+)$")
	public void click_on_components(String components) {
		driver.findElement(By.xpath("//a[contains(text(),'Show All Components')]")).click();
	}
	
	@And ("^I click on the filter (.+)$")
	public void click_filter(String filter) {
		driver.findElement(By.xpath("//a[contains(text(),'- Monitors (2)')]")).click();
	}
	
	@And ("^I click on the products (.+)$")
	public void click_products(String products) {
		WebElement product = driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[2]/form/div/div[1]/a/img"));
		product.click();
	}
	
	@And ("I click on the CTA Add to Cart")
	public void click_CTA(){
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		System.out.println("Product is added successfully");
		driver.close();
	
	}
	
	 @And ("I click on cameras dropdown")
	 public void click_cameras_dropdown() {
		 WebElement cameras = driver.findElement(By.xpath("//a[normalize-space()='Cameras']"));
			cameras.click();
			System.out.println("Camera dropdown clicked");
	 }
	 
	 @And ("^I click on the product (.+)$")
	 public void click_product(String camera) {
		 WebElement product = driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[1]/form/div/div[1]/a/img"));
		 product.click();
		 System.out.println("product clicked");
	 }
	 
	 @And ("I click on the Home button")
	 public void click_home_button() {
		 driver.findElement(By.xpath("//*[@id=\"product-info\"]/ul/li[1]/a")).click();
		 System.out.println("Home button clicked");
		 //driver.close();
	 }
}


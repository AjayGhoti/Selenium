package com.agg.allAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatingElement_01 {
         
	public static void chroPathContains() throws InterruptedException {
		// File used Mobile Shop.html code VS CODE

		final String URL = "file:///D:/visual%20studio%20code.net/Mobile%20Shop.html";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(URL);

		// Example:1= Xpath Function =>> Contains() function on the basis of type
		WebElement function = driver.findElement(By.xpath("//*[contains(@type,\"text\")][1]"));
		function.sendKeys("Screen Guard");

		Thread.sleep(2000);
		// Example:2= X path function = Contains() function on the basis of name
		WebElement function2 = driver.findElement(By.xpath("//*[contains(@name,\"u\")]"));
		function2.sendKeys("Ajay Ghoti");

		Thread.sleep(2000);


		driver.quit();

	}
	
	public static void chroPathText() throws InterruptedException {
		// File used Mobile Shop.html code VS CODE

		final String URL = "file:///D:/visual%20studio%20code.net/Mobile%20Shop.html";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(URL);

		// X path function = text()
		WebElement function3 = driver.findElement(By.xpath("//a[text()=\"Visit Amazon\"]"));
		function3.click();
		Thread.sleep(2000);

		driver.quit();

	}
	public static void chroPathStarts_with() throws InterruptedException {
		// File used Mobile Shop.html code VS CODE

		final String URL = "file:///D:/visual%20studio%20code.net/Mobile%20Shop.html";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(URL);

		
		//Xpath function using start-with()
		driver.findElement(By.xpath("//*[starts-with(@id,'in')][3]")).sendKeys("12345");

		Thread.sleep(3000);

		driver.quit();

	}
	public static void chroPathFunction() throws InterruptedException {
		// File used Mobile Shop.html code VS CODE

		final String URL = "file:///D:/visual%20studio%20code.net/Mobile%20Shop.html";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(URL);

		// Example:1= Xpath Function =>> Contains() function on the basis of type
		WebElement function = driver.findElement(By.xpath("//*[contains(@type,\"text\")][1]"));
		function.sendKeys("Screen Guard");

		Thread.sleep(2000);
		// Example:2= X path function = Contains() function on the basis of name
		WebElement function2 = driver.findElement(By.xpath("//*[contains(@name,\"u\")]"));
		function2.sendKeys("Ajay Ghoti");

		Thread.sleep(2000);

		// Example:3 = Xpath function using start-with()
		driver.findElement(By.xpath("//*[starts-with(@id,'in')][3]")).sendKeys("12345");

		Thread.sleep(3000);

		// Example:4 = X path function = text()
		WebElement function3 = driver.findElement(By.xpath("//a[text()=\"Visit Amazon\"]"));
		function3.click();
		Thread.sleep(2000);

		driver.quit();

	}


	public static void main(String[] args) throws InterruptedException {
		//chroPathContains();
		//chroPathText();
		//chroPathStarts_with();
		chroPathFunction();

	}

}

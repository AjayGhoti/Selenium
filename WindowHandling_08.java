package com.agg.allAssignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling_08 {
	
	public static void windowHandling() throws InterruptedException {
		// Use 9.Window.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step:1=>> Open the web site and get the main window handle
		driver.get("http://127.0.0.1:5500/9_Window.html");
		Thread.sleep(3000);
		String originalWindow = driver.getWindowHandle();
		System.out.println("Window of Selenium main Handle Id : " + originalWindow);
		
		// Step2: Click on the anchor tag
		WebElement link = driver.findElement(By.linkText("Go to DashBoard"));
		link.click();
		Thread.sleep(3000);
		
		//step3: Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		//Step4: click the check balance alert button and accept the alert
		driver.findElement(By.xpath("//button[contains(text(),\"Check Balance\")]")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		System.out.println("Alert Text is"+ alert.getText());
		Thread.sleep(3000);
		 driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		
		windowHandling();

	}

}

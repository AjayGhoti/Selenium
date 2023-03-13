package com.agg.allAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick_17 {
	
	public static void doubleClick() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		Thread.sleep(1000);

		// switch to frame
		driver.switchTo().frame("iframeResult");

		// step2: inspect the element and get its xpath
		WebElement para = driver.findElement(By.xpath("/html[1]/body[1]/p[1]"));
		Thread.sleep(1000);
		Actions action = new Actions(driver);

		action.doubleClick(para).perform();

		Thread.sleep(2000);
		driver.quit();
	}


	public static void main(String[] args) throws InterruptedException {
		doubleClick();
	}

}

package com.agg.allAssignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick_16 {
	
	public static void rightClick() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(1000);

		// step2: inspect the element and get its xpath
		WebElement contextBtn = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Thread.sleep(1000);
		Actions action = new Actions(driver);

		// Perform the right click operation
		action.contextClick(contextBtn).perform();

		// Select the option from manu
		driver.findElement(By.xpath("//body/ul[1]/li[3]")).click();

		// click on alert button
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(2000);
		driver.quit();
	}


	public static void main(String[] args) throws InterruptedException {
		rightClick();

	}

}

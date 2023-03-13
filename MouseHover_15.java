package com.agg.allAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_15 {
	
	public static void mouseHover() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		// String myXpath = "//*[@id=\"nav-link-amazonprime\"]/span[1]";
		String myXpath = "//span[normalize-space()='Prime']";
		WebElement prime = driver.findElement(By.xpath(myXpath));

		Actions action = new Actions(driver);
		// action.moveToElement(prime).build().perform();
		// call the perform directly(it will internally build it and then perform
		action.moveToElement(prime).perform();

		// Build the action first and then call the perform
		Action act = action.moveToElement(prime).build();
		act.perform();

		Thread.sleep(2000);
		driver.quit();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

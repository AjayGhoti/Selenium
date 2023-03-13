package com.agg.allAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonMethod_05 {
	
	public static void radioButtonMethod() throws InterruptedException {
		// Use 6.radio Button file:radio button class.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/6_radio%20button/6.Radio%20Button%20Class/radio%20button%20class.html");

		Thread.sleep(2000);

		// Example:1==>> isSelected() Method
		WebElement radiomi = driver.findElement(By.id("mi"));
		boolean selectstatemi = radiomi.isSelected();

		// performing click operation only if element is not selected
		if (selectstatemi == false) {
			radiomi.click();
		} else {
			System.out.println("Element is selected");
		}

		Thread.sleep(2000);

		// Example 2: isDisplay()
		WebElement radiogt = driver.findElement(By.id("gt"));
		boolean selectstategt = radiogt.isDisplayed();

		// performing click operation only if element is display but not selected then
		// perform click operation
		if (selectstategt == true) {
			radiogt.click();
		} else {
			System.out.println("Element is not display");
		}

		// Example 3: isEnable()
		WebElement radiorcb = driver.findElement(By.id("rcb"));
		boolean selectstatercb = radiorcb.isEnabled();

		// performing click operation only if element is display but not selected then
		// perform click operation
		if (selectstatercb == true) {
			radiorcb.click();
		} else {
			System.out.println("Radio Button RCB is Disabled");
		}

		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		radioButtonMethod();

	}

}

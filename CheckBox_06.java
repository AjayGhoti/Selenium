package com.agg.allAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox_06 {
	
	public static void checkBox() throws InterruptedException {
		// Use 6.radio Button file:radio button class.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/check%20Box.html");

		Thread.sleep(2000);
		System.out.println("<<<<<<=Example 1: Favorite Fruite =>>>>>>> ");

		WebElement element = driver.findElement(By.id("i_orange"));
		element.click();
		System.out.println("Orange is Selected: " + element.isSelected());
		Thread.sleep(2000);

		element = driver.findElement(By.id("i_banana"));
		// this element can't store the value of orange and it override by banana
		element.click();
		System.out.println("Banana is Selected: " + element.isSelected());
		Thread.sleep(2000);

		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		checkBox();
	}

}

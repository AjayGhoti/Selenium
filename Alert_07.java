package com.agg.allAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_07 {

	public static void alertConfirm() throws InterruptedException {
		// Use 6.radio Button file:DropDown.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/8_DropDown.html");

		// Step 1.Locate the alert button and perform click operation WebElement
		WebElement showAlertButton = driver.findElement(By.xpath("//button[contains(text(),'Show Alert')]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", showAlertButton);

		showAlertButton.click();
		System.out.println("This my required alert Button");
		Thread.sleep(2000);

		// step2. Show the alert "ok" Button

		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("Alert Text Is : " + msg);
		alert.accept();
		Thread.sleep(2000);
		
		// Step3: Locate the Confirm alert button and perform click operation
		WebElement showConfirmButton = driver.findElement(By.xpath("//button[contains(text(),'Show Confirm')]"));
		JavascriptExecutor e1 = (JavascriptExecutor) driver;
		e1.executeScript("arguments[0].click();", showConfirmButton);

		Thread.sleep(2000);

		// step4. Show the alertCONFIRM BUTTON "ok" Button
		Alert alertConfirm = driver.switchTo().alert();
		String msg1 = alertConfirm.getText();
		System.out.println("Alert Text Is : " + msg1);
		alertConfirm.dismiss();
		System.out.println("We Press cancel button");
		Thread.sleep(2000);

		Thread.sleep(5000);

		driver.quit();
	}

	public static void alertPrompt() throws InterruptedException {
		// Use 6.radio Button file:DropDown.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/8_DropDown.html");

		// Locate the prompt alert button and sendkey() and perform on click
		driver.findElement(By.xpath("//button[contains(text(),'Show Prompt')]")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("ajay");
		alert.accept();
		Thread.sleep(5000);

		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// alertConfirm();
		alertPrompt();

	}

}

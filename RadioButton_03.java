package com.agg.allAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton_03 {
	
	public static void radioButtonDemo() throws InterruptedException {
		// Use 6.radio Button file:radio button class.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/6_radio%20button/6.Radio%20Button%20Class/radio%20button%20class.html");

		Thread.sleep(2000);

		WebElement radioEle1 = driver.findElement(By.id("kkr"));
		radioEle1.click();
		Thread.sleep(2000);

		driver.quit();

	}
	
	public static void radioButtonPractice() throws InterruptedException {
		// Use 6.radio Button file:radiobutton.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/6_radio%20button/radibutton1.html");
		/*
		 * Below code: Shows an intractable Exception because radio button operated with
		 * label so to locate an element with help of input id can't be possible so, to
		 * locate an element we use Full Xpath
		 */
//  	    WebElement radioEle1 = driver.findElement(By.id("radio2"));
//  		radioEle1.click();
//		    Thread.sleep(2000);

		WebElement radioEle2 = driver.findElement(By.xpath("/html/body/div/div[1]/label"));
		radioEle2.click();

		Thread.sleep(2000);
		WebElement radioEle3 = driver.findElement(By.xpath("//input[@id=\"radio2\" and @type=\"radio\"]"));
		radioEle3.click();

		WebElement radioEle4 = driver.findElement(By.xpath("/html/body/div/div[4]/label"));
		radioEle4.click();
		Thread.sleep(2000);

		driver.quit();

	}



	public static void main(String[] args) throws InterruptedException {
		//radioButtonDemo();
		radioButtonPractice();
	}

}

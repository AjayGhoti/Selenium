package com.agg.allAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton_04 {
	
	public static void radioButtonClass() throws InterruptedException {
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
		// name of the all the team is same so when we locate the element with the of
		// name it select first element
		WebElement radioEle2 = driver.findElement(By.name("ipl-teams"));
		radioEle2.click();
		Thread.sleep(2000);

		WebElement radioEle3 = driver.findElement(By.cssSelector("#gt"));
		radioEle3.click();
		Thread.sleep(2000);

		WebElement radioEle4 = driver.findElement(By.xpath("//*[contains(@name,\"ipl-teams\")][3]"));
		radioEle4.click();
		Thread.sleep(2000);

		WebElement radioEle5 = driver.findElement(By.xpath("/html/body/input[5]"));
		radioEle5.click();
		Thread.sleep(2000);

		driver.quit();

	}


	public static void main(String[] args) throws InterruptedException {
		radioButtonClass();

	}

}

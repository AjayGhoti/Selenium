package com.agg.allAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoDatePicker_14 {
	
	public static void autoDPString() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://jqueryui.com/datepicker/");

		// Set the Expected Day,month and year
		String Month = "March";
		String Year = "2022";
		String Day = "5";

		// Switch to the frame and send the string value
		driver.switchTo().frame(0);

		// select and click on the date picker control
		driver.findElement(By.xpath(" //input[@id='datepicker']")).click();
		Thread.sleep(2000);

		int yearNum = Integer.parseInt(Year);
		// check the selected year is previous year or feature year
        String myXpath ="";
		if (yearNum <= 2022) {
			myXpath ="//span[contains(text(),'Prev')]";
		}else {
			myXpath ="//span[contains(text(),'Next')]";
		}

		while (true) {
			// Read the month and year
			String m = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String y = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			// compare with the expected data use if statement
			if (m.equals(Month) && y.equals(Year)) {
				break;
			}
			
				driver.findElement(By.xpath(myXpath)).click();
		}
		// Select the day
		List<WebElement> days = driver.findElements(By.xpath("//body/div[@id='ui-datepicker-div']/table[1]//td"));
		for (WebElement d : days) {
			String e = d.getText();
			if (e.equals(Day)) {
				d.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		autoDPString();
	}

}

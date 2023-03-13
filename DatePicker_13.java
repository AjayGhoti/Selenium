package com.agg.allAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_13 {

	public static void datePickersendkey() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		/*
		 * // Step1: Open the web site and get the main window handle
		 * driver.get("http://127.0.0.1:5500/11_Table.html");
		 * driver.findElement(By.xpath(" //input[@id='datepicker']")).sendKeys(
		 * "05/03/2023"); Thread.sleep(2000);
		 */

		// Step:2: Send value to the data picker in the form of string
		driver.get("https://jqueryui.com/datepicker/");

		// Switch to the frame and send the string value
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(" //input[@id='datepicker']")).sendKeys("03/05/2023"); // mm/dd/yyyy
		Thread.sleep(2000);

		// driver.quit();
	}

	public static void datePickerDemo() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://jqueryui.com/datepicker/");

		// Set the Expected Day,month and year
		String Month = "March";
		String Year = "2023";
		String Day = "5";

		// Switch to the frame and send the string value
		driver.switchTo().frame(0);

		// select and click on the date picker control
		driver.findElement(By.xpath(" //input[@id='datepicker']")).click();
		Thread.sleep(2000);

		while (true) {
			// Read the month and year
			String m = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String y = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			// display month and year on the console
			System.out.println(m);
			System.out.println(y);

			// compare with the expected data use if statement
			if (m.equals(Month) && y.equals(Year)) {
				break;
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
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

		Thread.sleep(3000);
		driver.quit();
	}

	public static void datePickerNext() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://jqueryui.com/datepicker/");

		// Set the Expected Day,month and year
		String Month = "May";
		String Year = "2024";
		String Day = "20";

		// Switch to the frame and send the string value
		driver.switchTo().frame(0);

		// select and click on the date picker control
		driver.findElement(By.xpath(" //input[@id='datepicker']")).click();
		Thread.sleep(2000);

		while (true) {
			// Read the month and year
			String m = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String y = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			// display month and year on the console
			System.out.println(m);
			System.out.println(y);

			// compare with the expected data use if statement
			if (m.equals(Month) && y.equals(Year)) {
				break;
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
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
		driver.quit();
	}

	public static void datePickerPrev() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://jqueryui.com/datepicker/");

		// Set the Expected Day,month and year
		String Month = "September";
		String Year = "2021";
		String Day = "10";

		// Switch to the frame and send the string value
		driver.switchTo().frame(0);

		// select and click on the date picker control
		driver.findElement(By.xpath(" //input[@id='datepicker']")).click();
		Thread.sleep(2000);

		while (true) {
			// Read the month and year
			String m = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String y = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			// display month and year on the console
			System.out.println(m);
			System.out.println(y);

			// compare with the expected data use if statement
			if (m.equals(Month) && y.equals(Year)) {
				break;
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
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
		// driver.quit();
	}

	public static void autoDatePickerflag() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://jqueryui.com/datepicker/");

		// Set the Expected Day,month and year
		String Month = "March";
		String Year = "2023";
		String Day = "5";

		// Switch to the frame and send the string value
		driver.switchTo().frame(0);

		// select and click on the date picker control
		driver.findElement(By.xpath(" //input[@id='datepicker']")).click();
		Thread.sleep(2000);

		int yearNum = Integer.parseInt(Year);
		// check the selected year is previous year or feature year

		// fix the one button prev or next
		boolean prev = false;

		if (yearNum <= 2022) {
			prev = true;
		}

		while (true) {
			// Read the month and year
			String m = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String y = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			// compare with the expected data use if statement
			if (m.equals(Month) && y.equals(Year)) {
				break;
			}
			if (prev) {
				driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			} else {
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			}

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
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// datePickersendkey();
		// datePickerDemo();
		// datePickerNext();
		// datePickerPrev();
		 autoDatePickerflag();

	}

}

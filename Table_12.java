package com.agg.allAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table_12 {

	public static void printTableElementPractice() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("http://127.0.0.1:5500/11_Table.html");

		// Step2: Total Number of columns
		List<WebElement> a = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		int c = a.size();
		System.out.println("Number of Columns: " + c);

		// Step: Total Number of rows Except Header row
		List<WebElement> b = driver.findElements(By.xpath("//table/tbody/tr"));
		int r = b.size();
		System.out.println("Number of Rows: " + r);

		for (int i = 1; i <= r; i++) {// row increment

			for (int j = 1; j <= c; j++) {
				System.out.print(
						driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[" + i + "]/td[" + j + "]"))
								.getText() + "         ");

			}
			System.out.println();
		}

	}

	public static void printStatusValidationPrac() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("http://127.0.0.1:5500/11_Table.html");

		// Step2: Total Number of rows Except Header row
		List<WebElement> b = driver.findElements(By.xpath("//table/tbody/tr"));
		int rows = b.size();
		System.out.println("Number of Rows: " + rows);

		int StatusCount = 0;

		for (int i = 1; i <= rows; i++) {// row increment

			String status = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[5]")).getText();

			if (status.equals("Enabled")) {
				StatusCount = StatusCount + 1;
			} else {
				System.out.println("Number of Employess Disabled:  " + (rows - StatusCount));
			}

		}
		System.out.println("Number of Employess Enabled:  " + StatusCount);
		driver.close();
	}

	public static void printSalaryColumnPrac() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("http://127.0.0.1:5500/11_Table.html");

		// Step2: Total Number of rows Except Header row
		List<WebElement> salary = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));

		System.out.println("Number of Rows: " + salary.size());

		int sum = 0;

		for (int i = 0; i < salary.size(); i++) {// row increment

			sum = sum + Integer.parseInt(salary.get(i).getText());
			System.out.println((i + 1) + ">>" + salary.get(i).getText());

		}
		System.out.println(sum);
	}

	public static void maxsalaryPrac() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("http://127.0.0.1:5500/11_Table.html");

		// Step2: Total Number of rows Except Header row
		List<WebElement> salary = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));

		System.out.println("Number of Rows: " + salary.size());

		int max = 0;
		for (int i = 0; i < salary.size(); i++) {// row increment

			int no = Integer.parseInt(salary.get(i).getText());

			if (no >= max) {
				max = no;
			}

		}
		System.out.println("maximum number is " + max);
	}

	public static void dynamicTable() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://stats.espncricinfo.com/ci/content/records/283235.html");
		Thread.sleep(2000);

		// Step2: Locate the number of columns
		List<WebElement> columns = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("Total Columns : " + columns.size());
		Thread.sleep(2000);

		// Step2: Locate the number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Total Rows : " + rows.size());
		Thread.sleep(2000);
		/*
		 * // step3: To get the text data of All Rows in the table for (int i = 0; i <
		 * rows.size(); i++) { System.out.println((i + 1) + "  >>>>>  " +
		 * rows.get(i).getText()); }
		 */
		// step4: To get the text data of odd number rows Rows in the table except
		// unwanted
		int c = 1;
		for (int i = 0; i < rows.size(); i += 2, c++) {
			System.out.println(c + ">>>>>" + rows.get(i).getText());
		}
		driver.quit();

	}

	public static void cAndrTable() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://stats.espncricinfo.com/ci/content/records/283235.html");

		// Step2: Total Number of columns
		List<WebElement> a = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		int c = a.size();
		System.out.println("Number of Columns: " + c);

		// Step: Total Number of rows Except Header row
		List<WebElement> b = driver.findElements(By.xpath("//table/tbody/tr"));
		int r = b.size();
		System.out.println("Number of Rows: " + r);

		int d = 1;

		for (int i = 1; i <= r; i += 2, d++) {// row increment

			String status = driver.findElement(By
					.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[1]"))
					.getText();
			System.out.println(d + ">>>>" + status);

		}

		System.out.println();
	}

	public static void printIndianWomen() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://stats.espncricinfo.com/ci/content/records/283235.html");

		// Step2: Locate the number of columns
		List<WebElement> columns = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("Total Columns : " + columns.size());
		Thread.sleep(2000);

		// Step2: Locate the number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Total Rows : " + rows.size());
		Thread.sleep(2000);

		int c = 1;
		for (int i = 0; i < rows.size(); i += 2, c++) {
			if (rows.get(i).getText().contains("India Women"))
				System.out.println(c + ">>>>>" + rows.get(i).getText());
		}
		driver.quit();

	}

	public static void totalMatches() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://stats.espncricinfo.com/ci/content/records/283235.html");

		// Step2: Locate the number of rows and second match column
		List<WebElement> match = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		System.out.println("Total Rows : " + match.size());
		Thread.sleep(2000);

		int total = 0;
		for (int i = 0; i < match.size(); i++) {

			total = total + Integer.parseInt(match.get(i).getText());
			System.out.println((i + 1) + ">>" + match.get(i).getText());
		}
		System.out.println(total);

	}

	public static void main(String[] args) throws InterruptedException {
		// printTableElementPractice();
		// printStatusValidationPrac();
		// printSalaryColumnPrac();
		// maxsalaryPrac();
		// dynamicTable();
		// cAndrTable();
		// printIndianWomen();
		totalMatches();

	}

}

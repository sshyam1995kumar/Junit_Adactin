package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;

	public static void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sshya\\eclipse-workspace111\\MavenTest\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	public static void loadurl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void fillText(WebElement e, String send) {
		e.sendKeys(send);
	}

	public static void click(WebElement clk) {
		clk.click();
	}

	public static String getFromExcel(String sheet, int row, int cell) throws Throwable {
		String value = null;
		File loc = new File("C:\\Users\\sshya\\eclipse-workspace111\\MavenTest\\excel_file\\testdata.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int type = c.getCellType();
		if (type == 1) {
			value = c.getStringCellValue();

		} else if (type == 0) {

			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat si = new SimpleDateFormat("dd/mm/yyyy");
				value = si.format(dateCellValue);

			} else {
				double numericCellValue = c.getNumericCellValue();
				// type casting double to long
				long l = (long) numericCellValue;
				value = String.valueOf(l);

			}
		}
		return value;

	}

	public static void dropdown(WebElement e, String a) {
		Select s = new Select(e);
		s.selectByVisibleText(a);
	}

	public static void orderNo(WebElement e, String sheet, int row, int cell) throws Throwable {
		String string = e.getAttribute("value");
		System.out.println("Order no:" + string);

		File loc = new File("C:\\Users\\sshya\\eclipse-workspace111\\MavenTest\\excel_file\\testdata.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		c.setCellValue(string);
		FileOutputStream o = new FileOutputStream(loc);

		w.write(o);

	}

}

package com.HRMS.testbase;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.HRMS.utils.ConfigsReader;
import com.HRMS.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver setUp(){
	ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
	switch (ConfigsReader.getProperty("browser").toLowerCase()) {

		case "chrome":
			System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY ,"true");
			WebDriverManager.chromedriver().setup();
			ChromeOptions co= new ChromeOptions();

			String b = ConfigsReader.getProperty("headless");
			if(b.equalsIgnoreCase("true")) {
				co.setHeadless(true);
				driver = new ChromeDriver(co);
			}else {
				driver = new ChromeDriver();
			}
	
			
			driver.manage().window().maximize();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Browser is not supported");
		}

		// driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(ConfigsReader.getProperty("url"));
		// initialize all page objects as part of setup
		PageInitializer.initialize();

		return driver;

	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}		
	}
}

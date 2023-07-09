package com.spicejet.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public PageBase() throws IOException {
		
		prop=new Properties();
		FileInputStream fi=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Batn23\\BlessingsBatch23Framework\\src\\main\\java\\com\\spicejet\\qa\\configurations\\config.properties");
		prop.load(fi);
		
	}
	public void setUp(String browserName, String url) {
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\batch23\\chromedriver.exe");
			 driver = new ChromeDriver();	
		}
		else if(browserName.equals("IE")) {
			
		}
		else {
			System.out.println("sorry currently we are not supporting this browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	public void teatDown() {
		driver.quit();
	}

}

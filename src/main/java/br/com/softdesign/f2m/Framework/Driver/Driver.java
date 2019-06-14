package br.com.softdesign.f2m.Framework.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	public static WebDriver ChromeDriver() {
		System.getProperty("webdriver.chrome.driver", "./chromedriver.exe");
		return new ChromeDriver();
	}
}

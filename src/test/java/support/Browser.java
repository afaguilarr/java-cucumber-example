package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.AbstractDriverOptions;

public class Browser {
	
	public static WebDriver launch() {
		switch (System.getProperty("browser")) {
			case "firefox" -> {
				WebDriverManager.firefoxdriver().setup();
				return new FirefoxDriver();
			}
			case "chrome" -> {
				WebDriverManager.chromedriver().setup();
				if(System.getProperty("headless").equals("--headless")) {
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--headless");
					return new ChromeDriver(options);
				}
				return new ChromeDriver();
			}
			case "ie" -> {
				WebDriverManager.iedriver().setup();
				return new InternetExplorerDriver();
			}
			default -> throw new RuntimeException("Unrecognized browser");
		}
	}
}

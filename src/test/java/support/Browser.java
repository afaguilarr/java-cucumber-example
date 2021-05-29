package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	public static WebDriver launch() {
		switch (System.getProperty("browser")) {
			case "firefox" -> {
				WebDriverManager.firefoxdriver().setup();
				return new FirefoxDriver();
			}
			case "chrome" -> {
				WebDriverManager.chromedriver().setup();
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

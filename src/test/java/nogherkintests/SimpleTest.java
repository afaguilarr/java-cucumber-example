package nogherkintests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import support.Browser;

public class SimpleTest {

  @Test
  public void sometest() {
    //http://www.seleniumhq.org/download/maven.jsp
    //https://code.google.com/p/selenium/wiki/GettingStarted
    
    WebDriver driver = Browser.launch();
    driver.get("https://www.google.com");
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("Cheese!");
    element.submit();
    System.out.println("Page title is: " + driver.getTitle());
    driver.quit();
  }
  
}

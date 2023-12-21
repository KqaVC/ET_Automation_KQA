package tests.module1;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewTest1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEveryticket() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1920,912 | ]]
    driver.get("https://mvp.everyticket.in/");
    
  
	
    
    driver.findElement(By.xpath("*//button[@class='sign-in-btn ng-star-inserted']")).click();
    Thread.sleep(2000);
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=app-root, app-header, button]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-all-login, input]]
  //  driver.findElement(By.xpath("//input[@placeholder = \"Continue with mobile number\"]")).clear();
    driver.findElement(By.xpath("//input[@placeholder = \"Continue with mobile number\"]")).sendKeys("9586808250");
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-all-login, button[type="submit"]]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-all-login, input]]
    driver.findElement(By.xpath("//input[@placeholder = \"Enter password\"]")).clear();
    driver.findElement(By.xpath("//input[@placeholder = \"Enter password\"]")).sendKeys("Asd@1234");
    driver.findElement(By.xpath("//input[@placeholder = \"Enter password\"]")).sendKeys(Keys.ENTER);
    // ERROR: Caught exception [unknown command [typeSecret]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=app-root, app-header, button[type="button"] > div:nth-of-type(1)]]
    driver.findElement(By.xpath("//*[text() = \"Sign Out\"]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

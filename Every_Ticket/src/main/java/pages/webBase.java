package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.Status;

import ListenerSetup.ExtentTestManager;
import ListenerSetup.Screen;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.TestUtil;

public class webBase {

	public static WebDriverWait wait;
	public static WebDriver driver;
	// private static String driverPath = "D:\\chromedriver_win32\\";
	public static Properties prop;
	public static Screen ss;
	String URL1 = null;
	boolean Flag = false;
	boolean Quit = false;

	public webBase() {

		if (Flag == false) {
			URL1 = "/src/main/java/config/config.properties";
		} else {
			URL1 = "/src/main/java/config/config2.properties";
		}
		try {

			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + URL1);

			prop = new Properties();
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void setDriver(String browserType, String appURL) throws InterruptedException {
		switch (browserType) {
		case "chrome":
			initChromeDriver(appURL);
			break;
		case "firefox":
			initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			initFirefoxDriver(appURL);
		}
	}

	private static void initChromeDriver(String appURL) throws InterruptedException {
		System.out.println("Launching google chrome with new profile..");

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();

		driver.manage().window().maximize();

		driver.navigate().to(appURL);
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	}

	private static void initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.gecko.driver", prop.getProperty("driverPath") + "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);

	}

	@BeforeClass
	public void initializeTestBaseSetup() {
		try {
			setDriver(prop.getProperty("browserType"), prop.getProperty("appURL"));

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}

	@AfterClass
	public void tearDown() {
		if (Quit == true) {
			driver.quit();
		}

	}

	public WebDriver getDriver() {
		return driver;
	}

	public void SnapShot() throws InterruptedException {
		ss = new Screen();
		Thread.sleep(600);
		ss.Screnshot();
	}

	public void SnapShot_And_Step(String Steps) throws InterruptedException {
		ss = new Screen();
		Thread.sleep(600);
		ss.Screnshot_With_Step(Steps);

	}

	public void Step(int i, String Steps) {
		ExtentTestManager.getTest().log(Status.INFO, "<b>Step-" + i + "</b>: " + Steps + "");
	}

	public void Result(int i, String Result) {
		if (i == 0) {
			ExtentTestManager.getTest().log(Status.INFO, "<b>Result-</b>: " + Result + "");
		} else {
			ExtentTestManager.getTest().log(Status.INFO, "<b>Result-" + i + "</b>: " + Result + "");
			i++;
		}
	}

}

package pages;

import static org.testng.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import ListenerSetup.ExtentTestManager;
import io.appium.java_client.windows.WindowsDriver;

public class ReusableMethod extends webBase {

	public String fileSeperator = System.getProperty("file.separator");
	public String NTestData = System.getProperty("user.dir") + fileSeperator + "TestData" + fileSeperator + "NTestData"
			+ fileSeperator;

	// Open Project Dialog.
	@FindBy(xpath = ".//*[@Name='Open Project']")
	public WebElement btn_OpenProject;

	@FindBy(xpath = ".//*[@Name='Open Project ...  Ctrl+O']")
	public WebElement btn_OpenProject_Classic;

	@FindBy(xpath = ".//*[@AutomationId='1843']")
	public WebElement Dropdown_SelectProject_to_open;

	@FindBy(xpath = ".//*[@AutomationId='1']")
	public WebElement btn_OpenProject_OK;

	// Login to IGiS dialog.
	@FindBy(xpath = ".//*[@AutomationId='1643']")
	public WebElement txtBox_username;

	@FindBy(xpath = ".//*[@AutomationId='1596']")
	public WebElement txtBox_password;

	@FindBy(xpath = ".//*[@AutomationId='1167']")
	public WebElement btn_rememberme;

	@FindBy(xpath = ".//*[@AutomationId='1']")
	public WebElement btn_login;

	// Close Project Method Xpaths.
	@FindBy(xpath = ".//*[@Name='File']")
	public WebElement btn_Tab_File;

	@FindBy(xpath = ".//*[@Name='Close Project']")
	public WebElement btn_CloseProject;

	@FindBy(xpath = ".//*[@AutomationId='6']")
	public WebElement btn_SaveChanges_Yes;

	@FindBy(xpath = ".//*[@AutomationId='7']")
	public WebElement btn_SaveChanges_No;

	@FindBy(xpath = "*//button[@class='sign-in-btn ng-star-inserted']")
	public WebElement Btn_SignIn;

	@FindBy(xpath = "*//span[@class='mr-auto']")
	public WebElement Btn_Countinue_With_Email;

	@FindBy(xpath = "*//input[@aria-label='Search']")
	public WebElement Txb_EmailId;

	@FindBy(xpath = "*//button[@type='submit']")
	public WebElement Btn_Login;

	@FindBy(xpath = "*//img[@alt='Hologram Introduction Tour']")
	public WebElement Banner;

	@FindBy(xpath = "*//input[@placeholder='Continue with mobile number']")
	public WebElement Txb_Mobile_No;

	@FindBy(xpath = "*//button[@type='submit']")
	public WebElement Btn_Submit;

	@FindBy(xpath = "*//input[@placeholder='Enter password']")
	public WebElement Txb_Entr_Pass;

	@FindBy(xpath = "*//button[@type='submit']")
	public WebElement Btn_Contin;

	@FindBy(xpath = "*//div[@class='cdk-overlay-container']")
	public WebElement Succe;

	@FindBy(xpath = "*//div[@class='flex items-center space-x-2']")
	public WebElement profile;

	@FindBy(xpath = "*//simple-snack-bar[@class=\"mat-mdc-simple-snack-bar ng-star-inserted\"]")
	public WebElement Pop_login_Succ;

	@FindBy(xpath = "*//div[@class='font-medium dark:text-black text-xs md:text-sm md:block']")
	public WebElement Drp_Profile;

	@FindBy(xpath = "*//simple-snack-bar[@class='mat-mdc-simple-snack-bar ng-star-inserted']")
	public WebElement Pop_Logout;

	@FindBy(xpath = "*//a[@class='sign-out-btn']")
	public WebElement Btn_Sign_out;

	///////////////////////// ******ADMIN******/////////////////////////

	@FindBy(xpath = "*//input[@id='mat-input-0']")
	public WebElement TxbA_UsrName;

	@FindBy(xpath = "*//input[@id='mat-input-1']")
	public WebElement TxbA_Password;

	@FindBy(xpath = "*//span[@class='mdc-button__label']")
	public WebElement BtnA_Login;

	@FindBy(xpath = "*//div[contains(text(),' Logged in successfully')]")
	public WebElement MsgA_Login_Success;

	public ReusableMethod() {
		// this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	public ReusableMethod(WindowsDriver driver1) {
		// this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver1, this);
	}

	/**
	 * Enter Project name as a "String" to open Existing Project in IGiS.
	 * 
	 */
	/*
	 * public void openProject(String projectname) throws InterruptedException {
	 * Thread.sleep(1500); //
	 * driver.findElementByXPath(".//*[@Name='File']").click();
	 * 
	 * btn_OpenProject.click(); Thread.sleep(2000);
	 * Dropdown_SelectProject_to_open.sendKeys(projectname);
	 * btn_OpenProject_OK.click(); try { txtBox_username.sendKeys();
	 * txtBox_password.sendKeys(); btn_rememberme.click(); btn_login.click();
	 * 
	 * } catch (Exception e) { }
	 * 
	 * }
	 */

	public void Sign_In_User() throws InterruptedException {
		Thread.sleep(2000);

		Thread.sleep(2000);
		Btn_SignIn.click();
		 

		Btn_Countinue_With_Email.click();

		 
		Txb_EmailId.click();

		Txb_EmailId.clear();

		Txb_EmailId.sendKeys("kishan.joshi@viitor.cloud");
		 

		Btn_Login.click();
	}

	public void Sign_In_Mo() throws InterruptedException {
		

		Btn_SignIn.click();
		 

		Txb_Mobile_No.sendKeys("9586808250");
		 

		Btn_Submit.click();

		 

		Txb_Entr_Pass.sendKeys("Asd@1234");

		 

		Btn_Contin.click();

		eLement_vIsible(Pop_login_Succ);

	}

	public void eLement_vIsible(WebElement eLement) {
		wait.until(ExpectedConditions.visibilityOf(eLement));
	}

	public void eLement_IN_vIsible(WebElement eLement) {
		wait.until(ExpectedConditions.invisibilityOf(eLement));
	}

	public void Signout() throws InterruptedException {
		eLement_IN_vIsible(Pop_login_Succ);

		 


		Drp_Profile.click();
		 

		Btn_Sign_out.click();

		eLement_vIsible(Pop_Logout);
		 

	}

	public void Excel_Data_Driver(String SheetName, int Row, int Column, WebElement Ele)
			throws InterruptedException, IOException {
		File file = new File("C:\\Users\\Kishan Joshi\\Downloads\\Kishan.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook a = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = a.getSheet(SheetName);

		Row row = sheet.getRow(Row);
		Cell cell = row.getCell(Column);
		// String Title = cell.getStringCellValue();

		DataFormatter formatter = new DataFormatter(); // creating formatter using the default locale
		// Cell cell = sheet.getRow(i).getCell(0);
		String Title = formatter.formatCellValue(cell);

		Ele.sendKeys(Title);
		Thread.sleep(2000);

	}

	public void Excel_Data_Driver_int(String SheetName, int Row, int Column, WebElement Ele)
			throws InterruptedException, IOException {
		File file = new File("C:\\Users\\Kishan Joshi\\Downloads\\Kishan.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook a = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = a.getSheet(SheetName);

		Row row = sheet.getRow(Row);
		Cell cell = row.getCell(Column);
		String Title = cell.getStringCellValue();

		Ele.sendKeys(String.valueOf(Title));
		/*
		 * Ele.sendKeys(Title); Thread.sleep(2000);
		 */

	}

	public void Admin_SignIn() throws InterruptedException {

		TxbA_UsrName.sendKeys("demo@gmail.com");
		SnapShot_And_Step("Entered the user id in the field.");

		TxbA_Password.sendKeys("Artforlife@123");
		SnapShot_And_Step("Entered password in the field.");
		
		BtnA_Login.click();
		Thread.sleep(1000);
		SnapShot_And_Step("Logged in successfully to the admin panel.");

	}

	public void Scroll_Untill_Elmnt(WebElement Ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Ele);
	}
}

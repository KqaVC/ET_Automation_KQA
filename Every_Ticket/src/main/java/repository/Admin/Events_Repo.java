package repository.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.webBase;

public class Events_Repo extends webBase {

	public Events_Repo() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "*//span[contains(text(),'Events')]")
	public WebElement BtnA_Events;

	@FindBy(xpath = "*//span[contains(text(),'Add')]")
	public WebElement BtnA_Add;

	@FindBy(xpath = "*//input[@id='title']")
	public WebElement TxbA_Title;

	@FindBy(xpath = "*//input[@id='tagLine']")
	public WebElement TxbA_Lable;

	@FindBy(xpath = "*//br[@data-cke-filler=\"true\"]")
	public WebElement TxbA_Description;

	/*
	 * @FindBy(xpath =
	 * "/html/body/app-root/app-pages/div/div/div/app-event-add/div/div/div/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[2]/div/div[1]/mat-form-field/div[1]/div/div[2]/input")
	 * public WebElement TxbA_Venue;
	 */

	@FindBy(xpath = "*//input[@placeholder='Enter a location']")
	public WebElement TxbA_Venue;

	@FindBy(xpath = "*//a[@class='border-animation inline-flex text-base font-semibold text-secondary mt-4 ng-star-inserted']")
	public WebElement BtnA_AdditionalInf;

	// @FindBy(xpath = " *//input[@aria-invalid='false']")
	// public WebElement TxbA_SubVenue;

	@FindBy(xpath = "*//input[@formcontrolname='sub_venue']")
	public WebElement TxbA_SubVenue;

	@FindBy(xpath = "*//input[@id='hours']")
	public WebElement TxtA_Check_In_Min;

	@FindBy(xpath = "//input[@id='mat-mdc-checkbox-2-input']")
	public WebElement ChbA_FulDay_Acs;

	@FindBy(xpath = "*//input[@id='mat-mdc-chip-list-input-0']")
	public WebElement DrpA_Slct_Aminitis;

	@FindBy(xpath = "*//input[@id='mat-mdc-checkbox-133-input']")
	public WebElement ChbA_Do_Yo_WntBanner;

	@FindBy(xpath = "*//input[@id='mat-mdc-checkbox-5-input']")
	public WebElement ChkA_Aminities1;

	@FindBy(xpath = "*//input[@id='mat-mdc-checkbox-6-input']")
	public WebElement ChkA_Aminities2;

	@FindBy(xpath = "*//input[@id='mat-mdc-checkbox-7-input']")
	public WebElement ChkA_Aminities3;

	@FindBy(xpath = "*//input[@id='mat-mdc-checkbox-8-input']")
	public WebElement ChkA_Aminities4;

	// @FindBy(xpath =
	// "/html/body/app-root/app-pages/div/div/app-event-add/mat-tab-group/div/mat-tab-body[1]/div/div/form/mat-card[4]/div/div[1]/div/input")
	// public WebElement BtnA_Brws_Img1;

	@FindBy(xpath = "*//input[@type='file' and @class='absolute w-full h-full top-0 left-0 opacity-0 z-10 cursor-pointer' and @accept='image/jpeg,image/png,image/jpg,image/svg+xml'][1]")
	public WebElement BtnA_Brws_Img1;

	@FindBy(xpath = "/html/body/app-root/app-pages/div/div/app-event-add/mat-tab-group/div/mat-tab-body[1]/div/div/form/mat-card[4]/div/div[2]/div/input")
	public WebElement BtnA_Brws_Img2;

	@FindBy(xpath = "*//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']")
	public WebElement BtnA_Cal;

	@FindBy(xpath = "*//input[@id='mat-mdc-checkbox-133-input']")
	public WebElement chkA_Banner;

	@FindBy(xpath = "*//input[@id='mat-mdc-checkbox-3-input']")
	public WebElement Chkb_HorizonatalBanner;

	@FindBy(xpath = "*//span[@class='mdc-button__label' and text()=' Yes, Make It ']")
	public WebElement Btn_homre_banner;

	@FindBy(xpath = "*//button[@aria-current='date']")
	public WebElement Btn_SelectCurrent_Date;

	@FindBy(xpath = "*//button[@aria-label=\"Next month\"]")
	public WebElement Btn_Next_Month;

	@FindBy(xpath = "*//span[@class='mat-calendar-body-cell-content mat-focus-indicator' and text()=' 5 ']")
	public WebElement Btn_End_Date;

	@FindBy(xpath = "*//p[@class='text-base font-bold text-dark-100 mb-3' and text()=' Select Date Range ']")
	public WebElement Callll;

	// @FindBy(xpath =
	// "/html/body/app-root/app-pages/div/div/app-event-add/mat-tab-group/div/mat-tab-body[1]/div/div/form/mat-card[7]/mat-form-field/div[1]/div[2]/div[1]/mat-datepicker-toggle/button")
	// public WebElement Brn_Booking_Stop;

	@FindBy(xpath = "(//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base' and @aria-label='Open calendar'])[2]")
	public WebElement Brn_Booking_Stop;

	// button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed
	// mat-mdc-button-base' and @aria-label='Open calendar'][2]
	@FindBy(xpath = "*//span[@class='mdc-button__label' and text()=' Next ']")
	public WebElement Btn_Next;

	// evet detail page

	@FindBy(xpath = "*//input[@id='mat-mdc-checkbox-65-input']")
	public WebElement Chkb_AreU_FreeEvet;

	@FindBy(xpath = "*//span[@class='mdc-button__label' and text()=' Add '][1]")
	public WebElement Btn_Add_Of_Event_Type;

	public void Aminities(WebElement ele) throws InterruptedException {
		DrpA_Slct_Aminitis.click();
		Thread.sleep(3000);

		ele.click();
		Thread.sleep(3000);

	}
}

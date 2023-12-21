package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.webBase;

public class SignIn_Repo extends webBase {

	//Trial
	
	@FindBy(xpath = "//input[@id='gsc-i-id1' and @name='search']")
	public WebElement searchbox_javatpoint;
	

	public SignIn_Repo() {
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath = "*//a[@href='https://mvp.everyticket.in/terms-and-conditions' and@class='text-sky-500 underline underline-offset-2 hover:no-underline']")
	public WebElement Link_T_And_C;
	
	@FindBy(xpath = "*//button[@class='sign-in-btn ng-star-inserted']")
	public WebElement Btn_SignIn;
	
	@FindBy(xpath = "*//a[@href='https://mvp.everyticket.in/privacy-policy']")
	public WebElement Link_Policy;
	
	
	@FindBy(xpath = "*//div[@class='container mx-auto ng-star-inserted']")
	public WebElement Text_T_and_C;
	
	
	
	
	@FindBy(xpath = "*//a[@href='https://mvp.everyticket.in/privacy-policy' and@class='text-sky-500 underline underline-offset-2 hover:no-underline']")
	public WebElement TxL_Policy;
	
	
	
	
	
	
	
	
	
}

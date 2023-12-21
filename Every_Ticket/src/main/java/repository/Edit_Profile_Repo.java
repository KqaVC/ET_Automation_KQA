package repository;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.webBase;

public class Edit_Profile_Repo extends webBase

{
	
	public Edit_Profile_Repo() {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "*//a[@routerlink='/edit-profile']")
	public WebElement Btn_Edit_Prfl;
	
	
	
}

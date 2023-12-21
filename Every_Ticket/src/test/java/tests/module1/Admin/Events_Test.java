package tests.module1.Admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ReusableMethod;
import repository.Admin.Events_Repo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Events_Test extends Events_Repo

{

	Events_Repo Sky;
	ReusableMethod reusable;

	@BeforeClass
	public void BeforeClass() throws InterruptedException {
		Sky = new Events_Repo();
		reusable = new ReusableMethod();
		// reusable.Sign_In_Mo();
	}

	@Test(priority = 1, description = "Sing in via mobile number and password.")
	public void Sign_In() throws InterruptedException, IOException {

		reusable.Admin_SignIn();
		reusable.eLement_IN_vIsible(reusable.MsgA_Login_Success);

		Thread.sleep(1000);
		Sky.BtnA_Events.click();
		Step(1, "Clicked on the event menu.");
		SnapShot_And_Step("event page.");

		Thread.sleep(1000);
		Sky.BtnA_Add.click();
		Step(2, "Opened the add event form.");
		SnapShot_And_Step("Event form");

		Thread.sleep(1000);
		reusable.Excel_Data_Driver("NEW", 1, 0, Sky.TxbA_Title);

		Step(3, "Added event title.");
		SnapShot_And_Step("Title added.");

		reusable.Excel_Data_Driver("NEW", 1, 1, Sky.TxbA_Lable);

		Step(4, "Added event lable.");
		SnapShot_And_Step("lable added.");

		reusable.Excel_Data_Driver("NEW", 1, 2, Sky.TxbA_Description);

		Step(5, "Added event description.");
		SnapShot_And_Step("description added.");

		Thread.sleep(1000);

		reusable.Excel_Data_Driver("NEW", 1, 3, Sky.TxbA_Venue);

		Sky.TxbA_Venue.sendKeys(Keys.ARROW_DOWN);

		Sky.TxbA_Venue.sendKeys(Keys.ENTER);

		Step(6, "Added event venue.");
		SnapShot_And_Step("venue added.");

		Thread.sleep(1000);
		Sky.BtnA_AdditionalInf.click();

		Step(7, "Added event additional ionformation.");
		SnapShot_And_Step("Additional ionformation added.");

		Thread.sleep(1000);
		reusable.Excel_Data_Driver("NEW", 1, 4, Sky.TxbA_SubVenue);

		Step(8, "Added event sub venue.");
		SnapShot_And_Step("sub venue added.");

		Thread.sleep(1000);

		reusable.Scroll_Untill_Elmnt(Sky.TxbA_Venue);
		Thread.sleep(1000);

		Sky.BtnA_Cal.click();

		Sky.Btn_SelectCurrent_Date.click();

		for (int i = 0; i < 4; i++) {
			Sky.Btn_Next_Month.click();
		}

		Thread.sleep(1000);
		Sky.Btn_End_Date.click();

		Step(9, "Selected event end date.");
		SnapShot_And_Step("event end date added.");

		Thread.sleep(1000);
		reusable.Scroll_Untill_Elmnt(Sky.TxtA_Check_In_Min);
		reusable.Excel_Data_Driver("NEW", 1, 5, Sky.TxtA_Check_In_Min);
		Thread.sleep(1000);
		Sky.BtnA_Brws_Img1.sendKeys("C:\\Users\\Kishan Joshi\\Downloads\\horizontal-banner-sample-image (3).png");
		Thread.sleep(1000);
		Thread.sleep(1000);
		Sky.BtnA_Brws_Img2.sendKeys("C:\\Users\\Kishan Joshi\\Downloads\\vertical-banner-sample-image (2).png");
		Thread.sleep(1000);
		Thread.sleep(1000);
		reusable.Scroll_Untill_Elmnt(Sky.ChbA_FulDay_Acs);
		Sky.ChbA_FulDay_Acs.click();

		List<WebElement> value = new ArrayList<>();
		value.add(Sky.ChkA_Aminities1);
		value.add(Sky.ChkA_Aminities2);
		value.add(Sky.ChkA_Aminities3);
		value.add(Sky.ChkA_Aminities4);

		System.out.println("Size of the array" + value.size());

		for (int i = 0; i < value.size(); i++) {
			Sky.Aminities(value.get(i));
			System.out.println(value.get(i));
			reusable.SnapShot_And_Step("KKKKKKKK");

			reusable.SnapShot();
			reusable.Step(1, "AAAAAAA");
			reusable.Result(1, "LLLLL");
		}

		reusable.Scroll_Untill_Elmnt(Sky.Chkb_HorizonatalBanner);
		Sky.Chkb_HorizonatalBanner.click();
		reusable.eLement_vIsible(Sky.Btn_homre_banner);
		Sky.Btn_homre_banner.click();

		Thread.sleep(1000);

		Sky.Brn_Booking_Stop.click();

		Thread.sleep(1000);
		Sky.Btn_SelectCurrent_Date.click();

		Thread.sleep(1000);
		Sky.Btn_Next.click();

		// Event detail page

		// reusable.eLement_vIsible(Sky.Chkb_AreU_FreeEvet);

		Thread.sleep(1000);
		Sky.Chkb_AreU_FreeEvet.click();

		Thread.sleep(1000);
		Sky.Btn_Add_Of_Event_Type.click();

		Thread.sleep(10000);
		System.out.println("aaa");
	}
}

package tests.module1;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ReusableMethod;
import repository.SignIn_Repo;

public class SignIn_Test extends SignIn_Repo {

	SignIn_Repo Sky;
	ReusableMethod reusable;

	@BeforeClass
	public void BeforeClass() throws InterruptedException {
		Sky = new SignIn_Repo();
		reusable = new ReusableMethod();
		// reusable.Sign_In_Mo();
	}

	@Test(priority = 1, description = "Sing in via mobile number and password.")
	public void Sign_In() throws InterruptedException {

		reusable.Sign_In_Mo();
		Assert.assertTrue(reusable.Pop_login_Succ.isDisplayed());
		reusable.eLement_IN_vIsible(reusable.Pop_login_Succ);

	}

	@Test(priority = 2, description = "Sign out.")
	public void Sign_Out() throws InterruptedException {

		reusable.Signout();

		Assert.assertTrue(reusable.Pop_Logout.isDisplayed());
		reusable.eLement_IN_vIsible(reusable.Pop_Logout);
	}

	@Test(priority = 3, description = "Opens 'Terms & Conditions' and Privacy Policy.")
	public void Open_Terms_And_Condition() throws InterruptedException {

		// addStep(1, "Clicked on sign-in button.");
		Sky.Btn_SignIn.click();

		// addResults(1, "Clicked on the T&C link.");
		Sky.Link_T_And_C.click();
		Sky.TxL_Policy.click();

		ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
		String Act = "https://mvp.everyticket.in/\n" + "";

		// System.out.println("Opens tabs list:- " + tabs.size());
		// System.out.println("Aray list:- "+tabs);
		// int size_Of_Tabs= tabs.size();

		for (int i = 0; i < tabs.size(); i++) {

			driver.switchTo().window(tabs.get(i));
			String a = driver.getCurrentUrl();
			// driver.navigate().refresh();
			Thread.sleep(3000);

			System.out.println(a);
			Thread.sleep(5000);
			if (a == Act)

				break;

		}
	}

	/*
	 * @Test(priority = 3, description =
	 * "Opens 'Terms & Conditions' and Privacy Policy.") public void
	 * Open_Terms_And_Condition() throws InterruptedException { ExtraScreenShot();
	 * addStep(1, "Clicked on sign-in button."); Sky.Btn_SignIn.click();
	 * 
	 * ExtraScreenShot(); addResults(1, "Clicked on the T&C link.");
	 * Sky.Link_T_And_C.click(); Sky.TxL_Policy.click();
	 * 
	 * ArrayList<String> tabs = new ArrayList(driver.getWindowHandles()); String Act
	 * = "https://mvp.everyticket.in/\n" + "";
	 * 
	 * // System.out.println("Opens tabs list:- " + tabs.size()); //
	 * System.out.println("Aray list:- "+tabs); // int size_Of_Tabs= tabs.size();
	 * 
	 * for (int i = 0; i < tabs.size(); i++) {
	 * 
	 * driver.switchTo().window(tabs.get(i)); String a = driver.getCurrentUrl();
	 * //driver.navigate().refresh(); Thread.sleep(3000);
	 * 
	 * System.out.println(a); Thread.sleep(5000); if (a == Act)
	 * 
	 * break;
	 * 
	 * } }
	 */

}

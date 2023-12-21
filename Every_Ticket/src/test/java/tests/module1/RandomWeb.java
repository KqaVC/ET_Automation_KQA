package tests.module1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ReusableMethod;
import repository.RandomWeb_Repo;

public class RandomWeb extends RandomWeb_Repo {

	RandomWeb_Repo repo;
	ReusableMethod reusable;

	@BeforeClass
	public void BeforeClass() {
		repo = new RandomWeb_Repo();
		reusable = new ReusableMethod();
	}

	@Test(description = "Video recording")
	public void Sign_In() throws InterruptedException {
		repo = new RandomWeb_Repo();
		reusable.Sign_In_Mo();
		
	}
}

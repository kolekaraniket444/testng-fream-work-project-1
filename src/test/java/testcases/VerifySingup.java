package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectModel.SignUpPagePOM;
import Resources.BaseClass;

public class VerifySingup extends BaseClass {

	
	
	@Test
	public void signup() throws InterruptedException {
		SignUpPagePOM obj=new SignUpPagePOM(driver);
		obj.clicksignup().click();
	
		Thread.sleep(7000);
		obj.EnterfirstName().sendKeys("Swapnil");
		obj.EnterlastName().sendKeys("Padalkar");
		obj.Enteremail().sendKeys("padalkar.swapnil999@gmain.com");
		Thread.sleep(3000);
	
		
	}
}

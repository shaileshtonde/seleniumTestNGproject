package com.resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class commonmethod {
	
	public static void handleAssertion(String registerInValidExpectedText,String expectedText) {
		
		 SoftAssert sa = new SoftAssert();

		  sa.assertEquals(registerInValidExpectedText, expectedText);

		  sa.assertAll();
	}
	
	public static void handleEpliciteWaits(WebDriver driver,int time,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));

		


	}

	public static void handleAssertion(WebDriver driver, int i, WebElement logOutText) {
		// TODO Auto-generated method stub
		
	}

}

package com.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.resources.baseclass;

import com.resources.commonmethod;
import com.resources.constants;

import PageObjectModel.loginPageObject;

public class loginTestCases extends baseclass {

	@Test(dependsOnMethods = "verifyValidRegisteration")
	public void verifyValidLogin() throws IOException, InterruptedException {

		loginPageObject lpo = new loginPageObject(driver);

		lpo.clickOnlogIn().click();

		lpo.enterEmail().sendKeys(email);

		lpo.enterPassword().sendKeys(constants.LoginvalidPassword);

		lpo.clickSubmit().click();

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));

		wait.until(ExpectedConditions.visibilityOf(lpo.logOutText()));
		
		commonmethod.handleAssertion(driver, 2, lpo.logOutText());
		commonmethod.handleAssertion(constants.loginValidExpectedTest, lpo.logOutText().getText());

	}

	@Test
	public void verifyInValidLogin() throws IOException {

		loginPageObject lpo = new loginPageObject(driver);

		lpo.clickOnlogIn().click();

		lpo.enterEmail().sendKeys(email); // abc123@gmail.cpm

		lpo.enterPassword().sendKeys(constants.LogininValidPassword);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));

		wait.until(ExpectedConditions.visibilityOf(lpo.clickSubmit()));

		commonmethod.handleEpliciteWaits(driver, 3, lpo.clickSubmit());

		commonmethod.handleAssertion(constants.LogininValidExpectedTest, lpo.invalidCredientialsText().getText());

	}

}
package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.resources.baseclass;
import com.resources.commonmethod;
import com.resources.constants;

import PageObjectModel.registerPageObjects;

public class registerTestCases extends baseclass {



 @Test
 public void verifyValidRegisteration() throws IOException {
  

 
  registerPageObjects rpo = new registerPageObjects(driver);

  rpo.clickonRegister().click();

  rpo.selectGender().click();

  rpo.enterFirstName().sendKeys(constants.firstName);

  rpo.enterLastName().sendKeys(constants.lastName);

  rpo.enterEmail().sendKeys(email); 

  rpo.enterPassword().sendKeys(constants.password);

  rpo.enterConfirmPassword().sendKeys(constants.confirmPassword);

  rpo.clickonsubmitButton().click();
  

  commonmethod.handleAssertion(constants.registerValidExpectedText, rpo.successText().getText());

 }

 @Test
 public void verifyInValidRegisteration() throws IOException {

  registerPageObjects rpo = new registerPageObjects(driver);

  rpo.clickonRegister().click();

  rpo.selectGender().click();

  rpo.enterFirstName().sendKeys(constants.firstName);

  rpo.enterLastName().sendKeys(constants.lastName);

  rpo.enterEmail().sendKeys(constants.invalidEmail);

  rpo.enterPassword().sendKeys(constants.password);

  rpo.enterConfirmPassword().sendKeys(constants.confirmPassword);

  rpo.clickonsubmitButton().click();
  
  String expectedText = constants.registerInValidExpectedText;

  String actualText = rpo.invalidEmailText().getText();

  commonmethod.handleAssertion(constants.registerInValidExpectedText, rpo.invalidEmailText().getText());

  
 }
}
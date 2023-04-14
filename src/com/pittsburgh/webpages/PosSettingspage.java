package com.pittsburgh.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pittsburgh.base.Baseclass;

public class PosSettingspage {
@FindBy(xpath="//*[text()='Neville Island']")
public WebElement locationbutton;
@FindBy(xpath="//*[text()='Okay']")
public WebElement Okaybutton;
@FindBy(xpath="//*[@class='form-control ng-untouched ng-pristine ng-invalid']")
public WebElement Posname;
@FindBy(xpath="//*[@type='Submit']")
public WebElement submitbutton;

public PosSettingspage()
{
	PageFactory.initElements(Baseclass.driver,this);
}
public void clickonlocationbutton()
{
	locationbutton.click();
}
public void clickonOkaybutton()
{
	Okaybutton.click();
}
public void sendPosname(String storeposname)
{
	Posname.sendKeys(storeposname);
}
public void clickonsubmitbutton()
{
	submitbutton.click();
}
}

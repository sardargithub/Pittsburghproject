package com.pittsburgh.genericlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pittsburgh.base.Baseclass;

public class OperationsAppHomepage {
	@FindBy(xpath="/html/body/app-root/ion-app/ion-split-pane/ion-router-outlet/app-home/ion-header/ion-toolbar/ion-buttons[1]")
	public WebElement Homepagebutton;
	@FindBy(xpath="//*[text()=' POS ']")
	public WebElement Posbutton;
	@FindBy(xpath="//*[text()=' View ']")
	public WebElement viewbutton;


	public OperationsAppHomepage()
	{
		PageFactory.initElements(Baseclass.driver,this);
	}

	public void clickonHomepagebutton()
	{
		Homepagebutton.click();
	}
	public void clcikonPosbutton()
	{
		Posbutton.click();
	}
	public void ClickonViewbutton()
	{
		viewbutton.click();
	}
}

package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassLogOut extends BaseClass {
	public PojoClassLogOut() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Click here to login again']")
	private WebElement logIn;

	public WebElement getLogIn() {
		return logIn;
	}

}

package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassInitnerary extends BaseClass {
	public PojoClassInitnerary() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "logout")
	private WebElement logOut;
	
	

	public WebElement getLogOut() {
		return logOut;
	}

}


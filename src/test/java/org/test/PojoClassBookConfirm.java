package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassBookConfirm extends BaseClass {
	public PojoClassBookConfirm() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@id=\"order_no\"]")
	private WebElement orderId;
	
	@FindBy(xpath = "//input[@id=\"my_itinerary\"]")
	private WebElement initnerary;

	public WebElement getInitnerary() {
		return initnerary;
	}


	public WebElement getOrderNo() {
		
		return orderId;
	}

}

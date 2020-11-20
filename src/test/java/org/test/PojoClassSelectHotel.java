package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassSelectHotel extends BaseClass {
public PojoClassSelectHotel() {
	PageFactory.initElements(driver, this);
}	
@FindBy(id="radiobutton_0")
private  WebElement select;

@FindBy(id="continue")
private WebElement continu;

public WebElement getSelect() {
	return select;
}

public WebElement getContinu() {
	return continu;
}


}

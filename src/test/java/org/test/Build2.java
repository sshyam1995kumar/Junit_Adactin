package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Build2 extends BaseClass {
public Build2() {
	
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="body/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/ul[1]/li[2]/a[1]/strong[1]" )
private WebElement go;

	public WebElement getGo() {
	return go;
}
}


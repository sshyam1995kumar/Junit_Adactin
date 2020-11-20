package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit extends BaseClass {
	@BeforeClass
	public static void load() {
		browserlaunch();
	}

	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	public static void quit() {
		driver.quit();
	}

	@Test
	public void test1() throws Throwable {
		loadurl("https://www.adactin.com/HotelApp/");

		PojoClassLogin l = new PojoClassLogin();
		PojoClassSearchHotel l1 = new PojoClassSearchHotel();
		PojoClassSelectHotel l2 = new PojoClassSelectHotel();
		PojoClassBookHotel l3 = new PojoClassBookHotel();
		PojoClassBookConfirm l4 = new PojoClassBookConfirm();
		PojoClassInitnerary l5 = new PojoClassInitnerary();
		PojoClassLogOut l6 = new PojoClassLogOut();

		fillText(l.getUser(), getFromExcel("Sheet1", 1, 0));
		fillText(l.getPass(), getFromExcel("Sheet1", 1, 1));
		click(l.getLog());

		dropdown(l1.getLocation(), "Sydney");
		dropdown(l1.getHotel(), "Hotel Cornice");
		dropdown(l1.getRoomType(), "Super Deluxe");
		dropdown(l1.getRoom(), "2 - Two");
		fillText(l1.getInDate(), getFromExcel("Sheet1", 1, 2));
		fillText(l1.getOutDate(), getFromExcel("Sheet1", 1, 3));
		dropdown(l1.getAdult(), "2 - Two");
		dropdown(l1.getChild(), "4 - Four");
		click(l1.getSubmit());

		click(l2.getSelect());
		click(l2.getContinu());

		fillText(l3.getFirstName(), getFromExcel("Sheet1", 1, 4));
		fillText(l3.getLastName(), getFromExcel("Sheet1", 1, 5));
		fillText(l3.getAddress(), getFromExcel("Sheet1", 1, 6));
		fillText(l3.getCcno(), getFromExcel("Sheet1", 1, 7));
		dropdown(l3.getCctype(), getFromExcel("Sheet1", 1, 8));
		dropdown(l3.getExpMon(), getFromExcel("Sheet1", 1, 9));
		dropdown(l3.getExpYear(), getFromExcel("Sheet1", 1, 10));
		fillText(l3.getCvv(), getFromExcel("Sheet1", 1, 11));
		click(l3.getBook());

		Thread.sleep(5000);
		orderNo(l4.getOrderNo(),"Sheet1",1,12);
		click(l4.getInitnerary());
		Thread.sleep(5000);

		click(l5.getLogOut());

		click(l6.getLogIn());

	}

	
	@Test
	public void test2() throws Throwable {
		loadurl("https://www.adactin.com/HotelApp/");

		PojoClassLogin l = new PojoClassLogin();
		PojoClassSearchHotel l1 = new PojoClassSearchHotel();
		PojoClassSelectHotel l2 = new PojoClassSelectHotel();
		PojoClassBookHotel l3 = new PojoClassBookHotel();
		PojoClassBookConfirm l4 = new PojoClassBookConfirm();
		PojoClassInitnerary l5 = new PojoClassInitnerary();
		PojoClassLogOut l6 = new PojoClassLogOut();

		fillText(l.getUser(), getFromExcel("Sheet1", 2, 0));
		fillText(l.getPass(), getFromExcel("Sheet1", 2, 1));
		click(l.getLog());

		dropdown(l1.getLocation(), "Sydney");
		dropdown(l1.getHotel(), "Hotel Cornice");
		dropdown(l1.getRoomType(), "Super Deluxe");
		dropdown(l1.getRoom(), "2 - Two");
		fillText(l1.getInDate(), getFromExcel("Sheet1", 2, 2));
		fillText(l1.getOutDate(), getFromExcel("Sheet1", 2, 3));
		dropdown(l1.getAdult(), "2 - Two");
		dropdown(l1.getChild(), "4 - Four");
		click(l1.getSubmit());

		click(l2.getSelect());
		click(l2.getContinu());

		fillText(l3.getFirstName(), getFromExcel("Sheet1", 2, 4));
		fillText(l3.getLastName(), getFromExcel("Sheet1", 2, 5));
		fillText(l3.getAddress(), getFromExcel("Sheet1", 2, 6));
		fillText(l3.getCcno(), getFromExcel("Sheet1", 2, 7));
		dropdown(l3.getCctype(), getFromExcel("Sheet1", 2, 8));
		dropdown(l3.getExpMon(), getFromExcel("Sheet1", 2, 9));
		dropdown(l3.getExpYear(), getFromExcel("Sheet1", 2, 10));
		fillText(l3.getCvv(), getFromExcel("Sheet1", 2, 11));
		click(l3.getBook());

		Thread.sleep(5000);
		orderNo(l4.getOrderNo(),"Sheet1",2,12);
		click(l4.getInitnerary());
		Thread.sleep(5000);

		click(l5.getLogOut());

		click(l6.getLogIn());

	}

	
	@Test
	public void test3() throws Throwable {
		loadurl("https://www.adactin.com/HotelApp/");

		PojoClassLogin l = new PojoClassLogin();
		PojoClassSearchHotel l1 = new PojoClassSearchHotel();
		PojoClassSelectHotel l2 = new PojoClassSelectHotel();
		PojoClassBookHotel l3 = new PojoClassBookHotel();
		PojoClassBookConfirm l4 = new PojoClassBookConfirm();
		PojoClassInitnerary l5 = new PojoClassInitnerary();
		PojoClassLogOut l6 = new PojoClassLogOut();

		fillText(l.getUser(), getFromExcel("Sheet1", 3, 0));
		fillText(l.getPass(), getFromExcel("Sheet1", 3, 1));
		click(l.getLog());

		dropdown(l1.getLocation(), "Sydney");
		dropdown(l1.getHotel(), "Hotel Cornice");
		dropdown(l1.getRoomType(), "Super Deluxe");
		dropdown(l1.getRoom(), "2 - Two");
		fillText(l1.getInDate(), getFromExcel("Sheet1", 3, 2));
		fillText(l1.getOutDate(), getFromExcel("Sheet1", 3, 3));
		dropdown(l1.getAdult(), "2 - Two");
		dropdown(l1.getChild(), "4 - Four");
		click(l1.getSubmit());

		click(l2.getSelect());
		click(l2.getContinu());

		fillText(l3.getFirstName(), getFromExcel("Sheet1", 3, 4));
		fillText(l3.getLastName(), getFromExcel("Sheet1", 3, 5));
		fillText(l3.getAddress(), getFromExcel("Sheet1", 3, 6));
		fillText(l3.getCcno(), getFromExcel("Sheet1", 3, 7));
		dropdown(l3.getCctype(), getFromExcel("Sheet1", 3, 8));
		dropdown(l3.getExpMon(), getFromExcel("Sheet1", 3, 9));
		dropdown(l3.getExpYear(), getFromExcel("Sheet1", 3, 10));
		fillText(l3.getCvv(), getFromExcel("Sheet1", 3, 11));
		click(l3.getBook());

		Thread.sleep(5000);
		orderNo(l4.getOrderNo(),"Sheet1",3,12);
		click(l4.getInitnerary());
		Thread.sleep(5000);

		click(l5.getLogOut());

		click(l6.getLogIn());

	}

	
	@Test
	public void test4() throws Throwable {
		loadurl("https://www.adactin.com/HotelApp/");

		PojoClassLogin l = new PojoClassLogin();
		PojoClassSearchHotel l1 = new PojoClassSearchHotel();
		PojoClassSelectHotel l2 = new PojoClassSelectHotel();
		PojoClassBookHotel l3 = new PojoClassBookHotel();
		PojoClassBookConfirm l4 = new PojoClassBookConfirm();
		PojoClassInitnerary l5 = new PojoClassInitnerary();
		PojoClassLogOut l6 = new PojoClassLogOut();

		fillText(l.getUser(), getFromExcel("Sheet1", 4, 0));
		fillText(l.getPass(), getFromExcel("Sheet1", 4, 1));
		click(l.getLog());

		dropdown(l1.getLocation(), "Sydney");
		dropdown(l1.getHotel(), "Hotel Cornice");
		dropdown(l1.getRoomType(), "Super Deluxe");
		dropdown(l1.getRoom(), "2 - Two");
		fillText(l1.getInDate(), getFromExcel("Sheet1", 4, 2));
		fillText(l1.getOutDate(), getFromExcel("Sheet1", 4, 3));
		dropdown(l1.getAdult(), "2 - Two");
		dropdown(l1.getChild(), "4 - Four");
		click(l1.getSubmit());

		click(l2.getSelect());
		click(l2.getContinu());

		fillText(l3.getFirstName(), getFromExcel("Sheet1", 4, 4));
		fillText(l3.getLastName(), getFromExcel("Sheet1", 4, 5));
		fillText(l3.getAddress(), getFromExcel("Sheet1", 4, 6));
		fillText(l3.getCcno(), getFromExcel("Sheet1", 4, 7));
		dropdown(l3.getCctype(), getFromExcel("Sheet1", 4, 8));
		dropdown(l3.getExpMon(), getFromExcel("Sheet1", 4, 9));
		dropdown(l3.getExpYear(), getFromExcel("Sheet1", 4, 10));
		fillText(l3.getCvv(), getFromExcel("Sheet1", 4, 11));
		click(l3.getBook());

		Thread.sleep(5000);
		orderNo(l4.getOrderNo(),"Sheet1",4,12);
		click(l4.getInitnerary());
		Thread.sleep(5000);

		click(l5.getLogOut());

		click(l6.getLogIn());

	}
}
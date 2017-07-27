package com.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pom.AmazonWebDriver;

public class AmazonWebDriver {
	static WebDriver driver;
	public void Website() throws InterruptedException{

		System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
	
	public AmazonWebDriver() {
		// TODO Auto-generated constructor stub
	}
	
	public AmazonWebDriver(WebDriver driver) {
		// TODO Auto-generated constructor stub
		AmazonWebDriver.driver= driver;
	}
	
	public WebDriver GetDriver(){
		return this.driver;
	}
}

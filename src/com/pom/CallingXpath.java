package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.AmazonWebDriver;

public class CallingXpath {
	public WebDriver driver = new AmazonWebDriver().GetDriver(); 

	public void Login() throws InterruptedException{
		String UserName = "manasa0041@gmail.com";
		String Password = "Manasa.2182";
		driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys(UserName);
		driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys(Password);
		driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
	}
	
	public void Item() throws InterruptedException{
		String Item = "IPhone 6S case";
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys(Item);
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		driver.findElement(By.xpath(".//*[@id='result_3']/div/div[3]/div[1]/a/h2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='hlb-ptc-btn-native']")).click();

}
}

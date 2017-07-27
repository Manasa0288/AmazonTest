package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.AmazonWebDriver;

public class CheckOut {
	public WebDriver driver = new AmazonWebDriver().GetDriver();
	public void Address() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='address-book-entry-0']/div[2]/span/a")).click();
		driver.findElement(By.xpath(".//*[@id='shippingOptionFormId']/div[3]/div/div/span[1]/span/input")).click();
		driver.findElement(By.xpath(".//*[@id='shippingOptionFormId']/div[1]/div[2]/div/span[1]/span/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='continue-top']")).click();

}
}

package com.pom;

import com.pom.AmazonWebDriver;
import com.pom.CallingXpath;
import com.pom.CheckOut;

public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AmazonWebDriver AWD = new AmazonWebDriver();
		AWD.Website();
		CallingXpath CX = new CallingXpath();
		CX.Login();
		CX.Item();
		CheckOut CO = new CheckOut();
		CO.Address();

}
}

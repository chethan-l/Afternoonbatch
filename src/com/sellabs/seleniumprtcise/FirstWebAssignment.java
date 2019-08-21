/**
 * 
 */
package com.sellabs.seleniumprtcise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import org.testng.Assert;

/**
 * @author Viswanath Lingum
 *
 */
public class FirstWebAssignment {
	public void First() {
		try {
			WebDriver driver = new FirefoxDriver();// to open browser
			driver.manage().window().maximize();// to maximize window
			driver.get("https://www.google.com");// to open url
			driver.findElement(By.name("q")).sendKeys("Chethan");// finding textbox and send value
			driver.findElement(By.linkText("Sign in")).click();// click in link
			String ActTitle = driver.getTitle();// get title
			System.out.println("actual Title is " + ActTitle);
			String ExpecTitle = "Sign in - Google Account";
			SoftAssert sa = new SoftAssert();// softassertion object creation
			sa.assertEquals(ActTitle, ExpecTitle);// compare acttitle with expectitle
			System.out.println("continue");//to check whether rest of code executed after assertion failed
			sa.assertAll();// for throwing exception

		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		FirstWebAssignment fa = new FirstWebAssignment();
		fa.First();

	}
}

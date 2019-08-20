/**
 * 
 */
package com.sellabs.seleniumprtcise;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * @author Viswanath Lingum
 *
 */
public class FirstWebdrprg {
	public void first() {
		try {
			WebDriver driver =new FirefoxDriver();	
			driver.manage().window().maximize();
			driver.get("https://www.seleniumhq.org");
			WebElement search  =driver.findElement(By.id("q"));
			search.sendKeys("selenium");
			driver.findElement(By.linkText("Download")).click();
			String exptitle = "Download";
			String acttitle= driver.getTitle();
			//Assert.assertEquals(exptitle, acttitle);
			SoftAssert sa= new SoftAssert();
			sa.assertEquals(exptitle, acttitle);
			
			System.out.println("continue");
			sa.assertAll();
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	public static void main(String[] args) {
		FirstWebdrprg fd = new FirstWebdrprg();
		fd.first();
	}

}

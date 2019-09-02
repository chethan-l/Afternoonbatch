/**
 * 
 */
package com.sellabs.interf;

/**
 * @author Viswanath Lingum
 *
 */
public class TestExecu {
	public static void main(String[] args) {
		Webdriver driver = new Firefoxdriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}

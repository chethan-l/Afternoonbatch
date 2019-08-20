/**
 * 
 */
package com.sellabs.interf;

/**
 * @author Viswanath Lingum
 *
 */
public class Firefoxdriver implements Webdriver{
	public Firefoxdriver() {
		System.out.println("Browser opens");
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("Url opens");
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
	return "sampletitle";	
	}

}

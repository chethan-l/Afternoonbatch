/**
 * 
 */
package com.sellabs.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Viswanath Lingum
 *
 */
public class sample {
	@Test(priority=1)
	public void D()
	{
		System.out.println("Hi D");
	}
	@Test(priority=2)
	public void A()
	{
		System.out.println("Hi A");
	}
	@AfterMethod
	public void C()
	{
		System.out.println("AfterMethod");
	}
	@Test(priority=5)
	public void E()
	{
		System.out.println("Hi E");
	}
	@BeforeMethod
	public void B()
	{
		System.out.println("BeforeMethod");
			}
}

/**
 * 
 */
package com.sellabs.Inheritance;

import com.sellabs.interf.Sampleinterf;

/**
 * @author Viswanath Lingum
 *
 */
public class Class2 extends Class1 implements Sampleinterf{
	public void ops4()
	{
		System.out.println("method===4");
	}
	@Override
	public void ops2() {
		System.out.println("method--2");
		System.out.println("overridden method");
	}
	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Class1 cl1 =new Class2();
			}
			
}

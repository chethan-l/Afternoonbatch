/**
 * 
 */
package com.sellabs.Simpleprg;

/**
 * @author Viswanath Lingum
 *
 */

public class Different {
	
	int a=12;
	static int b=20;
	final int c=30;
	public static void main(String[] args) {
		Different dt = new Different();
		Different dt1 = new Different();
		System.out.println(dt.a++);//12
		System.out.println(dt.a);//13
		System.out.println(dt1.a);//12
		System.out.println("==============");
		System.out.println(dt.b++);//20
		System.out.println(dt.b);//21
		System.out.println(dt1.b);//21
		System.out.println("============");
		
		
	}

}

/**
 * 
 */
package com.sellabs.Simpleprg;

/**
 * @author Viswanath Lingum
 *
 */
public class Enhancedforloop {
	public static void main(String[] args) {
		
	int [] math = new int [3];
	int a = 10 , b = 20;
	math[0] = a+b;
	math[1] = a-b;
	math[2] = a*b;
	for (int i : math) {
		System.out.println(i);
		
	}
	
	}

}

/**
 * 
 */
package com.sellabs.Exceptionhandling;

/**
 * @author Viswanath Lingum
 *
 */
public class Numberformat {
	public void ops() {
		try {
			String s="abc";
			int a= Integer.parseInt(s);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("String cant be converted as int "+e.getMessage());
		}
		System.out.println("not possible");
	}
public static void main(String[] args) {
	Numberformat nf= new Numberformat();
	nf.ops();
}
}

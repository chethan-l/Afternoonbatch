/**
 * 
 */
package com.sellabs.Simpleprg;

/**
 * @author Viswanath Lingum
 *
 */
public class Variables {
	static int age =12;
	final static int a =30;
	int he = 5;
	int localvar = 0;
	
	public static void main(String[] args) {
	Variables vs=new Variables();
	System.out.println(vs.he);
	vs.he=7;
	vs.age=14;
	//vs.a=50;
	System.out.println(+age);
	System.out.println(vs.he);
	System.out.println(vs.localvar);
	}

}

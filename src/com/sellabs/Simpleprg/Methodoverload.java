/**
 * 
 */
package com.sellabs.Simpleprg;

/**
 * @author Viswanath Lingum
 *
 */
public class Methodoverload {
	public void age(int a) {
		System.out.println("method 1 :" + a);
	}

	public void age(int a, int b) {
		int c;
		c = a + b;
		System.out.println("method 2 : " + c);
	}

	public void age(String s) {
		System.out.println("iam method 3 " + s);
	}
	public int mul(int a,int b,int c)
	{
		int x=a*b*c;
		return x;
	}
	public static float add(int a,int b) {
		float c=a+b;
		return c;
	}

	public static void main(String[] args) {
		Methodoverload md = new Methodoverload();
		md.age(8);
		System.out.println(md.mul(2,4,8));
		//System.out.println((md.age(5)));//inside syso we wont excute void method 
		
		md.age("name");
		md.age(8, 9);
		float d =  add(9,2);
		System.out.println(d);
	}
}

/**
 * 
 */
package com.sellabs.Simpleprg2;

/**
 * @author Viswanath Lingum
 *
 */
public class Sampleclass {
	public Sampleclass(int i){
		this(5,"test");
		System.out.println("value of i"+i);
		System.out.println("this is 1st constructor");
		}
	public Sampleclass(int i,String s){
		System.out.println("value of i "+i+ "and " +s);
		System.out.println("this is 2nd constructor");
		}
	public Sampleclass(String s){
		this(9);
		System.out.println(s);
		System.out.println("this 3rd constructor");
		}
	public Sampleclass(){
		System.out.println("iam default");
	}
	public static void main(String[] args) {
		Sampleclass sc = new Sampleclass("hello");
		
		
	}

}

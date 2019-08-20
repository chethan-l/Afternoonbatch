/**
 * 
 */
package com.sellabs.abstra;

/**
 * @author Viswanath Lingum
 *
 */
public class ImpClass extends AbstractClass {

	@Override
	public void ops1() {
		// TODO Auto-generated method stub
		System.out.println("overriden");
	}
	public void ops3() {
		// TODO Auto-generated method stub
		System.out.println("new one");
	}
public static void main(String[] args) {
	AbstractClass ac= new ImpClass();//we can call all methods of parentclass and overriden of impclass but not newone
	ac.ops1();
}
}

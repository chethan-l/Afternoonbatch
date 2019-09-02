/**
 * 
 */
package com.sellabs.Simpleprg;

/**
 * @author Viswanath Lingum
 *
 */
public class Strings {
	public static void main(String[] args) {
		/*String a = "chethan";
		System.out.println(a);
		  System.out.println(System.identityHashCode(a));
		   a .concat("hi");
		  System.out.println(a);
		  //System.out.println(System.identityHashCode(a));
		  System.out.println("=================================");
		  //System.out.println(System.identityHashCode(b));
		  String obj = new String("hello");
	
		  //System.out.println(System.identityHashCode(obj));
		  String obj1 = new String("hello");
		  //System.out.println(System.identityHashCode(obj1));
		  
		  System.out.println(a.endsWith("an"));*/
		

		StringBuffer sb= new StringBuffer("hello");
		//System.out.println(System.identityHashCode(sb));
		sb.append("hi");
		//System.out.println(sb.substring(2));
		//System.out.println(System.identityHashCode(sb));
		StringBuilder sbuilder = new StringBuilder("chethan");
		//System.out.println(System.identityHashCode(sbuilder));
		//System.out.println(sbuilder.append(" Lingam"));
		//System.out.println(System.identityHashCode(sbuilder));
		sbuilder.deleteCharAt(4);
		System.out.println(sbuilder);
		
	}
}
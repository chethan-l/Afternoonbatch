/**
 * 
 */
package com.sellabs.Simpleprg;

/**
 * @author Viswanath Lingum
 *
 */
public enum Sampleenum {
	APPLE("RED"),BANANA("YELLOE");
	String color;
	private Sampleenum(String color) {
		this.color=color;
		// TODO Auto-generated constructor stub
	}
	public  String getcolor() {
		return color;
	}
	public static void main(String[] args) {
		String s = Sampleenum.APPLE.getcolor();
		Sampleenum s1 = Sampleenum.BANANA;
		System.out.println(s);
	}
	

	

}

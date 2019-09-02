package com.sellabs.Inheritance;

public class Class5 {
public static void main(String[] args) {
	Class4 cl4 = new Class4();
	String val = cl4.getName();
	System.out.println(val);
	System.out.println("=================");
	cl4.setName("99999999999");
System.out.println(cl4.getName());
}
}

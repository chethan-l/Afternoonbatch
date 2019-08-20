/**
 * 
 */
package com.sellabs.Simpleprg2;

import java.io.File;

/**
 * @author Viswanath Lingum
 *
 */
public class Demooffile {
	public static void main(String[] args) {
		File f=new File("D:/Sample");
		f.mkdir();
		System.out.println("folder created");
		
	}

}

/**
 * 
 */
package com.sellabs.Exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author Viswanath Lingum
 *
 */
public class Filenotfound {
	public void fs() {
		PrintWriter pw;
		try {
			pw = new PrintWriter("D://sample.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		//System.out.println("sucess");
	}
	public static void main(String[] args) {
		Filenotfound fn = new Filenotfound();
		fn.fs();
	}

}

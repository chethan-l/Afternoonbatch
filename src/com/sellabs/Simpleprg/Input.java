/**
 * 
 */
package com.sellabs.Simpleprg;

import java.util.Scanner;

/**
 * @author Viswanath Lingum
 *
 */
public class Input {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter :");
		int a =scan.nextInt();
		System.out.println("Entered name  "+a);
		scan.close();
	}

}

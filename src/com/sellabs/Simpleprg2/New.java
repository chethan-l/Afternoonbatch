/**
 * 
 */
package com.sellabs.Simpleprg2;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Viswanath Lingum
 *
 */
public class New {
	public static void main(String[] args) {
		
	
	String timeStamp = new SimpleDateFormat("yy.MM.dd.HH.mm.ss").format(new Date());
	System.out.println(timeStamp);
}
}

/**
 * 
 */
package com.sellabs.Simpleprg2;

/**
 * @author Viswanath Lingum
 *
 */
public class Triangle {

	public void shape()
	{ 
		int s=6;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=s;j++)
			{
				System.out.print(" "); //to print space
			}
			  for(int j=1;j<=i;j++)
				  {
				  System.out.print("* "); //to print charcter "*" 
				  }
			
			  System.out.println();//to go nextline
			  s--;
			  
	    	}
      }
	public static void main(String[] args) {
	 Triangle tl =  new Triangle();
	   tl.shape();
	}
}

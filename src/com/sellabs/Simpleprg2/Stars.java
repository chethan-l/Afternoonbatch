/**
 * 
 */
package com.sellabs.Simpleprg2;

/**
 * @author Viswanath Lingum
 *
 */
public class Stars {
	public void dis()
	{
	  int s =6;
	  for(int i=1;i<=7;i++)
	  {
	    for(int j=1;j<=s;j++) 
	    {
		   System.out.print(" ");
	     }
	      for(int j=1;j<=i;j++)
	      {
		    System.out.print("* ");
	       }
	       System.out.println();
	      s--;
	     }
	}

	public static void main(String[] args) {
		Stars sr = new Stars();
		 sr.dis();
		 
	}
}

/**
 * 
 */
package com.sellabs.Simpleprg2;

/**
 * @author Viswanath Lingum
 *
 */
public class Twodimensionalarray {
	public void array()
	{ 
		int arr[][]= {{1,2,3,4},{5,6,7,8},{4,5,6,7},{3,7,3,6}}; //creating twodimensional array
	
		// below for loop is to print array values
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++) 
			{
				//System.out.println("Value of array at the index  " +i+ " "+j+ " is " +arr[i][j]+" ");
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		}
	public static void main(String[] args) {
		
		Twodimensionalarray ta = new Twodimensionalarray();
		  ta.array();
	}

}

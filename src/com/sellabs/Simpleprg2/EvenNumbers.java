/**
 * 
 */
package com.sellabs.Simpleprg2;

/**
 * @author Viswanath Lingum
 *
 */
public class EvenNumbers {
	public void even()
	{
		for(int i=2;i<=50;i++)
		{ 
			//below if condition is to check even number
			if((i%2)==0)
			{
				System.out.println("Even number is " +i);//print even numbers
			}
		}
	}

	public static void main(String[] args) {
		EvenNumbers en = new EvenNumbers();//object creation
		  en.even();//calling method 
		  
	}
}

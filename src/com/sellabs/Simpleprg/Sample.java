/**
 * 
 */
package com.sellabs.Simpleprg;

/**
 * @author Viswanath Lingum
 *
 */
public class Sample { 
	/*the number is in between 1 to 100 then display the number is small number
	if the number is in between 101 to 1000 then display the number is medium number
	if the number is in between 1001 to 10000 then display the number is big number
	otherwise display the number is either zero or negative value*/

public static void main(String[] args) {
	String val = args[0];
	int a= Integer.parseInt(val);
	if((a>=1)&&(a<=100))
	{
		System.out.println("small number");
	}
	else if((a>=101)&&(a<=1000))
	{
	System.out.println("mediumnumber");
	}
	else if((a>=1001)&&(a<=10000))
	{
	System.out.println("bignumber");
	}
	else
	{
		System.out.println("zero or negative");
	}
}

}

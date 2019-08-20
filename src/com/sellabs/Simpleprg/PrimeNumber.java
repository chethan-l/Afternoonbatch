/**
 * 
 */
package com.sellabs.Simpleprg;

/**
 * @author Viswanath Lingum
 *
 */
public class PrimeNumber {
	public void  primes()
	{ 
		int p;
		for(int i=2;i<=30;i++)
		{
			 p=0;
		
				System.out.println("number" +i);

			for(int j=2;j<i;j++)

			{
				System.out.println("in number" +j);

			if(i%j==0)
				p=1;
			}

			if(p==0)
			{
				System.out.println("primenumber" +i);
			}
		}

	}
	public static void main(String[] args) {
		PrimeNumber pm = new PrimeNumber();
		pm.primes();
	}

}

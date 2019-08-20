/**
 * 
 */
package com.sellabs.Simpleprg2;

/**
 * @author Viswanath Lingum
 *
 */
public class Stringtime {
	public void ops()
	{
	
	long starttime = System.currentTimeMillis();
	System.out.println(starttime);
	StringBuffer sb = new StringBuffer("chethan");
	for (int i = 0; i < 100000; i++)
	{
		sb.append("Lingam");
	}
    System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - starttime) + "ms");
    System.out.println("=======================");
    starttime = System.currentTimeMillis();
    System.out.println(starttime);
    StringBuilder sbuilder = new StringBuilder("chethan");
    for (int i = 0; i < 100000; i++)
	{
		sbuilder.append("Lingam");
	}
    System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - starttime) + "ms");
}
	public static void main(String[] args) {
		Stringtime st = new Stringtime();
		st.ops();
	}
}

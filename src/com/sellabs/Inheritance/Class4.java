/**
 * 
 */
package com.sellabs.Inheritance;

/**
 * @author Viswanath Lingum
 *
 */
public class Class4 {
 private String name= "hello";

public String getName() {
	return name;
}
	public void setName(String name)
	{
		if(name.length()!=10)
		{
 System.out.println("in correct way");
		}
		
		else {
		this.name = name;
	}	

}
}
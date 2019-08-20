/**
 * 
 */
package com.sellabs.Simpleprg;

/**
 * @author Viswanath Lingum
 *
 */
public class Constructorclass {
			   //Static Class Reference
		   private static  Constructorclass obj=null;
		   private  Constructorclass(){
		      /*Private Constructor will prevent 
		       * the instantiation of this class directly*/
		   }
		   public static  Constructorclass objectCreationMethod(){
			/*This logic will ensure that no more than
			 * one object can be created at a time */
			if(obj==null){
			    obj= new Constructorclass();
			}
		        return obj;
		   }
		   public void display(){
			System.out.println(" Constructorclass  Example");
		   }
		   public static void main(String args[]){
			//Object cannot be created directly due to private constructor 
		        //This way it is forced to create object via our method where
		        //we have logic for only one object creation
			   Constructorclass  myobject=  Constructorclass .objectCreationMethod();
			myobject.display();
		   }
		}



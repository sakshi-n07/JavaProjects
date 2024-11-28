package com.cg.java8.myInterface;
 @FunctionalInterface
public interface MyInterface {
	 
	 void display();
	 
	 default public void hello()
	 {
		 System.out.println("Hello");
	 }
	
	 default public void greeting()
	 {
		 System.out.println("Good morning"); //multiple default methods allowed
	 }
	
}

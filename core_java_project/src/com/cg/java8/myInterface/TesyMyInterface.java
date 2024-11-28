package com.cg.java8.myInterface;
 
public class TesyMyInterface implements MyInterface {
	
    @Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Capgemini");
	}
    
    public static void main(String[]args)
    {
    	TesyMyInterface t = new TesyMyInterface();
    	t.display();
    	t.hello();
    	t.greeting();
    }
}

package com.cg.MyException;


public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			checkAge(10);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
		public static void checkAge(int x) throws ArithmeticException, RuntimeException {
			
		 if(x<18)
		 {
			 throw new ArithmeticException("under age");
		 }
		 else {
			 System.out.println("Age is valid");
		 }
		  
		 if(x>50) {
			 throw new RuntimeException ("over age");
		 }
		 else
		 {
			 System.out.println("age is valid");
		 }
			
		}
	}

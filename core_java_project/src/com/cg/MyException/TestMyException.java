package com.cg.MyException;

public class TestMyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
		int [] arr= {10,20,30};
		System.out.println(arr[1]);
		String str = null;
		System.out.println(str.length());
	
		}
	
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of bound values  "+e.getMessage());
		}
		
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("excep");
		}*/
		
		
		catch (ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		finally
		{
			System.out.println("helloo");
		}
		System.out.println("Handling exception");
		
	
		
		
	}

}

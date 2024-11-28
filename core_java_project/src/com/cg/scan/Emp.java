package com.cg.scan;
import java.util.Scanner;
public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Gender:");
		char gender=sc.next().charAt(0);
		
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		
		System.out.println("Enter mobile number:");
		long mobile=sc.nextLong();
		
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
		System.out.println("Mobile:"+mobile);
		
	}
}

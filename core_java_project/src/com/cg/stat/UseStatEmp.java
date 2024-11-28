package com.cg.stat;

import java.util.Scanner;

public class UseStatEmp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Salary:");
		double salary=sc.nextDouble();
		
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		
		StatEmp emp1 = new StatEmp();
		StatEmp emp2 = new StatEmp();
		emp1.display();
		emp2.display();
		
	}

	}


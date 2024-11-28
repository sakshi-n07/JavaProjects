package com.cg.emp;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 =new Employee(1,"sam",50000);
		System.out.println(emp1);
		System.out.println(emp1.getId());
		System.out.println(emp1.name);
		emp1.setId(100);
		System.out.println(emp1.getId());
		System.out.println(emp1);
		
		
	}

}

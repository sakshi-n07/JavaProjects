package com.cg.inherit;

public class UseEmployee1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Employee1[] emp = new Employee1[2];
		emp[0]= new FullTimeEmployee1(1,"sam",50000);
		emp[1]= new PartTimeEmployee1(2,"Alex",25);
		
		for(Employee1 e1 : emp) {
			e1.display();
			System.out.println();
		}
		 
			
	}
	

}

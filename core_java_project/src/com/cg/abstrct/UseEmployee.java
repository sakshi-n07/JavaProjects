package com.cg.abstrct;

public class UseEmployee {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Employee[] emp = new Employee[2];
		emp[0]= new FullTimeEmployee(1,"sam",50000);
		emp[1]= new PartTimeEmployee(2,"Alex",25, 45);
		
		
		for(Employee e1 : emp) {
			e1.display();
			System.out.println();
		}
		
		double s= emp[0].CalculateSalary();
		System.out.println("Salary of fulltime:"+s);
		double h = emp[1].CalculateSalary();
		System.out.println("Salaary of part time:"+h);
		 
			
	}
	

}

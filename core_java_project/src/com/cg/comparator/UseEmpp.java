
package com.cg.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
 
public class UseEmpp {
	public static void main(String [] args)
	{
		ArrayList<Empp>emplist=new ArrayList<>();
 
		Empp emp1 =new Empp(1,"Jack",244);
		Empp emp2 =new Empp(2,"Ruhi",700);
		Empp emp3 =new Empp(3,"Adan",400);
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		for(Empp e:emplist)
		{
			System.out.println(e);
		}

	System.out.println("salary sorting:");
		Collections.sort (emplist,new SalaryComparator());
		for(Empp e:emplist)
		{
			System.out.println(e);
		}
		System.out.println("name sorting:");
		Collections.sort (emplist,new NameComparator());
		
		for(Empp e:emplist)
		{
			System.out.println(e);
		}
		
		System.out.println("Max salary");
		System.out.println(Collections.max(emplist, new MaxComparator()));
		
		System.out.println("Min Salary");
		System.out.println(Collections.min(emplist, new MinComparator()));
 
	
	}
}
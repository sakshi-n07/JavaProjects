package com.cg.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
 
public class UseEmpp {
	public static void main(String [] args)
	{
		ArrayList<Empp>emplist=new ArrayList<>();
 
		Empp emp1 =new Empp(1,"jack",133);
		Empp emp2 =new Empp(2,"adan",244);
		emplist.add(emp1);
		emplist.add(emp2);
		for(Empp e:emplist)
		{
			System.out.println(e);
		}
		Collections.sort(emplist);
		
		
		
  	/*emp1=emp2;
		if(emp1==emp2)
		{
		System.out.println("true");
		System.out.println(emp1);
		System.out.println(emp2);
	}
	else
	{
			System.out.println("false");
		}
	System.out.println(emp1.equals(emp2));
	System.out.println(emp1.hashCode());
	System.out.println(emp2.hashCode());
	System.out.println(emp1.equals(emp2));

	}*/
	
 
	
	}
}
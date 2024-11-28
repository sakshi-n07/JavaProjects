package com.cg.MyCollection;
import java.util.List;
import java.util.ListIterator;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>a1=new ArrayList();
		a1.add(5);
		a1.add(19);
		a1.add(34);
		a1.add(null);

		int a=a1.size();
		
		ListIterator it=a1.listIterator();
		while (it.hasNext())
		{
			System.out.println("ELEMENT:"+it.next());
		
		}
		while (it.hasPrevious())
		{
			System.out.println("ELEMENT:"+it.previous());
		
		}

	}

}

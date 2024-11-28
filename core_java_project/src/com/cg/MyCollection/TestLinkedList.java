package com.cg.MyCollection;

import java.util.List;
import java.util.LinkedList;

public class TestLinkedList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1= new LinkedList < >();
		l1.add("hello");
		l1.add("Java");
		l1.add("Collection");
		l1.addLast("saku");
		l1.addFirst("GM");
		l1.remove(3);
		int a=l1.size();
		System.out.println(a);
		for (String str:l1)
		{
			System.out.println(str);
		}

	
		
	}

}

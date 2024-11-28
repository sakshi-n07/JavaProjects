package com.cg.MyCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
		System.out.println("List: "+listNumbers);
		
		Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
		
		//Set <Integer> s= new HashSet<>();
		System.out.println("Unique nos.: "+uniqueNumbers); //unique member
		
				//Bulk Operations
				//a. subset
				Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
				Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));
				System.out.println("s1: "+s1);
				System.out.println("s2: "+s2);
				
				if (s1.containsAll(s2)) {
				    System.out.println("s2 is a subset of s1");
				   
				//b. union
				    s1.addAll(s2);
				    System.out.println("s1 after union: " + s1);
				   
				  //c. Intersection
				    s1.retainAll(s2);		   
				    System.out.println("s1 after intersection: " + s1);
		 
				}
	}

}

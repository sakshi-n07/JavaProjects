package com.cg.play_with_string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Apples";//using string literal in constant pool
	
		String s2="Mango";
		String s4="aPPLes";
		String s3=new String("Apples"); //using separate object in heap
		
		
		System.out.println(s1.length());
		System.out.println(s1.substring(3));
		System.out.println(s1.charAt(4));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.trim());
		
		System.out.println(s1==s2);//checks references
		System.out.println(s1.equals(s2));//checks values
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		
		//string class methods
		StringBuilder sb=new StringBuilder("Hello"); // non-synchronized-- faster
		StringBuffer sbf=new StringBuffer("Hi");// synchronized
		
		sb.append("Capgemini");
		sb.replace(0, 5, "hello google");
		System.out.println(sb);
		
		sbf.append("Capgemini");
		System.out.println(sbf);
		
		String s12="why we are feeling hot";
		String[] words= s12.split(" ");
		for(String word:words) {
			System.out.println(word);
		}
	}
//accept sentence from user find total no. of words present in the sentence 
	//check for palindromes, 
	//vowels,consonant,
	//frequency of each word. 
	//count number of spaces, 
	//count total no, of special characters
}

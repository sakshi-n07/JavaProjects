package com.cg.basics;

public class Use_datatypes {
	public static void main(String[] args) {
		int id = 10012;
		String name= "Sakshi";
		int age =  22;
		double salary = 24500.50;
		System.out.println("Hello" +name);
		System.out.println("Your id is" +id);
		System.out.println("Your age is"+age);
		System.out.println("Your Salary is"+salary);
		
		// if else
		if(age>18) {
			System.out.println("ADULT");
		}
		else if(age<18 && age>12 ) {
			System.out.println("TEEN");
		}
		else
		{
			System.out.println("KID");
		}
		
		// switch
		char ch='d';
		switch(ch) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonant");
			break;
		}
		
		// for, while, do-while
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		int j=0;
		while(j<=20)
		{
			System.out.println(j);
			j=j+3;
		}
		
		int k=0;
		do {
			System.out.println(k);
			k=k+5;
		}while(k<50);
		
		
		//even no.s
		for(int a=0;a<=10;a++)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
		}
	} 

}
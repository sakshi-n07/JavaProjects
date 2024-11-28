package com.cg.MyCollection;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(5);
		s.push(87);
		s.push("stack");
		s.push(43.42);
		s.push(87);
		
		s.pop();
		System.out.println(s);

	}

}

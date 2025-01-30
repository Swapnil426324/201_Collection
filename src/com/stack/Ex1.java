package com.stack;

import java.util.Stack;

public class Ex1 {

	public static void main(String[] args) {
		Stack<Integer> obj = new Stack<>();
		// adding element by push()
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		
		System.out.println(obj);
		
		//remove element pop()
		System.out.println(obj.pop());
		System.out.println(obj);
		
		// find topmost element in list by peek()
		System.out.println(obj.peek()); // peek method represent the top most element
		
		System.out.println(obj);

	}

}

package com.stack;

import java.util.Stack;

public class Ex2 {

	public static void main(String[] args) {
		Stack<Integer> obj = new Stack<>();
		// adding element by push()
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		
		System.out.println(obj);
		
		// serching element position
		System.out.println(obj.search(10)); // start from top to bottom
        // element not exist it showing return value -1 value 
	}

}

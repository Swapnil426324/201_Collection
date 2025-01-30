package com.queue;

import java.util.ArrayDeque;

public class Ex2 {

	public static void main(String[] args) {
		ArrayDeque obj = new ArrayDeque<>();
		obj.add("anjali");
		obj.add("nikita");
		obj.add("sakshi");
		obj.add("suruchi");
		obj.add("bhavana");
		System.out.println(obj);
		
		obj.remove();
		System.out.println(obj);
		
		System.out.println(obj.element());
		System.out.println(obj);
		
		obj.add("ganesh");
		System.out.println(obj);
		

	}

}

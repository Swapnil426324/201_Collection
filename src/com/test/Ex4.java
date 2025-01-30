package com.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex4 {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList<>();
		obj.add("anjali");
		obj.add("nikita");
		obj.add("sakshi");
		obj.add("bhavana");
		
		System.out.println(obj);
		
		LinkedList obj1 = new LinkedList<>();
		obj1.addAll(obj);
		System.out.println("using linked list");
		System.out.println(obj1);
		
		obj1.addFirst("tejas");
		System.out.println(obj1);
		
		obj1.addLast("anuj");
		System.out.println(obj1);
		

	}

}

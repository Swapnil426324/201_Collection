package com.test;

import java.util.ArrayList;

public class ArraylistEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("rajesh");
		list.add("vaibhav");
		list.add("gaurav");
		list.add("mohit");
		
		System.out.println(list);
		list.add(2, "swapnil");
		System.out.println(list);
		
		list.remove(4);
		System.out.println(list);

	}

}

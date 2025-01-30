package com.test;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<String> obj = new Vector<>();
		obj.add("apple");
		obj.add("orange");
		obj.add("banana");
		obj.add("orange");
		obj.add("mango");
		obj.add("chiku");
		obj.add("apple");
		obj.add("orange");
		obj.add("banana");
		obj.add("orange");
		obj.add("mango");
		obj.add("chiku");
		
		System.out.println(obj);
		System.out.println("size = "+obj.size());
		System.out.println("capacity = "+obj.capacity());

	}

}

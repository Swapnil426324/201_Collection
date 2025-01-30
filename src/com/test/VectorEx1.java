package com.test;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector<String> obj = new Vector<>();
		obj.add("Ganesh");
		obj.add("Pratik");
		obj.add("Nitin");
		obj.add("Akash");
		obj.add("Mangesh");
		obj.add("Pradip");
		obj.add("Lokesh");
		obj.add("Kajal");
		obj.add("Nikita");
		
		System.out.println(obj);
		System.out.println(obj.subList(2, 5));
	}

}

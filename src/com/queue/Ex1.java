package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Ex1 {

	public static void main(String[] args) {
		Queue obj = new LinkedList<>();
		obj.add("anjali");
		obj.add("nikita");
		obj.add("sakshi");
		obj.add("suruchi");
		obj.add("bhavana");
		System.out.println(obj);
		
		System.out.println(obj.remove()); //remove element it remove first added element

		System.out.println(obj);
		System.out.println(obj.element()); // find front element location
		System.out.println(obj);
		
		System.out.println(obj.remove());
		System.out.println(obj);
		
		obj.add("aniket");
		System.out.println(obj);
	}

}

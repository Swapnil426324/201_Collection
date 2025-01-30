package com.queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<String> obj = new PriorityQueue<>();
		obj.add("ankita");
		obj.add("nikita");
		obj.add("bhavana");
		obj.add("sakshi");
		obj.add("anjali");
		System.out.println(obj);
		
		System.out.println(obj.element());
		System.out.println(obj);
		System.out.println(obj.remove());
		System.out.println(obj);
		
		obj.add("darshan");
		System.out.println(obj);

	}

}

package com.map;

import java.util.HashMap;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("anjali", newInteger(101));
		hm.put("sakshi", newInteger(102));
		hm.put("nikita", newInteger(103));
		hm.put("bhavna", newInteger(104));
		hm.put("trupti", newInteger(105));
		
		System.out.println(hm);

		
	}

	private static Integer newInteger(int i) {
		return i;
	}

	
}

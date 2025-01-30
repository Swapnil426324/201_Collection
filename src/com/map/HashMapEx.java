package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Ganesh", "Pune-Kolhapur");
		hm.put("Aniket", "Pune-Mumbai");
		hm.put("Darshan", "Nagpur-Pune");
		hm.put("Akash", "Latur-Pune");
		hm.put("Manoj", "Pune-Latur");
		hm.put("Tejas", "Pune-Latur");
		
		System.out.println(hm);
		Set<String> set =hm.keySet();
		System.out.println(set);
		
		Collection<String> value = hm.values();
		System.out.println(value);
		
		System.out.println(hm.containsKey("Ganesh"));
		hm.remove("Darshan");
		System.out.println(hm);
		
		hm.put("Pratik", "Akola-Pune");
		System.out.println(hm);

	}

}

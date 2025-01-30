package com.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ConvertDuplicateToUnique {
// how to convert duplicate list to unique list
	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		obj.add("apple");
		obj.add("orange");
		obj.add("banana");
		obj.add("orange");
		obj.add("mango");
		obj.add("chiku");
		
		System.out.println(obj);
		
		Set<String> obj1 = new LinkedHashSet<String>(obj);
		System.out.println(obj1);

	}

}

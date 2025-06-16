package com.test;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		Object ol[] = list.toArray();
		System.out.println("using static array");
		int i;
		for( i=0;i<ol.length;i++) {
			System.out.println(ol[i]);
		}System.out.println();

	}

}

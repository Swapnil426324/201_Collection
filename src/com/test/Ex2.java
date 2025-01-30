package com.test;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		boolean b = list.contains(30);
		if(b) {
			System.out.println("element already exits");
		}
		else
		{
			System.out.println("not exites");
		}

	}

}

package com.test.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start...");
		List<String> list1=new ArrayList<String>();
		list1.add("Bubai");
		list1.add("Abhijit");
		list1.add("Santanu");
		list1.add("Abhrajit");
		list1.add("Papai");
		
		list1.sort((String s1,String s2)-> s1.compareTo(s2));
		System.out.println(list1);
	}

	private void sortUsingJava8(List names)
	{
		Collections.sort(names,(String s1,String s2) -> s1.compareTo(s2));
	}
}

package com.mukund.tree;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		final List<String> list = new ArrayList<String>();
		list.add("Test");
		
		list.stream().forEach(System.out::println);

	}

}

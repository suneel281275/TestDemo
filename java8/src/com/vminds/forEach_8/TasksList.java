package com.vminds.forEach_8;

import java.util.Arrays;
import java.util.List;

public class TasksList {

	public static void main(String[] args) {

		String[] s = new String[] { "corejava", "spring", "junit", "hibernate", "webservices", "selenuim", "AngularJS",
				"servlets/jsp" };

		List<String> tasks = Arrays.asList(s);

		// forloop
		System.out.println("normal for loop method");
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println(tasks.get(i));
		}

		// enhanced forloop
		System.out.println("Enhanced for loop");
		for (String s1 : tasks) {
			System.out.println(s1);

		}

		// forEach method java 1.8 added feature
		System.out.println("java 1.8 foreach method");
		tasks.forEach(fe -> System.out.println(fe));

	}

}

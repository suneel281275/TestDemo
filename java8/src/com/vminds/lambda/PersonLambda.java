package com.vminds.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.vminds.lambda.Person;

public class PersonLambda {

	public static void main(String[] args) {

		List<Person> lambdaperson = Arrays.asList(new Person("suneel", "varma", 25, "bang"),
				new Person("suneel1", "varma1", 24, "bang1"), new Person("suneel2", "varma2", 23, "bang2"),
				new Person("suneel3", "varma3", 24, "bang3"), new Person("", "abc", 24, "hyd"),
				new Person("bbbb", "bca", 24, "chen"), new Person("aaaa", "cab", 24, "pune"),
				new Person("vminds", "minds", 35, "ecity"));

		// sort all the elements
		System.out.println("sort all the elements");
		printcondition(lambdaperson, p -> true);

		// sort all lastnamewith char 'v'
		System.out.println("sort all lastnamewith char 'v'");
		printcondition(lambdaperson, p -> p.getLastName().startsWith("v"));

		// sort all firstnamewith char's'
		System.out.println("sort all firstnamewith char'b'");
		printcondition(lambdaperson, p -> p.getFirstName().startsWith("b"));

		// sort the elements taking last name as ascending order

		System.out.println("sort the elements taking last name as ascending order");
		Collections.sort(lambdaperson, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		System.out.println(lambdaperson);

	}

	private static void printcondition(List<com.vminds.lambda.Person> person, Condition condition) {
		for (Person p : person) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}

	}

}

interface Condition {
	boolean test(Person p);
}

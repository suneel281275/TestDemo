package com.vminds.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		// normal java 1.7 to implement the filter condition

		List<String> technologies = Arrays.asList("corejava", "servlets/jsp", "jdbc/hibernate", "struts/spring",
				"webservices", "oracle/mysql/mongodb", "AngularJS", "selenuim");

		List<String> result = getFilter(technologies, "selenuim");

		System.out.println(result);

		// java pgm to get the person with the name

		List<String> names = Arrays.asList("suneel", "varma", "raja", "abc", "vminds");

		String nameresult = getName(names, "suneel");

		System.out.println("getname-->" + nameresult);

		// java 1.8 feature "stream with filter & collect condutions

		List<String> result8 = technologies.stream().filter(tech -> !"selenuim".equals(tech))
				.collect(Collectors.toList());
		System.out.println("java8");
		result8.forEach(System.out::println);

		// java 1.8 pgm to get the person with the name findany() & orElse

		String nameresult8 = names.stream().filter(x -> "suneel".equals(x)).findAny().orElse(null);

		System.out.println("java8 nameresult--->" + nameresult8);

		// work with more conditions filter conditions
		// By using 1.8 java feature

		Country c1 = new Country("hyd", 001);
		Country c2 = new Country("chn", 002);
		Country c3 = new Country("bang", 003);

		List<Country> streamcountry = new ArrayList();

		streamcountry.add(c1);
		streamcountry.add(c2);
		streamcountry.add(c3);

		Country countryResult = streamcountry.stream().filter(x -> "bang".equals(x.getName()) && 003 == x.getCode())
				.findAny().orElse(null);

		System.out.println("more filter conditions----->" + countryResult.getName() + "--->" + countryResult.getCode());

		// filter() & map() example

		String name = streamcountry.stream().filter(y -> "hyd".equals(y.getName())).map(Country::getName).findAny()
				.orElse(null);
		int code = streamcountry.stream().filter(z -> 001 == z.getCode()).map(Country::getCode).findAny().orElse(null);

		System.out.println("// filter() & map() example" + name + "----------------" + code);

	}

	private static String getName(List<String> names, String name1) {
		String name = null;
		for (String s : names) {
			if (name1.equals(s)) {
				name = name1;
			}
		}

		return name;
	}

	// java 1.7 implement the filter condition
	private static List<String> getFilter(List<String> technologies, String string) {
		List<String> result = new ArrayList();
		for (String s : technologies) {
			if (!"selenuim".equals(s)) {
				result.add(s);
			}
		}
		return result;
	}

}

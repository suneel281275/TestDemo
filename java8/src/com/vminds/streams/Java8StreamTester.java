package com.vminds.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8StreamTester {
	
	public static void main(String[] args) {

		System.out.println("***************************By using java7**************************************");

		List<String> ls = Arrays.asList("abc", "", "zyx", "rty", "gopi", "pradeep", "1wer2", "zop", "", "a", "", "vf");

		System.out.println("given objects--->" + ls);

		// count empty string

		int emptyStrings = getEmptyJava7(ls);

		System.out.println("count empty string---->" + emptyStrings);

		// getcount length --> 3 which is having on the list

		int countlength3 = getcountlength3java7(ls);

		System.out.println("countlength3--->" + countlength3);

		// Eliminate empty string

		List<String> remainingStrings7 = eliminateEmptyStringjava7(ls);

		System.out.println("remainingStrings7----->" + remainingStrings7);

		// Eliminate empty string & joining using comma or merged

		String newStrings = deleteEmptyStrings7(ls, ",");

		System.out.println("deleteEmptyStrings7----->" + newStrings);

		// get list of distinct square numbers

		List<Integer> lint = Arrays.asList(1, 2, 4, 6, 7, 3, 8, 9);

		List<Integer> resultlint = getSquares(lint);

		System.out.println("distinct square numbers-->" + resultlint);

		// SOME DEFAULT FUNCTIONS OPEARATIONS

		List<Integer> deflist = Arrays.asList(01, 4, 7, 89, 43, 5, 6, 23, 21, 90, 29, 56, 24, 9, 65);

		System.out.println("deflist--->" + deflist);
		System.out.println("highest number--->" + getMax(deflist));
		System.out.println("minimum number---->" + getMin(deflist));
		System.out.println("sum of all numbers--->" + getSum(deflist));
		System.out.println("Avg of numbers--->" + getAvg(deflist));

		// print the random numbers

		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			System.out.println("random numbers-->" + random.nextInt());
		}

		System.out.println(
				"******************************************USING JAVA8 FEATURES********************************************");

		System.out.println("given objects in JAVA8--->" + ls);

		// empty strings

		int emptyStrings_8 = (int) ls.stream().filter(emp -> emp.isEmpty()).count();
		System.out.println("emptyStrings_8----->" + emptyStrings_8);

		// getcount length --> 3 which is having on the list

		int countlength3_8 = (int) ls.stream().filter(clength -> clength.length() == 3).count();
		System.out.println("countlength3_8--->" + countlength3_8);

		//// Eliminate empty string

		List<String> remainingStrings8 = ls.stream().filter(remstrings -> !remstrings.isEmpty())
				.collect(Collectors.toList());
		System.out.println("remainingStrings8--->" + remainingStrings8);

		//// Eliminate empty string & joining using comma or merged

		String mergedStrings8 = ls.stream().filter(merge -> !merge.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("mergedStrings8" + mergedStrings8);

		//// get list of distinct square numbers

		List<Integer> distinct_8 = lint.stream().map(num -> num * num).distinct().collect(Collectors.toList());
		System.out.println("distinct_8--->" + distinct_8);

		// parallelStream

		int parallelstream8 = (int) ls.parallelStream().filter(pallel -> pallel.isEmpty()).count();
		System.out.println("parallelstream8--->" + parallelstream8);

		System.out.println("**********************************************JAVA8***********************************");

	}

	private static int getAvg(List<Integer> deflist) {
		
		int sum=0;
		int size=deflist.size();
		
		for(int i=0;i<deflist.size();i++){
			sum+=deflist.get(i);
		}
		
		return sum/size;
	}

	private static int getSum(List<Integer> deflist) {
		
		int sum=0;
		for(int i=0;i<deflist.size();i++){
			sum+=deflist.get(i);
		}
		return sum;
	}

	private static int getMin(List<Integer> deflist) {
       int min=deflist.get(0);
       
		for(int i=0;i<deflist.size();i++){
			
			int number=deflist.get(i);
			
			if(number<min){
				min=number;
			}
			
		}
		
		return min ;
	}

	private static int getMax(List<Integer> deflist) {
		int max=deflist.get(0);
		
		for(int i=1;i<deflist.size();i++){
			int number=deflist.get(i);
			
			if(number>max){
				max=number;
			}
			
		}
		return max;
	}

	private static List<Integer> getSquares(List<Integer> lint) {
		List<Integer> templint=new ArrayList<>();
		
		for(Integer number : lint){
			
			Integer square=new Integer(number.intValue()*number.intValue());
			
			if(!templint.contains(square)){
				templint.add(square);
			}
			
		}
		
		return templint;
	}

	private static String deleteEmptyStrings7(List<String> ls,String delimiter) {
		StringBuilder sb=new StringBuilder();
		for(String s: ls){
			if(!s.isEmpty()){
				sb.append(s);
				sb.append(delimiter);
			}
		}
		
	  String merge =sb.toString();
	  return merge.substring(0, merge.length()-2);
	}

	private static List<String> eliminateEmptyStringjava7(List<String> ls) {
		List<String> result=new ArrayList<>();
		
		for(String s : ls){
		if(!s.isEmpty()){
			result.add(s);
		}
		}
		return result;
	}

	private static int getcountlength3java7(List<String> ls) {
		int count=0;
		for(String s: ls){
			if(s.length()==3){
				count++;
			}
		}
		return count;
	}

	private static int getEmptyJava7(List<String> ls) {
		
		int count =0;
		
		for(String s: ls){
			if(s.isEmpty()){
			count++;	
			}
		}
		
		return count;
	}

}

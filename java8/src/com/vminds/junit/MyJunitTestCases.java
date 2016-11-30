package com.vminds.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.vminds.streams.Java8StreamTester;

public class MyJunitTestCases {
	
	
  @Test
  public void test(){
	 
	 List<String> ls =Arrays.asList("","abc","",""); 
	  
	 //assertEquals(expected,actual)
	 
	  assertEquals(2,Java8StreamTester.getEmptyJava7(ls));
  }
  
  @Test
  public void 
	

}

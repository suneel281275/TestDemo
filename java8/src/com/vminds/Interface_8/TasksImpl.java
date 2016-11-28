package com.vminds.Interface_8;

public class TasksImpl implements Tasks {

	@Override
	public void todayTasks() {
		System.out.println("java 1.8 features");
	}
	
	public void featureTasks() {
		System.out.println("override method");
	}
	
	public static void main(String[] args) {
		
		Tasks tasks =new TasksImpl();
		tasks.todayTasks();
		tasks.featureTasks();
		
	}
	

}

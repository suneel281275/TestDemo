package com.vminds.Interface_8;

public interface Tasks {
	
	void todayTasks();
	
	// java 1.8 feature will define method in interface with certain conditions
	// modifier should be default
	
	default void featureTasks(){
		System.out.println("implemented in future requirements");
	}

}

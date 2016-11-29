package com.vminds.lambda;

public class lambdaExample {
	
	public static void main(String[] args) {
		
		lambdaExample le =new lambdaExample();
		
		// " -> " lambda symbol 
		
		MathOpearation addition =(int a,int b)->a+b;
		
		MathOpearation subtraction=(a,b)->a-b;
		
		MathOpearation multipication=(a,b)->{
			return a*b;
		};
		
		MathOpearation division =(a,b)->a/b;
		
		System.out.println("addition"+le.opearate(5, 10, addition));
		
		System.out.println("subtraction"+le.opearate(5, 10, subtraction));
		
		System.out.println("division"+le.opearate(5, 10, division));
		
		System.out.println("multipication"+le.opearate(5, 10, multipication));
		
		GreetingService gslambda =(String message) ->System.out.println(message);
		
		GreetingService gslambda1=message->System.out.println(message);
		
		gslambda.sayMessage("hi suneel");
		gslambda1.sayMessage("helllooooooo");
	}
	
	interface MathOpearation{
		int opearation(int a, int b);
	}
	
	interface GreetingService{
		void sayMessage(String message);
	}
	
	private int opearate(int a,int b,MathOpearation mathopearation){
		return mathopearation.opearation(a, b); 
		
	}

}

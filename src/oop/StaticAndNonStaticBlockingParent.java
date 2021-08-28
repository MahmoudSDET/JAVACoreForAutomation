package oop;

public class StaticAndNonStaticBlockingParent {
	
	StaticAndNonStaticBlockingParent(int a){
		
		System.out.println("Parent Constructor");  // step 5
	}
	
	
	{
		System.out.println("Parent Non Static Block"); // step6
	}
	static
	{
		System.out.println("Super class Static Block"); // step3
	}

	

}

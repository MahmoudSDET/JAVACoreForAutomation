package oop;

public class StaticAndNonStaticBlockingChild extends StaticAndNonStaticBlockingParent {

	
	
   StaticAndNonStaticBlockingChild()
	{
		super(10);  // step 2
		
		System.out.println("Child Constructor"); // step 8
	}
   
   StaticAndNonStaticBlockingChild(int a)
	{
		this();  //step1
		System.out.println("Child Constructor 1 param"); // step 9  
	}
	{
		System.out.println("Child Non Static Block"); // step 7
	}
	static
	{
		System.out.println("Child Static Block");  // step 4
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new StaticAndNonStaticBlockingChild(10); // step 0
		
	
	}

}

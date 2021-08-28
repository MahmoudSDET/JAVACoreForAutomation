package oop;

public class StaticAndStaticBlockingConstructors {

	
	
	static
	{
		System.out.println("Static Block 1");
	}
	
	static
	{
		System.out.println("Static Block 2");
	}
	
	
	{
		System.out.println("Non-Static Block");
	}
	
	StaticAndStaticBlockingConstructors(){
		
		
		System.out.println("Parent const");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticAndStaticBlockingConstructors test=		new StaticAndStaticBlockingConstructors();

	}

}

package coreJaveBasics;

public class Class_1 {
	
	void login()
	{
		int a=40;
		System.out.println("Login Success"+" "+a);
	}

	
	static int add( int a, int b)
	{
		int c=a+b;                  
		return c;	
	}
	
	
   static	 int Subtract( int a, int b)
	{
		int c=a-b;
		return c;	
	}
	 
	 int multiplication( int a, int b)
		{
			int c=a*b;
			return c;	
		}
	static String add1()
	{
		String name="Pankaj";
		return "Ranjan";	
	}

	static void Printing(int a,int c)
	{
	       int b=a+c;
	      System.out.print(b);
	       
	      
	       
	       
	}

	public static void main(String[] args) {
		
		int Addingresult=add(10,20);
		
		System.out.println(Addingresult);
		
         int Subtractresult=Subtract(10,20);
		
		System.out.println(Subtractresult);
		
		 Class_1 c1=new Class_1();
		 
		 c1.login();
		 
	     Printing(50, 60);
		
		

	}

}

package exceptionHandling;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		try
		{
		int b=a/0;
		System.out.println(b);
		}
		catch(Throwable e)
		{
			System.out.println("A Number can't be divided by Zero");
		}
		System.out.println("End");

        
		/*int a=20;
		int b=a/0;
		System.out.println(b);
		*/
		
		
		
	}

}

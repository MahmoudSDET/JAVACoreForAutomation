package exceptionHandling;

public class TryWithCatchAndFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Start 1-------");
		System.out.println("Start 2-------");
		try
		{
		int a=20/0;
		
		System.out.println(a); 
		
		
		}
		catch(ArithmeticException e)
		{
			System.out.println(e); 
			System.exit(0);
		}
		finally
		{
			System.out.println("This will execute Always"); 
		}

		System.out.println("End---------");

	}

}

package exceptionHandling;

import java.lang.Exception;

public class ExceptionLastExample {

	static void validateAge(int Age) throws Exception
	{
		if(Age>18)
		{
			System.out.println("Eligible for Vote");
		}
		else
		{
			System.out.println("Not Eligible for Vote");
			throw new  Exception();
		}
		
		System.out.println("Voted Successfully");
	}
	public static void main(String[] args) throws Exception
	{
		validateAge(12);

	}
	
	 
	
		



}

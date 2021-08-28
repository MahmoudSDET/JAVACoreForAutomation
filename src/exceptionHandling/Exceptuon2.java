package exceptionHandling;

public class Exceptuon2 {

	public static void main(String[] args) throws java.lang.Exception  {
		// TODO Auto-generated method stub
		Exceptuon2 t=new Exceptuon2();
		
		
			t.method1();
		
		

	}
	
	void method1() throws java.lang.Exception
	{
		throw new MathmaticExceptionByPankaj();//Creating/Throwing the Exception
	}


}

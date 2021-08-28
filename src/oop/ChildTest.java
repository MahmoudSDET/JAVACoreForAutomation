package oop;

public class ChildTest extends ParentTest {
	
	/*String name="Pankaj";
	public void method1()
	{
		System.out.println(" I Am method 1");
	}*/
	int salary=100000;
	public void method2()
	{
		System.out.println("Method 2");
	}
	public static void main(String[] args) {
		ChildTest t=new ChildTest();
		System.out.println(t.name);
		System.out.println(t.salary);

	

	}

}

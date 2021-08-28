package oop;

public class OverrideChild extends OverrideParent {
	
	
	
	

	 public void disp(int a,int b){
			System.out.println("disp() method of Child class"+" "+(a+b));
		   }
		   public void newMethod(){
			System.out.println("new method of child class");
		   }
		   
		   
		   
		   
		   
		   public  void dip( int a,int b)
		   {
			
			//final int z=8;
			System.out.println("disp() method of child class"+" "+(a+b)+" ");
		   }
		   
		   
		   public static void main( String args[]) {
			/* When Parent class reference refers to the parent class object
			 * then in this case overridden method (the method of parent class)
			 *  is called.
			 */
			OverrideParent obj = new OverrideParent();
			obj.disp(5,8);
			obj.dip(45, 6);

			/* When parent class reference refers to the child class object
			 * then the overriding method (method of child class) is called.
			 * This is called dynamic method dispatch and runtime polymorphism
			 */
			OverrideParent obj2 = new OverrideChild();
			
			obj2.disp(9,8);
			obj2.dip(34, 98);
			
			
			
			
			OverrideChild obj3 = new OverrideChild();
			obj2.disp(7,8);
			obj3.dip(6,8);
			
		
			
			
			
		   }

}

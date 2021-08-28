package oop;

public class AccessModifierChild extends AccessModifierParent{
	
	private  int t;
	private  int s;
	
	
	public void setT(int a)
	   {
		   this.t=a;
		  
		   
		   
		   
	   }
	   
	   public void setS(int b)
	   {
		   this.s=b;
		  
		   
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   public int getT()
	   {
		   return t;
	   }

	   public int getS()
	   {
		   return s;
	   }

	
	
	
	public static void main(String[] args) {
		
		// instannce child class
		
		AccessModifierChild child_1=new AccessModifierChild();
		
		
		
        child_1.setX(9);
		
		child_1.setY(8);
		
		System.out.println(child_1.getX()+child_1.getY());
		
		
		child_1.setS(7);
		child_1.setT(6);
		
		System.out.println(child_1.getS()+child_1.getT());
		
		// instance from parent to child
		
		AccessModifierParent child_2=new AccessModifierChild();
		
		
		
		child_2.setX(10);
		child_2.setY(11);
		
		child_1.t=child_2.getX();
		child_1.s=child_2.getY();
		System.out.println(child_1.t);
		
		System.out.println(child_1.s);
		
		
		
		// creating instance from parent
		AccessModifierParent parent=new AccessModifierParent();
		
		parent.setX(4);
		
		parent.setY(2);
		
		child_1.t=parent.getX();
		child_1.s=parent.getY();
		
	int test=parent.getX();
	
	
	    test=child_1.t;
	
	    System.out.println(test);
		
			
       System.out.println(child_1.t);
		
		System.out.println(child_1.s);
			

		}

}

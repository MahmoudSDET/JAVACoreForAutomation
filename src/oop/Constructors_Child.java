package oop;

public class Constructors_Child  extends Constructors_Parent{

	private int t;
	private int s;
	
	public  Constructors_Child() {
		
		super();
		
	}
	
public  Constructors_Child(int x,int y) {
		
	  super(x,y);
	   this.t=x;
	   this.s=y;

		
	}

public static void main(String[] args) {
	
	
	
	Constructors_Parent tp1=new Constructors_Parent();
	 System.out.println(	tp1.addition());
	
	
	Constructors_Parent tp2=new Constructors_Parent(9,8);
	
         System.out.println(	tp2.addition());
         
     	Constructors_Parent tc2=new Constructors_Child();
     	
     	System.out.println(	tc2.addition());
     	
     	Constructors_Child tc4=new Constructors_Child(12,14);
     	tp2=tc4;
     
     	System.out.println(	tc4.t);
     	System.out.println(	tc4.s);
     	
     	System.out.println(	tp2.x);
     	System.out.println(	tp2.y);
     	
     	Constructors_Parent tc3=new Constructors_Child(10,11);
     	
     	
    
     	
    	System.out.println(	tc3.addition());
    	
    	
    	
    	
         
		
		}

}

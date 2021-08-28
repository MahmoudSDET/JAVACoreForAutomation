package oop;

import coreJaveBasics.ParentClass;

public class ConstructorsChild extends ConstructorsParent{
	 int a;
	ConstructorsChild(int b,int c){
		
	super(b,6);
	
	System.out.println("iam a child constructor");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstructorsChild ch=new ConstructorsChild(9,8);
		
		//
		//ConstructorsParent ch2=new ConstructorsChild(9,8);
		
		//
		ConstructorsParent cp=new ConstructorsParent(8, 10);
		
		

	}

}

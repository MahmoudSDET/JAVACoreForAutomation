package oop;

import java.net.InterfaceAddress;

public  class InterfaceChildClass extends AbstractionInterface implements InterfaceParent1Class,InterfaceParent2Class{

	
	
	public InterfaceChildClass()
	
	{
		
		System.out.println("iam InterfaceChildClass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
     InterfaceChildClass tc=new InterfaceChildClass();
     
     tc.run();
     tc.eat();
     tc.fly();
     tc.speed();
     tc.drink();
     tc.walk();
     
     // we can take instanse from abstract to point child class
     AbstractionInterface tp=new InterfaceChildClass();
     
    tp.drink();
    tp.eat();
    
    
    // we can take instanse from inerface to point child class
    InterfaceParent1Class tf1=new InterfaceChildClass();
    
    
    tf1.run();
    tf1.speed();
    
    InterfaceParent2Class tf2=new InterfaceChildClass();
    tf2.fly();
    tf2.speed();
    // we can not take intanse from interface only
   // InterfaceParent2Class tf2=new  InterfaceParent2Class ();
    // we can not take intanse from abstract only
 //   AbstractionInterface tp2=new  AbstractionInterface ();
    
    
      
	}

	@Override
	public  void run() {
		
		System.out.println("Run");
	}

	@Override
	public  void speed() {
		// TODO Auto-generated method stub
		
		System.out.println("Speed");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat");
	}

}

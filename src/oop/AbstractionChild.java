package oop;

public class AbstractionChild  extends AbstractionParent{

	
	
	AbstractionChild(){
		// override parent constructor at the child
	//	super(5,10);
		
		
		
	}
	
	
/*	AbstractionChild(){
		// override parent constructor at the child
		super();
		
		
	}*/
	
	
		
		@Override
		double calculatecontour(double width, double height) {
			
			
			double x=height*4;
			
			return x;
		}
		
		@Override
		double calculateArea() {
            
			
			double x=width*hight;
			
			return x; 
		}

	public static void main(String[] args) {
		
		// can not instantion from paren
		
	//	AbstractionParent p=new AbstractionParent(5,10);
		
		
		AbstractionParent p=new AbstractionChild();
		
		double area_1=p.calculateArea();
		System.out.println(area_1);
		/*double contor_1=p.calculatecontour(8,10);
		System.out.println(contor_1);
		//
	
	//	AbstractionChild c=new AbstractionChild(8,9);
		
		
		double area_2=p.calculateArea(8,9);
		System.out.println(area_2);
		double contor_2=p.calculatecontour(8,9);
		System.out.println(contor_2);
          */
	}

	
}


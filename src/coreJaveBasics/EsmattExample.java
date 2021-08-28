package coreJaveBasics;

public class EsmattExample {

	  int student;
      int weeks;
      int days;
      
      
      // non static funtions
      public static int CalcutionCourseDays(int weeks,int days)
      {
    	  int totaldays=weeks*days;
    	  
    	  return totaldays;
    	  
      }
      
      
public static void main(String[] args) {
 
	EsmattExample es=new EsmattExample();
	
 
 es.student= 10;
 es.weeks= 3;
 es.days= 4;
 int totaldays=es.CalcutionCourseDays(es.weeks, es.days);
 System.out.println("totaldays in eng101"+" " + totaldays + " "+"days" );
  }


}

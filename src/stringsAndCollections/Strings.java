package stringsAndCollections;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		char [] array={'P','A','N','K','A','J'};
		String s=new String(array);
		System.out.println(s);
		
		
		
		//Diff way to create Array
		
		// dynamic 
		String s1=new String("ABC");
		String s2=new String("XYZ");//By Using new 
		// st
		String s3="DEF";//String Literals	*/
		// literal
	/*	String s1="Pankaj";
		String s2="Gupta";
		String s3="Pankaj";
		String s7="Pankaj";
		// string object
		String s4=new String("Ranjan");
		String s5=new String("Pankaj");
		String s6=new String("Pankaj");
		
		
		System.out.println("Before "+s1);
		
		s1.concat("Gupta");//PankajGupta
		
		System.out.println("After Adding "+s1.concat("Gupta"));
		System.out.println(s1);
		
		//== Address
		System.out.println(s1==s2);//false
		
		System.out.println(s1==s3);//true
		System.out.println(s1==s4);//false
		
		System.out.println(s1==s5);//false
		//Equals - Contents
		System.out.println(s1.equals(s2));//false
		
		System.out.println(s1.equals(s3));//true
		
		System.out.println(s1.equals(s4));//false
		
		System.out.println(s1.equals(s5));//true
		
		//Methods
		String s8="I Love my Country";
		System.out.println(s8);
		
         */
		
		String s8="I Love my Country";
		
	//	System.out.println(s8);
		String [] arr=s8.split("e"); 
		// I >>>>>arr[0]
		//,Love My country
		
	   ///  Love >>>arr[1]
		
		// MY Country
		
		/*
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		if(s8.startsWith("I"))
		{
			System.out.println("Start with is >> Pass");
		}
		if(s8.contains("Love"))
		{
			System.out.println("Word is present");
		}
		if(s8.equals("Love"))
		{
			System.out.println("Word is present");
		}
		if(s8.equalsIgnoreCase("I love My Country"))
		{
			System.out.println("Equals method >>>>Word is present");
		}
		
		System.out.println(s8.toUpperCase());
	System.out.println(s8.toLowerCase());
     */
		/*String s1="Pankaj";
		System.out.println("Before concating > "+s1);//Pankaj
		s1.concat(" Gupta");//Pankaj Gupta
		System.out.println("After concating > "+s1);//Pankaj
		
		StringBuffer sb=new StringBuffer("Pankaj");
		System.out.println("Before adding this > "+sb);//Pankaj
		sb.append(" Gupta");////Pankaj Gupta
		System.out.println("After adding this > "+sb);//Pankaj Gupta
		/*
		StringBuilder sb1=new StringBuilder("Pankaj");
		System.out.println("Before adding this > "+sb1);//Pankaj
		sb1.append(" Gupta");////Pankaj Gupta
		System.out.println("After adding this > "+sb1);//Pankaj Gupta
		
		System.out.println("Reversing the string >"+sb.reverse());
          */
    /*
		StringBuffer s = new StringBuffer("Geek(sforGee)ks"); 
        s.delete(0, 4); 
        System.out.println(s); // returns forGeeks 
        s.deleteCharAt(7); 
        System.out.println(s); // returns forGeek 
        
        
        StringBuffer sb=new StringBuffer("Pankaj");
		System.out.println("Before adding this > "+sb);//Pankaj
		sb.append(" Gupta");////Pankaj Gupta
		System.out.println("After adding this > "+sb);//Pankaj Gupta
		

        
        StringBuilder sb1=new StringBuilder("Pankaj");
		System.out.println("Before adding this > "+sb1);//Pankaj
		sb1.append(" Gupta");
		////Pankaj Gupta
		System.out.println("After adding this > "+sb1);//Pankaj Gupta
		
		System.out.println("Reversing the string >"+sb1.reverse());
		
		
		String s1="Pankaj";
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("Element at 1th index "+s1.charAt(1));
		String s2="I love my Country";
		String [] arr=s2.split(" ");
		for (String string : arr) {
			System.out.println(string);*/
		
		String s1="Pankaj";
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("Element at 1th index "+s1.charAt(1));
		String s2="I love my Country";
		String [] arr3=s2.split(" ");
		
		for (String element : arr3) {
			System.out.println(element);




	}

	}
	
}

package coreJaveBasics;

import java.util.Scanner;

public class Loops {

	
	static Scanner console = new Scanner(System.in);
	static final int N = 20;
	public static void main(String[] args) {
	/*	for (int i = 5; i >0; i--) 
		{
			System.out.println("Login Failed"+i);
		}
     
		////////////////////////////////////////////////
		int i=5;
		
		System.out.print( i--);
		*/
		/////////////////////////////////////////////////
		
	/*	
		int a=2;
		do
		{
			
			System.out.println("Always Run"+ " "+a);
			--a;
			System.out.println("Always Run"+ " "+a);
		}
		while(a>1);
      */
		
	/*	
		int i=10;
		
		while(i<=10)
				
		{
			System.out.println(i);
			
			if(i==1)
			{
				
				continue;
				
				
			}
			
			i--;
			
			
			
			
			
		}*/
		
		int counter; //loop control variable
		int number; //variable to store the new number
		int zeros = 0; //Step 1
		int odds = 0; //Step 1
		int evens = 0; //Step 1
		System.out.println("Please enter " + N
		+ " integers, positive, "
		+ "negative, or zeros."); //Step 2
		for (counter = 1; counter <= N; counter++) //Step 3
		{
		number = console.nextInt(); //Step 3a
		System.out.print(number + " "); //Step 3b
		//Step 3c
		switch (number % 2)
		{
		case 0:
		evens++;
		if (number == 0)
		zeros++;
		break;
		case 1:
		case -1:
		odds++;
		}//end switch
		}//end for loop
		System.out.println();
		//Step 4
		System.out.println("There are " + evens + " evens, "
		+ "which also includes "
		+ zeros + " zeros");
		System.out.println("Total number of odds is: " + odds);
		}
	
		
		
		

	

}

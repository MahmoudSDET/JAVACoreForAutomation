package coreJaveBasics;

import java.util.Scanner;

public class Class_2 {

	public static void main(String[] args) {
		/*int Age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age:");
		Age=sc.nextInt();
	  // Logical Operators>> 
		
		
		
		*/
	   /*	int x=0;
	   	
	   	
		/*
		if ( (x > 1 )&&(x==0) || (x != 0) )
			
		{
			
			System.out.println("Please enter your age:"+x);
		}
		*/
		/*
		if(Age<18 & Age>40 && Age>30)
		{
			System.out.println("You are Eligible for vote");
		}
		else if(Age>18 || Age<5)
		{
			System.out.println("you are not Eligible");
		}
		else {
			System.out.println("you are not allowed");
			
		}
		*/
		
		int exp=4;
		String technology="Manual";
		switch (technology) 
		{
		case "Data Base":
			switch(exp)
			{
			case 1:
				System.out.println("You are Not Eligible");
				break;
			case 2:
				System.out.println("You are Not Eligible");
				break;
			case 3:
				System.out.println("You are Eligible");
				break;
			case 4:
				System.out.println("You are Over -Eligible");
				break;
			}
			
			break;
		case "Manual":
			System.out.println("You are Not Eligible");
			break;

		default:
			System.out.println("You are not allowed");
			break;
		}
	}




	}



package coreJaveBasics;

public class Arrays {


	
	int a=10;
	int b=20;
	int c=30;
	int z=90;
	int [] array={10,20,30,90};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int [] a=new int[50];//Created array Object of size 10
		a[0]=10;
		a[1]=50;
		a[5]=20;
		a[6]=30;
		
	
		//a[11]=40;//ArrayIndexOutOfBoundsException
		System.out.println("Length of array is  "+a.length);//10
		
		System.out.println("Printing Array by for");
		// if you want to show or print part or all elements of arrays
		for (int i = 0; i <= a.length-2; i++) {
			System.out.println(a[i]);
		}  
		
		// for each
		// if you want to show or print  all elements of arrays
		System.out.println("Printing Array by for each");
		for (int b : a) {
			
		//	b=a[i];
			System.out.println(b);
		}
		int []b;//Declaration
		b=new int[3];//Instantiation
		b[0]=1;//Initialization
		b[1]=2;
		b[2]=3;
		
		*/
////////////////////////////////////////Two Dimentional ARRay//////////
		// Def of 2'array :1
		int [][] arr1={{1,2,3},{4,5,6},{7,8,9}};
		
		
		System.out.println(arr1.length);//3
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		// Def of 2 'array :2
		
		// user can enter the values of rows and colums
		
		int [][]arr2=new int[3] [3];//	
		
		arr2[0][0]=5;
		
		arr2[0][1]=8;
		
		arr2[0][2]=9;
		
		arr2[1][0]=10;
		arr2[1][1]=11;
		arr2[1][2]=12;
		
		arr2[2][0]=13;
		arr2[2][1]=14;
		arr2[2][2]=15;
		
		System.out.println(arr2.length);//3
		// nested loop
	// loop on >>>>rows
		/// LOOP2 >>>>column
		
		
		
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		

		

	}

}

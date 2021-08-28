package oop;

public class ShowingSalaries {

	public static void main(String[] args) {
        EncapsulationChildClass t=new EncapsulationChildClass();
		
    	int netchildsalary=t.CalculateSalary(4000, 1000);
	   System.out.println("The Net Salary Of Child"+" "+netchildsalary);
	
		EncapsulationParentClass tp=new EncapsulationParentClass();
		
		int parentsalary=t.CalculateSalary(7000, 2000);
		System.out.println("The Net Salary Of Parent"+" "+parentsalary);

	}

}

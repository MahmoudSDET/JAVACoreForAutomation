package oop;

public class EncapsulationParentClass {

	

	private int salary;//Private
	
	private int  Bonus;
	public int getSalary()//Public getter method
	{
		return salary;
	}
	public void setSalary(int Amount,int bonus)//public setter method
	{
		salary=Amount;
		Bonus=bonus;
		
	}
	

	

	protected int CalculateSalary(int BaseSalary,int bonus) {
		
		
            setSalary(BaseSalary,bonus);
            
		
		int salary=getSalary();
		
		salary=BaseSalary+Bonus;
		
		
		return salary;
	}
	

}

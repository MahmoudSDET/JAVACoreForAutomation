package stringsAndCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections_1 {

	public static void main(String[] args) {
		
	// Parent List
		
		// TODO Auto-generated method stub
		//List ar2 =new List();
		
		List ar2 =new ArrayList();
		ArrayList ar1=new ArrayList();
		
		// Generics 
		ArrayList<Double> ar9=new ArrayList<Double>();
		ar9.add(7.9);
		ar1.add(5);
		ar1.add("tffdtr");
		ar1.add(537.847);
		ar1.add("esmat");
		ar1.add("esmat");
		
	System.out.println(ar1.size());
	System.out.print(ar1);
	System.out.println(ar1.get(0));
	ar1.remove(3);
	ar1.add(3,10);
	ar1.add(1,8);
	System.out.println(ar1);
				LinkedList al=new LinkedList();
				al.add("Pankaj");
				al.add(123);
				al.add('A');
				al.add(null);
				al.add("Pankaj");
				
				al.add("Pankaj");
				System.out.println(al);
				
				
				al.addFirst("mahmoud");
				al.addLast(9);
				
				System.out.println(al);


	}

}

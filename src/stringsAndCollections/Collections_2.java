package stringsAndCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collections_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // >>> Parent >>>SeT
		HashSet  h1=new HashSet();
		// Generics 
		HashSet <Integer>  h2=new HashSet <Integer>();
		
		
		h1.add("Pankaj");
		h1.add(123);
		h1.add(null);
		h1.add(123);
		//Set s1=new HashSet();
		
		//Set s2=new LinkedHashSet();
		
		
		LinkedHashSet h=new LinkedHashSet();
		
		h.add("Pankaj");
		h.add(123);
		h.add(null);
		h.add("Ranjan");
		h.add("Pankaj");
		
		
		System.out.println(h);

	}

}

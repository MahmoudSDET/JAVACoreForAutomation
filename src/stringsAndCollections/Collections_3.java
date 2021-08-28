package stringsAndCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Collections_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Paret >>>>>Map
		// Generics 
		HashMap<String,String> HM=new HashMap<String,String>();
		
		
		LinkedHashMap h=new LinkedHashMap();
		h.put("images", "Pankaj");
		
		h.put(2, "Ranjan");
		h.put(2, "Ranjan");
		h.put(3, null);
		h.put(4, "Pankaj");
		h.put(5, 500);
		h.put(2, "Rakesh");
		System.out.println(h);
		
		System.out.println(h.get("images"));


	}

}

package SeleniumSessions;

import java.util.Hashtable;
import java.util.Map;

public class ProductHashTable {

	public static void main(String[] args) {
		
		//HashTable: Hash Table dosen't allow any null key or value
		
		Hashtable<String, Integer> prodTable = new Hashtable<String, Integer>();
		prodTable.put("MacBook", 2000);
		prodTable.put("HP laptop", 1000);
		prodTable.put("iPhone x", 1500);
//		prodTable.put(null, null); //NullPointerException
		
		for(Map.Entry m: prodTable.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
			
		}
	}

}

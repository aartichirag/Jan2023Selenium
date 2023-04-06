package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

public class UserData {

	public static void main(String[] args) {
		
		//HashMap: Only one null key is possible where as multiple null values in HashMap. 	
		Map<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city", "Brampton");
		userMap.put(null, "Toronto"); 
		userMap.put(null, "Hamilton"); //override the value for toronto
		
		//print both value bcz key is different
		userMap.put("Tom", null); 
		userMap.put("peter", null);
		
		System.out.println(userMap.get("id"));
		System.out.println(userMap.get("name"));
		System.out.println("-----For Loop-----");
		for(Map.Entry m: userMap.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
			
		}
	}

}

package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapImp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("In", "India");
		map.put("Br", "Brazil");
		map.put("De", "Germany");
		map.put("Fr", "France");
		map.put(null, null);
		map.put(null, null);

		System.out.println("implementing HashMap :");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Country Code :" + entry.getKey() + ",Country:" + entry.getValue());
		}

		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("BR102", "Coffee");
		hashtable.put("D102", "Biryani");
		hashtable.put("L27", "Pizza");
		hashtable.put("D106", "Sandwitch");
		// hashtable.put(null, null);

		System.out.println("implementing HasjhTable :");
		for (Map.Entry<String, String> entry : hashtable.entrySet()) {
			System.out.println("Code :" + entry.getKey() + ",Menu :" + entry.getValue());
		}

	}

}

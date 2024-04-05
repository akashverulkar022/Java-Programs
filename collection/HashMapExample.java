package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	void HashDemo() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Graps");

		System.out.println("Iterating HashMap.....");
		System.out.println("key " + "  " + "  Values");
		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(" " + m.getKey() + " " + m.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapExample hashMap = new HashMapExample();
		hashMap.HashDemo();

	}

}

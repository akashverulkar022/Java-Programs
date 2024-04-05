package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashset = new HashSet<String>();
		hashset.add("Riya");
		hashset.add("Ravi");
		hashset.add("Riya");
		hashset.add("Meera");
		hashset.add("Rocky");
		hashset.add(null);
		
		System.out.println("implementing HashSet :");
		for(String string : hashset) {
			System.out.println(string);
		}
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Mango");
		linkedHashSet.add("Banana");
		linkedHashSet.add("mango");
		linkedHashSet.add("Gauva");
		linkedHashSet.add(null);
		
		System.out.println("Implementing LinkedHashSet : \n"+linkedHashSet);
		
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Pizza");
		treeSet.add("Burger");
		treeSet.add("Coffee");
		treeSet.add("Burger");
		//treeSet.add(null);
		
		System.out.println("implementing TreeSet : \n"+treeSet);

	}

}

package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class TestComparablePerson {
	void ComparablePerson() {
		ArrayList<Person> p3 = new ArrayList<>();
		// Create records
		p3.add(new Person(02, "Tom", 26));
		p3.add(new Person(03, "Jerry", 25));
		p3.add(new Person(04, "Magy", 30));
		p3.add(new Person(01, "Tony", 35));
		p3.add(new Person(05, "Liger", 99));

		System.out.println("******************Before Sorting******************");
		for (Person p : p3) {
			System.out.println(p);
		}
		Collections.sort(p3);
		System.out.println("******************After Sorting******************");
		for (Person p1 : p3) {

			System.out.println(p1);
		}
	}

	public static void main(String[] args) {
		TestComparablePerson test = new TestComparablePerson();
		test.ComparablePerson();
	}
}

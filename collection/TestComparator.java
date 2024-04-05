package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AgeComparator implements Comparator<Students> {
	@Override
	public int compare(Students s1, Students s2) {
		{
			if (s1.age == s2.age) {
				return 0;
			} else if (s1.age > s2.age) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}

class NameComparator implements Comparator<Students> {
	@Override
	public int compare(Students s1, Students s2) {
		return s1.Name.compareTo(s2.Name);
	}
}

public class TestComparator {
	void ComparatorDemo() {
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(new Students(1, "Teena", 42));
		al.add(new Students(2, "Leena", 48));
		al.add(new Students(3, "Reena", 21));
		System.out.println("Sorting by Age");
		System.out.println(al);
		for (Students st : al) {
			System.out.println(st.rollNo + " " + st.Name + " " + st.age);
		}
		System.out.println("----------------------------------------");
		Collections.sort(al, new NameComparator());
		for (Students st : al) {
			System.out.println(st.rollNo + " " + st.Name + " " + st.age);
		}
		System.out.println("----------------------------------------");

	}

	public static void main(String[] args) {
		TestComparator test = new TestComparator();
		test.ComparatorDemo();
	}

}

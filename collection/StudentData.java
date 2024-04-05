package collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int rollNo;
	String Name;
	int age;

	public Student(int rollNo, String Name, int age) {
		super();
		this.rollNo = rollNo;
		this.Name = Name;
		this.age = age;
	}

	
	public String toString() {
		return "Students [rollNo=" + rollNo + ", Name=" + Name + ", age=" + age + "]";
	}
}

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Tom", 21);
		Student s2 = new Student(2, "Rohit", 22);
		Student s3 = new Student(3, "Tejas", 23);
		Student s4 = new Student(4, "Vicky", 24);
		Student s5 = new Student(5, "Rocky", 25);
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		Iterator<Student> iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student{
	private int id, age;
	private String name;
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
}

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, 20, "Raj"));
		list.add(new Student(102, 12, "Meera"));
		list.add(new Student(103, 25, "Meena"));
		list.add(new Student(104, 32, "Manas"));
		list.add(new Student(105, 22, "Paras"));
		
		Predicate<Student> p1 = s -> s.getName().startsWith("M");
		Predicate<Student> p2 = s -> s.getAge()>40;
		
	    boolean b1 = list.stream().anyMatch(p1);
	    boolean b2 = list.stream().anyMatch(p2);
	    System.out.println("p1 with anyMatch :"+b1);
	    System.out.println("p2 with anyMatch :"+b2);
	    
	    boolean b3 = list.stream().allMatch(p1);
	    boolean b4 = list.stream().allMatch(p2);
	    System.out.println("p1 with allMatch :"+b3);
	    System.out.println("p2 with allMatch :"+b4);
	    
	    boolean b5 = list.stream().noneMatch(p1);
	    boolean b6 = list.stream().noneMatch(p2);
	    System.out.println("p1 with noneMatch :"+b5);
	    System.out.println("p2 with noneMatch :"+b6);

	}

}

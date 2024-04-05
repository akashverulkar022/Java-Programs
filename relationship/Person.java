package relationship;

public class Person {
	int id;
	String name;
	MyDate dob;
	Address add;
	
	public Person() {
		id = 10;
		name = "akash";
		dob = new MyDate();
		add=new Address();
	}
	public Person(int id, String name, MyDate dob,Address add) {
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.add=add;
}
	public void disply() {
		System.out.println("Person id :"+id);
		System.out.println("Name :"+name);
		dob.display();
		add.disply();
	}
}


package collection;

public class Person implements Comparable<Person>{
	private int personid;
	 private String name;
	 private int age;

	public Person(int personid, String name, int age) {
		
		this.personid = personid;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [personid=" + personid + ", name=" + name + ", age=" + age + "]";
	}


	public int compareTo(Person p) {
		if(personid>p.personid)
		{
			return 1;
		}
		else if(personid<p.personid)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		}
}

package relationship;

public class Employee extends Person {
	int perDay, workingDays, salary;

	public Employee() {
		super();// calls super class constructor
		this.perDay = 500;
		this.workingDays = 30;
	}

	public Employee(int id, String name, MyDate dob, Address add, int perDay, int workingDays) {
		super(id, name, dob, add);
		this.workingDays = workingDays;
		this.perDay = perDay;
	}

	public void calculate() {
		salary = perDay * workingDays;
	}

	@Override
	public void disply() {
		// TODO Auto-generated method stub
		super.disply();
		System.out.println("Salary:" + salary);
	}

}

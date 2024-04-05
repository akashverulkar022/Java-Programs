package relationship;

public class Student extends Person{
	float phy,chem,maths,total,percent;
	
	public Student() {
		super();
		this.phy=60;
		this.chem=75;
		this.maths=80;
	}
	public Student(int id, String name, MyDate dob, Address add,float phy,float chem,float maths) {
		super(id, name, dob,add);
		this.phy=phy;
		this.chem=chem;
		this.maths=maths;
	}
	public void Calculate() {
		total=phy+chem+maths;
		percent=total/3;
	}
	@Override
	public void disply() {
		// TODO Auto-generated method stub
		super.disply();
		System.out.println("Total: "+total);
		System.out.println("Percent :"+percent);
	}

}

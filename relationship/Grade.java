package relationship;

public class Grade extends Student {
	String grade;
	
	
	public Grade()
	{
	super();
	grade=" ";
	}
	public Grade(int id, String name, MyDate dob, Address add,float phy,float chem,float maths)
	{
		super(id,name,dob,add,phy,chem,maths);
		this.grade=grade;
	}
	@Override
	public void Calculate() {
		// TODO Auto-generated method stub
		super.Calculate();
		if(percent>90)
			grade="A+";
		else if(percent>76)
			grade="A";
		else if(percent>60)
			grade="+B";
		else if(percent>50)
			grade="B";
		else
			grade="Fail";
		
	}
	@Override
	public void disply() {
		// TODO Auto-generated method stub
		super.disply();
		System.out.println("Percent :"+percent);
		System.out.println("Grade :"+grade);
	}

}

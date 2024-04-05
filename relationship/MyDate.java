package relationship;

public class MyDate {
	int dd,mm,yy;
	public MyDate() {
		dd=25;
		mm=05;
		yy=2001;	
	}
	public MyDate (int dd, int mm, int yy) {
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
	}
	
	public void display() {
		System.out.println(dd+"-"+mm+"-"+yy);
		
	}

}

package relationship;

public class Customer extends Person{
	String productName;
	float billAmount,quntity,price,discount;
	
	public Customer() {
		super();
		productName="Pencil";
		quntity=30;
		price=900;
		
	}
	public Customer(int id, String name, MyDate dob,Address add,String productName,float quntity,float price)
	{
		super(id, name, dob, add);
		this.productName=productName;
		this.quntity=quntity;
		this.price=price;
		
	}
	public void Calculate() {
		billAmount=quntity*price;
		if(billAmount>20000)
			discount=billAmount*0.15f;
		else if(billAmount>15000)
			discount=billAmount*0.10f;
		else if(billAmount>10000)
			discount=billAmount*0.07f;
		else
			discount=0;
		
		
	}
	@Override
	public void disply() {
		// TODO Auto-generated method stub
		super.disply();
		System.out.println("Product Name :"+productName);
		System.out.println("Quntity :"+quntity);
		System.out.println("Price :" +price);
		System.out.println("Discount :"+discount);
		System.out.println("BillAmount :"+billAmount);
	}

}

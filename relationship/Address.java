package relationship;

public class Address {
	String addLine, street, city, state;
	int pincode;

	public Address() {
		addLine = "Chakrapani vasahat";
		street = "Bhosari";
		city = "pune";
		state = "Maharastra";
		pincode = 411039;
	}

	public Address(String addLine, String street, String city, String state, int pincode) {
		this.addLine = addLine;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public void disply() {
		System.out.println(addLine + " " + street + " " + city + " " + state + " " + pincode);
	}
}

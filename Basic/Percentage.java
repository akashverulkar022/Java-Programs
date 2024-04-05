package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//accepting input form user using BufferReader class
public class Percentage {

	public static void main(String[] args) throws IOException {
		int id;
		String name;
		double phy, chem, maths, total, percentage;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ID :");
		id = Integer.parseInt(reader.readLine());
		System.out.println("Enter Name :");
		name = reader.readLine();
		System.out.println("Enter marks of phy, chem and maths :");
		phy = Double.parseDouble(reader.readLine());
		chem = Double.parseDouble(reader.readLine());
		maths = Double.parseDouble(reader.readLine());

		total = phy + chem + maths;
		percentage = total / 3;

		System.out.println("Students Id :" + id + "\nName :" + name);
		System.out.println("Total : " + total + "\nPercent :" + percentage);

	}

}

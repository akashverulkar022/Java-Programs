package java8features;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[5];
		str[3] ="EduBridge Learning";
		
		Optional<String> result = Optional.ofNullable(str[3]);
		
		if(result.isPresent())
		{
			String uppercase = str[3].toUpperCase();
			System.out.println(uppercase);
		}
		else {
			System.out.println("String is not present at 3rd position");
		}

	}

}

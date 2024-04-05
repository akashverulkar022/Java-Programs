package java8features;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Raj");
		list.add("Riya");
		list.add("Bhagyashree");
		list.add("Meera");
		list.add("Manas");
		list.add("Rishikesh");
		
		//without using Stream API
		int count=0;
		for(String string : list){
			if(string.length()>7)
				count++;
		}
		System.out.println("There are "+count+" strings with length greater than 7");
		
		//with stream API
		long c = list.stream().filter(str -> str.length()>7).count();
		System.out.println("Using Stram :There are "+count+" strings with length greater than 7");
		
		//1. create a stream 
		Stream<String> allNames = list.stream();
		
		//2.perform intermediate operation
		Stream<String> longName = allNames.filter(str -> str.length()>7);
		
		//3.perform terminal operation
		System.out.println("names with length greater than 7");
		longName.forEach(str -> System.out.println(str));
		
		List<String> names = Arrays.asList("Raj","Riya","Bhagyashree",
				"Rishikesh","Vyankatesh","PAras","Saloni");
		
		List<String> longNms = names.stream().filter(str -> str.length()>5 
				&& str.length()<12).collect(Collectors.toList());
		System.out.println("Using Method reference and Collector :");
		longNms.forEach(System.out::println);

	}

}

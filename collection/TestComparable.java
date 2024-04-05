package collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {
	void ComparableBook1() {
		ArrayList<Book1> b1 = new ArrayList<Book1>();
		//create and add 5 Book records
		b1.add(new Book1(1, "Book4", "Author4", "Publisher4", 12));
		b1.add(new Book1(2, "Book2", "Author4", "Publisher2", 02));
		b1.add(new Book1(5, "Book3", "Author4", "Publisher3", 20));
		b1.add(new Book1(4, "Book2", "Author4", "Publisher5", 8));
		b1.add(new Book1(3, "Book3", "Author4", "Publisher1", 50));
		
		System.out.println("******************Before Sorting******************");
		for(Book1 bk:b1)
		{
			System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher);
		}
		Collections.sort(b1);
		System.out.println("******************After Sorting******************");
		for(Book1 bk:b1)
		{

			System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher);	
		}
	}
	public static void main(String[] args) {
		TestComparable test = new TestComparable();
		test.ComparableBook1();
	}

}

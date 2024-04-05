package collection;

import java.util.HashMap;

public class HashMapCRUD {
	
	void CRUD()
	{
		HashMap<Integer, Book> bookMap = new HashMap<Integer, Book>();
		
		//create Book
		Book b1 = new Book(101,"Let us C","Yashwant Kanetakar");
		Book b2 = new Book(102, "Data Communication", "dr.Suraj");
		Book b3 = new Book(103, "Operating System", "Galvin");
		
		//Add Book
		bookMap.put(b1.getId(), b1);
		bookMap.put(b2.getId(), b2);
		bookMap.put(b3.getId(), b3);
		
		//Read Book
		Book read1 = bookMap.get(101);
		Book read2 = bookMap.get(102);
		Book read3 = bookMap.get(103);
		
		//Display on Console
		System.out.println("******Book List********");
		System.out.println(read1);
		System.out.println("-------------------------");
		System.out.println(read2);
		System.out.println("-------------------------");
		System.out.println(read3);
		System.out.println("-------------------------");
		
		//Update Book
		if(read1!=null)
		{
			read1.setTitle("New Title");
			bookMap.put(read1.getId(), read1);
			System.out.println("*******Upadated Book List*********");
			System.out.println("Updated Book :"+read1);
			
		}
	}

}

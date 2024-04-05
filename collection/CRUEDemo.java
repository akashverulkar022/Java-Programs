package collection;

import java.util.ArrayList;

import javax.swing.JSpinner.ListEditor;

public class CRUEDemo {
	ArrayList<String> listed = new ArrayList<>();

	void read() {
		// created
		listed.add("Tom");
		listed.add("Jerry");
		listed.add("Rocky");
		// read after created
		System.out.println("\nList of items after created");
		for (String list : listed) {
			System.out.println(list);
		}
	}

	void indexUpdate() {
		int index = 1;
		listed.set(index, "Ronny");
		System.out.println("Updated List");
		for (String list : listed) {
			System.out.println(list);
		}
	}

	void delete() {
		listed.remove (0);
		System.out.println("Deleted List");
		for (String list : listed) {
			System.out.println(list);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRUEDemo demo = new CRUEDemo();
		demo.read();
		demo.indexUpdate();
		demo.delete();

	}

}

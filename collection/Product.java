package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Product {
	int id;
	String name;
	int price;
	String discription;
	public Product(int id, String name, int price, String discription) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discription = discription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", discription=" + discription + "]";
	}
	
	public class CurdOpration{
		ArrayList<Product> list = new  ArrayList<Product>();
		
		void AddProduct() {
			list.add(new Product(01, "Pizza", 350, "Spicy"));
			list.add(new Product(02, "Barger", 450, "Spicy"));
			list.add(new Product(03, "Tea", 100, "Spicy"));
			list.add(new Product(04, "Phohe", 150, "Spicy"));
			
			System.out.println("List Product :");
			for(Product li : list) {
				System.out.println(li);
			}
		}
		void UpdateProduct(int productid, String newName, int newpricre, String newDiscription){
			
			for (Product p : list) {
				if(p.getId()==productid) {
					p.setName(newName);
					p.setPrice(newpricre);
					p.setDiscription(newDiscription);
				System.out.println("Product Update Succefully");
					
				for(Product li : list) {
					System.out.println(li);
				}
				System.out.println("--------------------------------");
				}
			}
		}
	}
	void DeleteProduct(int productid) {
		for(Product p : list) {
			if(p.getId()==productid) {
				list.remove(productid);
			}
			System.out.println("Product with ID :"+productid+"Deleting Succesfully");
		}
	}

}

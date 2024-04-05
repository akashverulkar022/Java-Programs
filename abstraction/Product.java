package abstraction;

public class Product {
	
	private int id;
	private String productName;
	private float price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", price=" + price + "]";
	}
	public static void main(String[] args)  {
		Product product = new Product();
		product.setId(201);
		product.setProductName("IPhone");
		product.setPrice(45000);
		
		System.out.println("Product Id :"+product.getId());
		System.out.println("Product Name :"+product.getProductName());
		System.out.println("Product Price:"+product.getPrice());
		
		System.out.println(product);
		
	}

	

}

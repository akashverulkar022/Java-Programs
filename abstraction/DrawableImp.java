package abstraction;

public class DrawableImp implements Drawable, Printable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawableImp drawable=new DrawableImp();
		drawable.print();
		drawable.cube(7);
		Drawable.square(13);
		drawable.display();
		drawable.show();

	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		float r = 10;
		System.out.println("Area of Circle :"+(PI*r*r));
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Methoad from another Interface");
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Printable.super.show();
	}

}

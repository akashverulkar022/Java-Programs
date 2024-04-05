package abstraction;

public interface Drawable {
	
	float PI = 3.14f; //public static final float PI=3.14
	
	void print(); //public abstract void print
	
	static void square(int a) {
		System.out.println("Square :"+(a*a));
		
	}
	default void cube(int x) {
		System.out.println("Cube :"+(x*x*x));
	}
	default void show() {
		System.out.println("Inside Show : Drawable");
	}

}

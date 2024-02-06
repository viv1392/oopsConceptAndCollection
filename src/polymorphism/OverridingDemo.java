package polymorphism;

public class OverridingDemo {

	public static void main(String[] args) {
		MethodOverriding1 demo= new MethodOverriding1();
		demo.add(10, 20);     // overriding parent class
		demo.add(10, 20.5);
		demo.add(15.6, 17.43);
		demo.multiply(10, 20);
	}

}

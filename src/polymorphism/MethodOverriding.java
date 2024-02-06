package polymorphism;

public class MethodOverriding {
	
	public void add(int x ,int y) {
		System.out.println(x+y);
	}
	public void add(int x ,double y) {
		System.out.println(x+y);
	}
	public void add(double x ,double y) {
		System.out.println(x+y);
	}

}

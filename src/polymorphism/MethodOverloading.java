package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
    // Method overlaoding comes into compile time polymorphism.
		
		Display dis= new Display();
		 dis.runDisplay("humane walks");
		 dis.rundisplay(10);
		 dis.runDisplay(10, 20.46);
	}

}
 class Display {
	 public void runDisplay(String s) {
		 System.out.println(s);
	 }
	 public void rundisplay(int x) {
		System.out.println(x);
	 }
	 public void runDisplay(int x, double y) {
		 System.out.println(x+y);
	 }
	
}

package abstarction;
 abstract  class Bike {
	 abstract void run();        // we can not create the object of abstract class.
	                             //  abstraction is used to show only required things to the user.
	 public  void run1() {        // can have concrete method means body structure also.
		 System.out.println("Every bike runs");
	 }
}
public class Honda extends Bike{
    public void run() {
    	System.out.println("honda running milage is good");
}
	
}
package javaBasic;

public class FibonacciNumber {
	int n=9;
	public static void main(String[] args) {
	int n1=0; int n2=1;	int n3=0; int n=9;
	System.out.print(n1+" ");
	System.out.print(n2+" ");
	 for(int i=2;i<n;i++) {
		 n3=n2+n1;
		 System.out.print(n3+" ");
		 n1=n2;
		 n2=n3;
		 
		 
	 }
		
	}

}

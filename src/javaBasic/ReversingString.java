package javaBasic;

public class ReversingString {
	static String x="hello world";
	public static void main(String[] args) {
		     char[]y =x.toCharArray();
		   int n =  y.length;
		   for(int i=n-1;i>=0;i--) {
			   System.out.print(y[i]);
		   }
	
		   StringBuffer bfr=new StringBuffer(x);
		   StringBuffer z= bfr.reverse();
		   String k= z.toString();
		   System.out.println("");
		   System.out.println(k);
		    
	
	}
}

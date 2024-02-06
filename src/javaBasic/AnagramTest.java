package javaBasic;

import java.util.Arrays;

public class AnagramTest {

	public static void main(String[] args) {
		String x="hearp";
		String y="earth";
		char [] x1=x.toCharArray();
		char [] y1=y.toCharArray();
		int l1=x1.length;
		int l2=y1.length;
		boolean f=true;
		Arrays.sort(x1);
		Arrays.sort(y1);
		f=Arrays.equals(x1, y1);
		
		if(l1!=l2) {
			System.out.println("Strings are not Anagram");
		}
		if(l1==l2 && f==true ) {
			System.out.println("Strings are Anagram");
		}
		if(l1==l2 && f==false) {
			System.out.println("Strings are not Anagram");
		}
	}
}
	



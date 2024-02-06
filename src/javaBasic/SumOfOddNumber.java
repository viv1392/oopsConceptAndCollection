package javaBasic;

import java.util.Scanner;

public class SumOfOddNumber {
	public static void main(String[] args) {
		int n=1; int n1=10;int sumOdd=0;
		
		for(int i=n;i<n1;i++) {
			if(i%2!=0) {
				sumOdd=sumOdd+i;
			}
		}
		System.out.println(sumOdd);
	}

}

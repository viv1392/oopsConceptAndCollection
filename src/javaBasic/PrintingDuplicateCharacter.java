package javaBasic;

import java.util.HashSet;

public class PrintingDuplicateCharacter {
	
	public static void main(String[] args) {
		String x="hello vivek";
		String y=x.replaceAll("\\s", "");
		String[] z=y.split("");
		boolean f=true;
		HashSet<String> set=new HashSet<String>();
		
		for(String k:z) {
			f=set.add(k);
			if(f==false) {
				System.out.println(k);
			}
		}
	}
}

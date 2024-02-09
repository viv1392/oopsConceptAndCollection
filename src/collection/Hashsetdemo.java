package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashsetdemo {
	//HashSet                                       LinkedHashSet
   // order is not preserved                      order is preserved
  // duplicate character is not allowed       duplicate character is not allowed
	public static void main(String[] args) {
		HashSet set =new HashSet();     // Heterogeneous data storing
		set.add(5);
		set.add("java");
		set.add("python");
		set.add('A');
		set.add('K');
		System.out.println(set);
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(10);
		set1.add(30);
		set1.add(5);
		set1.add(40);
		System.out.println(set1);
		linkedHashSet();
	}
	public static void linkedHashSet() {
		LinkedHashSet hashset = new LinkedHashSet();
				hashset.add(50);
		        hashset.add("Vivek");
		        hashset.add("hashset");
		        hashset.add(60);
		        System.out.println(hashset);
		
	}

}

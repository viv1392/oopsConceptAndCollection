package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

//	   List                                       Set
//list has insertion orders	                  Set has no insertion orders	
//list allows duplicate characters            Set does not allow duplicate characters	
	

public class ListCollection {
	public static void main(String[] args) {

		// ArrayList
		ArrayList<Integer> list=new ArrayList<Integer>(); //For  homogeneous data storing for non  data we ArrayList=newArrayList() 
		list.add(20);
		list.add(18);
		list.add(26);
		list.add(24);
		list.add(10);
		Collections.sort(list);
		System.out.println(list);// before removing 
		list.remove(2);
		list.add(13);
		list.clear();
		System.out.println(list);
		linkedList();
	}
	public static void  linkedList() {
		//ArrayList is used for fetching data in this process it takes less time  while LinkedList is used for deletion and insertion
		// of elements in this process it takes very less time in comparison to ArrayList.
		//LinkedList has some unique method such as addLast(),addFirst(),removeFirst(),removeLast(),
		// null is accepted in linkedlist.
		LinkedList list=new LinkedList(); // Heterogeneous data storing
		list.add("java");
		list .add(3);
		list.add(true);
		list.add('k');
		list.addFirst("python");
		list.addLast("selenium");
		System.out.println(list);
		LinkedList list1=new LinkedList();
		list1.addAll(list);
		System.out.println("After add the list : "+list1);
		list1.removeAll(list);
		System.out.println("After removing all elements from list1 :" + list1);
		
		
		
	}
}

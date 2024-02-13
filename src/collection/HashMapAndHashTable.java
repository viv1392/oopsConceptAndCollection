package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapAndHashTable {
	//hasmap and hastable is used for key value pair entries.
			//hashmap accept only unique key and duplicate value and null values for null key 
			//but has table do not accept null values and null keys
			//both hashmap and hashtable has map.entery method to enter key value pair apart from the basic method.
      public static void main(String[] args) {
    	  HashMap<Integer,String> map =new HashMap<Integer,String>();    // also hertogenous data insertion 
    	  map.put(10, "smith");
    	  map.put(11, "Java");
    	  map.put(12, "python");
    	  map.put(14, "Vivek");
    	  map.put(null, null);
    	 System.out.println(map);
    	 System.out.println( map.containsValue("smith"));
    	 map.remove(10, "smith");
    	 System.out.println(map);
    	 System.out.println(map.containsKey(11));
    	 Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
    	 while (iterator.hasNext()) {
    		 Map.Entry<Integer, String> entry=iterator.next();
    		 System.out.println("key--"+entry.getKey()+"  "+"value--"+entry.getValue());
    		 
    	 }
    	 
		
	}

}

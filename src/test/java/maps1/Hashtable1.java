package maps1;

import java.util.Hashtable;

public class Hashtable1 {

	public static void main(String[] args) {
	Hashtable<Integer, String>map =new Hashtable<>();
	map.put(10, "hello");
	map.put(30, "hey");
	//map.put(null, "bye"); null key not allowed
	//map.put(70, null);null value not allowed
	map.put(40, "Yeno"); //duplicate key is not allowed
	map.put(3, "yeno");// duplicate value is allowed
	System.out.println(map);
	map.replace(10, "prashi");
	System.out.println(map);
	
	}

}

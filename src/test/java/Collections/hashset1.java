package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1 {

	public static void main(String[] args) {
		HashSet<Object>hash=new HashSet<>();
		hash.add("hi");  //elements insertion 
		hash.add(20);
		hash.add(6);
		hash.add(null);//it accept only one null value 
		hash.add(null);
		hash.add('A');
		hash.add('A');// it will not allow duplicate 
		hash.add("what");
		System.out.println("size of hashset is "+hash.size());    //it will give size of the elements, it will not count duplicate elements
		System.out.println(hash.remove(6));     //it will remove particular element 
		System.out.println(hash.contains("what")); //contains search particular element present or not 
		System.out.println(hash);   //print the elements
		
		Iterator<Object> it = hash.iterator();  
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
		/*System.out.println(hash.contains("what"));
		System.out.println(hash.isEmpty());
		System.out.println(hash.remove(20));
		Iterator<Object> it = hash.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	ArrayList<Object> list=new ArrayList<>(hash);
	System.out.println(list.get(1));
	System.out.println(list);
	}*/



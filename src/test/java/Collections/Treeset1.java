package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		TreeSet<Integer>tree=new TreeSet<>();
		tree.add(20);
		tree.add(50);
		tree.add(2);
		tree.add(2);// does not  print  duplicate values
	//	tree.add("hi") does not allow heterogenous data
	//	tree.add(null);// null not allowed
		System.out.println(tree); // by default it will frint in ascending order
		System.out.println(tree.descendingSet());
		Iterator<Integer> it = tree.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

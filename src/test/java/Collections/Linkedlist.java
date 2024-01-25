package Collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Object> list =new LinkedList<>();
		list.add(10);
		list.add("hello");
		list.add(30);
		list.add("hi");
		list.add(null);
		list.add(null);// it allows null
		System.out.println(list);
		list.add(2,"wru");//in index add the value wru
		System.out.println(list);
		list.addFirst("what");//addd item to the begining of the list
		list.addLast("hoi");// adfd item to the end of the list
		System.out.println(list);
		list.remove(1);// it will remove element present in the index
		list.removeFirst();//it will remove first element in the list
		list.removeLast();//it will remove last element in the list
		System.out.println(list.get(4));// it will fetch element present in index 4
		System.out.println(list.getFirst());// it will fetch first element in the list
		System.out.println(list.getLast());// it will fetch last elemnt in the list
		
		
	}

}

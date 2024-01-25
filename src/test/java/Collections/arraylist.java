package Collections;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {

		ArrayList<Object> list=new ArrayList<Object>();
		list.add(10);
		list.add("hello");
		list.add(30);
		list.add("hi");
		list.add(null);
		list.add(null);// it allows null
		System.out.println(list);
		list.add(2,"wru");//in index add the value wru
		System.out.println(list);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(15);
		list.add("hey");
		list.add(12);
		list.addAll(list1);//it will add list and list1
		System.out.println(list);
		if(list.contains("hi"))// used to check the object is present or not
		{
			System.out.println("hi is present");
		}
		else
		{
			System.out.println("hi not present");
		}
		System.out.println(list.remove(2));//remove value present in index 2
		for(Object obj:list)// used to fetch element one by one
		{
			System.out.println(obj);	
		}
		}
	}

		



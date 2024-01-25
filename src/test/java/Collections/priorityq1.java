package Collections;

import java.util.PriorityQueue;

public class priorityq1 {

	public static void main(String[] args) {
		PriorityQueue<Character>q=new PriorityQueue<>();
		q.add('A');
		q.add('B');
		q.add('c');
	    q.add('D');
System.out.println(q);
System.out.println(q.poll());//fetch the top most element and remove from list
System.out.println(q);
System.out.println(q.peek());//fetch the top most element and  doesnt remove from list
System.out.println(q);


}
}
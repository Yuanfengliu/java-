package day14;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		ll.addFirst("java01");
		ll.addFirst("java02");
		ll.addFirst("java03");
		ll.addFirst("java04");
		System.out.println(ll);
		while(!ll.isEmpty())
		{
			System.out.println(ll.removeLast());
		}
	}
}

/*
LinkedList特有方法：（看字面意思就可以懂）
addFirst()
addLast()

getFirst()
getLast()
获取元素，但是不删除元素。

removeFirst()
removeLast() 
获取元素，但是元素被删除。如果集合中没有元素，会出现NoSuchElementException

JDK1.6出现了替代方法。

offerFrist();
offerLast();

peekFirst();
peekLast();
获取元素，但是不删除元素。如果集合中没有元素，会返回null。

poolFirst(); 
poolLast(); 
获取元素，但是元素被删除。如果集合中没有元素，会返回null。

堆栈：先进后出  

队列： 先进先出 FIFO  

List集合判断元素是否相同，依据的是元素的equals方法。


*/
import java.util.*;
class LinkedListDemo4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		LinkedList link =new LinkedList();

		link.add("java01");
		link.add("java02");
		link.add("java03");
		link.add("java04");

		System.out.println(link.removeFirst());
		System.out.println("size="+link.size());
	}
}

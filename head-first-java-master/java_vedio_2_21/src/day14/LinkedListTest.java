package day14;
import java.util.*;
//用链表建立一个队列和堆栈
//要求必须会
class QueueTest{
	private LinkedList link;
	QueueTest() {
		link=new LinkedList();
	}
	public void myAdd(Object obj){
		link.addFirst(obj);
	}
	public Object myGet(){
		return link.removeLast();
	}
	public boolean isNull(){
		return link.isEmpty();
	}
}
public class LinkedListTest {
	public static void main(String[] args) {
		QueueTest q=new QueueTest();
		q.myAdd("java01");
		q.myAdd("java02");
		q.myAdd("java03");
		q.myAdd("java04");
		System.out.println(q.myGet());
		System.out.println(q.myGet());
	}
}

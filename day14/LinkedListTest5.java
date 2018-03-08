/*
使用LinkedList模拟一个堆栈或者队列数据结构。

堆栈：先进后出  

队列： 先进先出 FIFO（first in first out） 
*/
import java.util.*;
class DuiLie
{
	private LinkedList link;
	DuiLie()
	{
		link =new LinkedList();
	}
	public void myAdd(Object obj)
	{
		link.addFirst(obj);
	}
	public Object myGet()
	{
		return link.removeFirst();
	}
	public boolean isNull()
	{
		return link.isEmpty();
	}
}
class LinkedListTest5
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		DuiLie d1= new DuiLie();
		d1.myAdd("java01");
		d1.myAdd("java02");
		d1.myAdd("java03");
		d1.myAdd("java04");
		while (!d1.isNull())
		{
			System.out.println(d1.myGet());
		}
	}
}

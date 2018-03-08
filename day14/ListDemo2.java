/*
collection
	|--List：元素是有序的，元素可以重复，因为该集合体系有索引。
		|--ArrayList:底层的数据结构使用的是数组结构。特点：查询速度快。但是增删稍慢。线程不同步。
		|--LinkedList:底层使用的数链表数据结构。特点：增删速度很快，查询稍慢。
		|--Vector:底层是数组结构。特点：增删、查询都很慢。被ArrayList替代啦！
								线程同步（若多线程操作时，任何一个进程的改变也会对另外的进程有影响）。
	|--Set：元素是无序的，不能重复。

List：特有方法：凡是可以操作角标的方法都是该体系特有的方法。  
增：
	add(index,element); 
	addAll(index,collection);
删：
	remove(index)
改：
	set(index,element);
查：
	get(index)
	subList(from,to)
	listIterator(); 

List集合特有的迭代器，ListIterator是Iterator的子接口。

在迭代时，不可以通过集合对象的方法操作集合中的元素。
因为会发生ConcurrentModificationException异常。（并发异常）

所以，在迭代器时，只能用迭代器的方法操作元素，可是Iterator方法是有限的，只能对元素进行判断，取出，删除的操作，
如果想要其他的操作如添加，修改等，就需要使用其子接口，ListIterator。  
该接口只能通过List集合的ListIterator方法获取。（就是把原来的Iterator it=al.iterator();-->换成：ListIterator it=al.ListIterator();  即可）

*/
import java.util.*;
class ListDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		ArrayList al =new ArrayList();

		//添加元素
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		//打印原集合
		System.out.println("原集合是： "+al);

		//在指定位置添加元素
		al.add(1,"java09");
		System.out.println("添加后集合是："+al);

		//删除指定元素
		al.remove(2);
		System.out.println(al);

		//修改元素
		al.set(2,"java007");

		//通过角标获取元素
		System.out.println("get(1)是："+al.get(1));
		System.out.println(al);

System.out.println("-----------------------------------");
		//获取所有元素
		for (int x=0;x<al.size();x++ )
		{
			System.out.println("al("+x+")="+al.get(x));
		}

		Iterator it=al.iterator();//获取迭代器，用于取出集合中的元素。//里面不能进行删除等操作，否则会出现并发异常
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		//通过indexOf获取对象的位置
		System.out.println("index="+al.indexOf("java04"));//若没有返回-1
		List sub =al.subList(1,3);//包括头，不包括尾
		System.out.println("sub="+sub);
	}
}

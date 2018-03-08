package day14;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		//添加元素
		a1.add("java01");
		a1.add("java02");
		a1.add("java03");
		System.out.println("原集合是："+a1);
		a1.add(1,"java09");
		System.out.println("添加后："+a1);
		a1.set(2, "java07");
		System.out.println("修改后"+a1);
		for (int i=0;i<a1.size();i++)
			System.out.println(a1.get(i));
		Iterator it=a1.iterator();
		//迭代器
		//在迭代过程中，准备添加或者删除元素
//		for (Iterator it=a1.iterator();it.hasNext();)
//			System.out.println(it.next());
		while(it.hasNext())
		{
			Object obj=it.next();
			if(obj.equals("java09"))
				it.remove();
			System.out.println(obj);
		}
		System.out.println(a1);
		ListIterator li=a1.listIterator();
		System.out.println(a1);
		while(li.hasNext())
		{
			Object obj=li.next();
			if(obj.equals("java07"))
				li.set("java009");
		}
		System.out.println(a1);
	}
	
}

/*
去除ArrayList集合中的重复的元素。


*/
import java.util.*;
class ArrayListTest6 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		ArrayList al =new ArrayList();
		al.add("java01");
		al.add("java02");
		al.add("java01");
		al.add("java02");
		al.add("java01");
		al.add("java03");

		System.out.println(al);//原来的容器

		al=singleElement(al);//改变后容器
		System.out.println(al);
	}
	public static ArrayList singleElement(ArrayList al)
	{
		//定义一个临时容器。
		ArrayList newAl =new ArrayList();
		Iterator it =al.iterator();

		while (it.hasNext())
		{
			Object obj=it.next();

			if(!newAl.contains(obj))//newAl里面没有obj元素，则添加进这个临时容器。
				newAl.add(obj);
		}
		return newAl;
	}
}

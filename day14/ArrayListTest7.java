/*
将自定义对象作为元素存到ArrayList集合中，并去除重复元素。

比如：
1、对人描述，将数据封装进人的对象
2、定义容器，将人存入
3、取出

*/
import java.util.*;
class Person
{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Person))
			return false;
		Person p=(Person)obj;

		System.out.println(this.name+"---------"+p.name);//打印发现，后来存进去的，依次和前面作比较，看是否会重复。
		return this.name.equals(p.name) && this.age ==p.age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
class ArrayListTest7 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		ArrayList al =new ArrayList();
		al.add(new Person("lisi01",30));//al.add(object obj);//object obj=new Person("lisi01",30)
		al.add(new Person("lisi02",32));
		al.add(new Person("lisi02",32));
		al.add(new Person("lisi03",33));
		al.add(new Person("lisi04",35));
		al.add(new Person("lisi04",35));

		al=singleElement(al);
		Iterator it =al.iterator();
System.out.println("---------------------------------------------------");
		while (it.hasNext())
		{
			Person p =(Person)it.next();
			
			System.out.println(p.getName()+"--::--"+p.getAge());
		}	
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


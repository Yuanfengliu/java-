package day14;
//将自定义对象作为元素存在ArrayList集合中，并去除重复元素。
//去除ArrayList中的重复元素
//
import java.util.*;
class Person{
	private String name;
	private int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj)
	{
		
		if(!(obj instanceof Person))
			return false;
		Person p=(Person)obj;
		System.out.println("......"+p.name);
		return this.name.equals(p.name) &&this.age==p.age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Person("zhangsan", 14));
		al.add(new Person("zhangsan2", 15));
		al.add(new Person("zhangsan3", 16));
		al.add(new Person("zhangsan", 14));
		printName(al);
		System.out.println("....");
		al=linkElement(al);
		printName(al);

	}
	public static ArrayList linkElement(ArrayList a){
		ArrayList newA=new ArrayList();
		Iterator it=a.iterator();
		while(it.hasNext())
		{	
			Object obj=(Person)it.next();
			if(!newA.contains(obj))
				newA.add(obj);
		}
		return newA;
	}
	public static void printName(ArrayList a)
	{
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			Person p=(Person)it.next();
			System.out.print(p.getName()+",");
		}
	}
	
}

package day15_treeSet;
import java.util.*;

import org.omg.CORBA.PUBLIC_MEMBER;
public class GenericDemo6 {
	public static void main(String[] args) {
		ArrayList<Person> al=new ArrayList<Person>();
		al.add(new Person("abc"));
		al.add(new Person("ccs"));
		al.add(new Person("efde"));
		printColl(al);
		
		ArrayList<Student1> al2=new ArrayList<Student1>();
		al2.add(new Student1("yewwu"));
		al2.add(new Student1("geweuo"));
		al2.add(new Student1("ewcrong"));
		printColl(al2);
	}
	public static void printColl(ArrayList<? extends Person> al)
	{
		Iterator<? extends Person> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getName());
		}
	}
	/*public static void printColl(ArrayList<?> al)
	{
		Iterator<?> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}*/
}
class Person
{
	private String name;
	private int age;
	Person(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
class Student1 extends Person
{
	Student1(String name)
	{
		super(name);
	}
}
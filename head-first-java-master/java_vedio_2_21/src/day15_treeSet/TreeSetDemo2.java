package day15_treeSet;
import java.util.*;
public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new Mycompare());
		ts.add(new Student2("lisi02",22));
		ts.add(new Student2("lisi007",20));
		ts.add(new Student2("lisi09",20));
		ts.add(new Student2("lisi01",40));
		ts.add(new Student2("lisi007",24));
//		ts.add(new Student("lisi09",20));
//		ts.add("weqwe");
		Iterator it=ts.iterator();
		while(it.hasNext())
		{	
			Student2 s=(Student2)it.next();
			System.out.println("name="+s.getName()+"...age="+s.getAge());
		}
	}
}

class Student2 implements Comparable//该方法强制让学生具备比较性
{
	private String name;
	private int age;
	Student2(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int compareTo(Object obj)
	{
		return -1;
		/*if(!(obj instanceof Student))
			throw new RuntimeException("不是学生对象");
		Student s=(Student)obj;
		if(this.age>s.age)
			return 1;
		if(this.age==s.age)
		{
			return this.name.compareTo(s.name);
		}
			
		return -1;*/
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
class Mycompare implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student2 s1=(Student2)o1;
		Student2 s2=(Student2)o2;
		int num= s1.getName().compareTo(s2.getName());
		if(num==0)
		{
/*			if(s1.getAge()>s2.getAge())
				return 1;
			if(s1.getAge()==s2.getAge())
				return 0;
			return -1;*/
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
		}
		return num;
	}
}

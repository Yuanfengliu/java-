package day15_treeSet;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(new Student("lisi02",22));
		ts.add(new Student("lisi007",20));
		ts.add(new Student("lisi09",20));
		ts.add(new Student("lisi01",40));
//		ts.add(new Student("lisi09",20));
//		ts.add("weqwe");
		Iterator it=ts.iterator();
		while(it.hasNext())
		{	
			Student s=(Student)it.next();
			System.out.println("name="+s.getName()+"...age="+s.getAge());
		}
	}
}

class Student implements Comparable//该方法强制让学生具备比较性
{
	private String name;
	private int age;
	Student(String name,int age)
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

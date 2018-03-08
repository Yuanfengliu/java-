package day16_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student implements Comparable<Student>
{
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int hashCode()
	{
		return name.hashCode()+age*34;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("类型不匹配");
		Student s=(Student)obj;
		return this.name.equals(s.name) && this.age==age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return name+":"+age;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		int num=new Integer(this.age).compareTo(new Integer(s.age));
		if(num==0)
		{
			return this.name.compareTo(s.name);
		}
		return num;
	}
}
public class MapTest {
	public static void main(String[] args) {
		HashMap<Student, String> hm=new HashMap<Student,String>();
		hm.put(new Student("zhangsan",10),"beijing");
		hm.put(new Student("zhangsan2",12),"shangahi");
		hm.put(new Student("zhangsan3",14),"nanjing");
		hm.put(new Student("zhangsan4",66),"wuhan");
		//第一种取出方式
		/*Set<Student> keySet=hm.keySet();
		Iterator<Student> it=keySet.iterator();
		while(it.hasNext())
		{
			Student key=it.next();
			String value=hm.get(key);
			System.out.println("key:"+key+"  value:"+value);
		}*/
		//第二种取出方式 entrySet
		Set<Map.Entry<Student, String>> entrySet=hm.entrySet();
		Iterator<Map.Entry<Student, String>> it=entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<Student, String> m=it.next();
			Student key=m.getKey();
			String value=m.getValue();
			System.out.println("key:"+key+"  value:"+value);
		}
		
	}

	
	
}

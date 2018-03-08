package day16_Map;
import java.util.*;
import java.util.Map.Entry;
class Student2 implements Comparable<Student2>
{
	private String name;
	private int age;
	Student2(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int hashCode()
	{
		return name.hashCode()+age*34;
	}
	public boolean euqals(Object obj)
	{
		if(!(obj instanceof Student2))
			throw new ClassCastException("¿‡–Õ≤ª∆•≈‰");
		Student2 s=(Student2)obj;
		return this.name.equals(s.name)&& this.age==s.age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	@Override
	public int compareTo(Student2 s) {
		// TODO Auto-generated method stub
		int num=new Integer(this.age).compareTo(new Integer(s.age));
		if(num==0)
		{
			return this.name.compareTo(s.name);
		}
		return num;
	}
}
class StuNameComparator implements Comparator<Student2>
{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		int num=o1.getName().compareTo(o2.getName());
		if(num==0)
		{
			return new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
		}
		return num;
	}
	
}
public class TreeMapTest {
//	Student st=new Stundet();
	public static void main(String[] args) {
		TreeMap<Student2, String> tm=new TreeMap<Student2, String>(new StuNameComparator());
		tm.put(new Student2("blisi3", 23), "nanjing");
		tm.put(new Student2("lisi1", 24), "nanjing");
		tm.put(new Student2("alisi4", 24), "wuhan");
		tm.put(new Student2("clisi3", 22), "shanghai");
		
		Set<Map.Entry<Student2, String>> entrySet=tm.entrySet();
		Iterator<Map.Entry<Student2, String>> it=entrySet.iterator();
		while(it.hasNext())
		{	
			Map.Entry<Student2, String> m=it.next();
			Student2 key=m.getKey();
			String value=m.getValue();
			System.out.println("Key:  name="+key.getName()+",age="+key.getAge()+" .Value:"+value);
		}
	}
}

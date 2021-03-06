/*
需求：对学生对象的年龄进行升序排列。

因为数据是以键值对形式存在的
所以要使用可以排序的Map集合。TreeMap
*/
import java.util.*;
class StuNameComparator implements Comparator<Student>
{
	private String name;
	private int age;

	public int compare(Student s1,Student s2)
	{
		int num=s1.getName().compareTo(s2.getName());		
		if(num==0)
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
		return num;
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
class  MapTest4
{
	public static void main(String[] args) 
	{
		System.out.println("----------Hello World!----------");

		//TreeMap<Student,String> tm=new TreeMap<Student,String>();
		TreeMap<Student,String> tm=new TreeMap<Student,String>(new StuNameComparator());

		tm.put(new Student("dlisi1",27),"beijing");
		tm.put(new Student("alisi2",22),"shanghai");
		tm.put(new Student("lisi3",21),"shangrao");
		tm.put(new Student("blisi4",23),"jiaxing");

		Set<Map.Entry<Student,String>> entrySet =tm.entrySet();

		Iterator<Map.Entry<Student,String>> it =entrySet.iterator();
		while (it.hasNext())
		{
			Map.Entry<Student,String> me =it.next();
			
			Student stu=me.getKey();
			
			String addr =me.getValue();
			System.out.println(stu+"::: "+addr);
		}
	}
}

/*
|--Set：元素是无序的，不能重复。
	|--HashSet：底层数据结构是哈希表。
		HashSet是如何保证元素的唯一性的呢？
		是通过元素的两个方法。hashCode和equals来完成。
		如果元素的HashCode值相同，才会判断equals是否为true，
		如果元素的hashCode不同，不会判断equals。
	|--TreeSet:可以对set集合中的元素进行排序。（自然数排序）
				底层数据结构是二叉树。
				保证元素唯一性的依据。
				comparaTo方法return 0（返回0  就是比较结果是相同的意思，只留下一组数据）
				（若在67-81行注释掉，换成return 1;则结果总是从大到小的排列，二叉树总是往右排）
			
			TreeSet排列的第一种方式：让元素自身具备比较性。
			元素需要实现Comparable接口，覆盖compareTO方法。
			这种方式也成为元素的自然顺序，或者叫做默认顺序

			TreeSet排序的第二种方式：
			当元素自身不具备比较性时，或者具备的比较性不是锁需要的。
			这时就需要让集合自身具备比较性。
			在集合初始化时，就有了比较方式。



需求：
往Treeset集合中存储自定义对象学生。
想按照学生的年龄进行排序。

记住，排序时，当主要条件相同时，一定判断一下次要条件。（这里是73行）
*/
import java.util.*;
class  TreeSetDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		TreeSet ts =new TreeSet();

		ts.add(new Student("nba02",22));
		ts.add(new Student("nba03",20));
		ts.add(new Student("nba07",24));
		ts.add(new Student("nba05",24));
				//结果不是按输入顺序排列，按自然顺序排列
		Iterator it =ts.iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());
			Student stu =(Student)it.next();
			System.out.println(stu.getName()+"..."+stu.getAge());
		}
	}
}
class Student implements Comparable//该接口强制让学生具备比较性
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
		if(!(obj instanceof Student))
			throw new RuntimeException("不是学生对象");
		Student s=(Student)obj;

		System.out.println(this.name+".....compareto........"+s.name);
		
		if(this.age>s.age)
			return 1;
		if(this.age==s.age)
		{
			return this.name.compareTo(s.name);
			//return 0;//注释这一行和注释上一行效果不一样，可以试下看下
		}
			
		return -1;
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
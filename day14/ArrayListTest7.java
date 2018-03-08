/*
���Զ��������ΪԪ�ش浽ArrayList�����У���ȥ���ظ�Ԫ�ء�

���磺
1�����������������ݷ�װ���˵Ķ���
2���������������˴���
3��ȡ��

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

		System.out.println(this.name+"---------"+p.name);//��ӡ���֣��������ȥ�ģ����κ�ǰ�����Ƚϣ����Ƿ���ظ���
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
		//����һ����ʱ������
		ArrayList newAl =new ArrayList();
		Iterator it =al.iterator();

		while (it.hasNext())
		{
			Object obj=it.next();

			if(!newAl.contains(obj))//newAl����û��objԪ�أ������ӽ������ʱ������
				newAl.add(obj);
		}
		return newAl;
	}
}

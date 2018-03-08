/*
ÿһ��ѧ�����ж�Ӧ�Ĺ����ء�
ѧ��Student����ַString��
ѧ�����ԣ�����������
ע�⣺������������ͬ����Ϊͬһ��ѧ��
��֤ѧ����Ψһ��

˼·��
1.����ѧ��
2.����map��������ѧ����Ϊ������ַ��Ϊֵ�����롣
3.��ȡmap�����е�Ԫ��
*/
import java.util.*;
class Student implements Comparable<Student>
{
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student s)
	{
		int num=new Integer(this.age).compareTo(new Integer(s.age));

		if(num==0)
			return this.name.compareTo(s.name);
		return num;
	}
	public int hashCode()
	{
		return name.hashCode()+age*34;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("���Ͳ�ƥ��");
		Student s=(Student)obj;
		return this.name.equals(s.name) && this.age==s.age;
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
}
class MapTest3 
{
	public static void main(String[] args) 
	{
		System.out.println("----------------Hello World!----------");

		HashMap<Student,String> hm=new HashMap<Student,String>();

		hm.put(new Student("lisi1",21),"beijing");
		hm.put(new Student("lisi2",22),"shanghai");
		hm.put(new Student("lisi3",23),"shangrao");
		//hm.put(new Student("lisi3",23),"shangrao");//һ�������ӡ���������ǰ�ѧ������equals����ɾ��
		hm.put(new Student("lisi4",24),"jaixing");

		//��һ��ȡ����ʽ
		Set<Student> keySet=hm.keySet();

		Iterator<Student> it =keySet.iterator();

		while (it.hasNext())
		{
			Student stu =it.next();
			
			String addr =hm.get(stu);
			System.out.println(stu+":  "+addr);
		}

System.out.println("-------------------------------------------");
		//�ڶ���ȡ����ʽ
		Set<Map.Entry<Student,String>> entrySet =hm.entrySet();

		Iterator<Map.Entry<Student,String>> iter =entrySet.iterator();
		while (iter.hasNext())
		{
			Map.Entry<Student,String> me =iter.next();
			
			Student stu=me.getKey();
			
			String addr =me.getValue();
			System.out.println(stu+":  "+addr);
		}

	}
}
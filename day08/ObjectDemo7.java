/*
Object:�����ж����ֱ�Ӻ��߼�Ӹ��࣬��˵�е��ϵۡ�
�����ж���Ŀ϶������ж��󶼾߱��Ĺ��ܡ�

Object�����Ѿ��ṩ�˶Զ����Ƿ���ͬ�ıȽϷ�����
����Զ�������Ҳ�бȽ���ͬ�Ĺ��ܣ�û�б�Ҫ���¶��塣
ֻҪ��Ϯ����Ĺ��ܣ������Լ����бȽ����ݼ��ɡ�����Ǹ��ǡ�
*/

class Demo//extends object
{
	private int num;
	Demo(int num)
	{
		this.num=num;
	}
	public boolean equals(Object obj)//Object obj=new Demo()
	{
		if (!(obj instanceof Demo))//�ж������Ƿ����
		{
			return false;
		}
		Demo d=(Demo)obj;//ת��
		return this.num==d.num;
	}
//	public boolean compare(Demo d)
//	{
//		return this.num==d.num;
//	}

	public String toString()//��д
	{
		return "demo:"+num;
	}
}
class Person
{
}
class ObjectDemo7 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo d1=new Demo(4);
		Demo d2=new Demo(6);
		Demo d3= d1;

		System.out.println(d1.equals(d3));
		System.out.println(d1==d2);
		System.out.println(d1==d3);

System.out.println("------------------------");
//		System.out.println(d1.compare(d2));
		System.out.println(d1.equals(d2));

System.out.println("------------------------");

		Person p1=new Person();
		Person p2=new Person();
		System.out.println("person:   "+p1.equals(p2));
	
System.out.println("------------------------");
		Class c=d1.getClass();
		System.out.println(c.getName());
		System.out.println(c.getName()+"@"+Integer.toHexString(d1.hashCode()));
		System.out.println(d1.toString());//ת�����ַ���//��������һ��һ���Ľ�������漸��������ʮ������	
		//���û��31��34���������н����һ����

System.out.println("------------------------");
		Demo d5=new Demo(8);
		System.out.println(d5.toString());
	}
}
/*
this��䣺���ڹ��캯��֮��Ļ�����á���������һ�㺯����
this���ֻ�ܶ����ڹ��캯���ĵ�һ�У���Ϊ��ʼ��Ҫ��ִ�С�
*/
class Person
{
	private String name;
	private int age;
	Person()
	{
		System.out.println("A��name="+name+",,age="+age);
	}
	Person(String name)//����ǹ��캯����������һ��
	{
		//this.name=name;
		this();
		//System.out.println("B��name="+name+",,age="+age);
	}
	Person(String name,int age)//����ǹ��캯����������һ��
	{
		//this.name=name;
		this(name);//this��������
		this.age=age;
		System.out.println("C��name="+name+",,age="+age);
	}
}
class  personThis
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Person p=new Person("����",10);
	}
}

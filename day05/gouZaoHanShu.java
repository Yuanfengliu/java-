/*���캯��
�ص㣺
1����������������ͬ
2�����ö��巵��ֵ����
3��������дreturn���
���ã�
��������г�ʼ��
*/

/*
����һ�������ͻ������֮��Ӧ�Ĺ��캯��
���캯�������ã��������ڸ���������ʼ����
��һ������û�ж��幹�캯��ʱ����ôϵͳ��Ĭ�ϸ��������һ���ղ����Ĺ��캯��

�������Զ����˹��캯����Ĭ�ϵĹ��캯����û����

���캯����һ�㺯����д�����в�ͬ��
1�������ϲ�ͬ��
���캯�����ڶ���һ���������У��������ʼ����
��һ�㷽���Ƕ��������ִ�У���������Ӷ���߱��Ĺ��ܡ�

2��һ�������������캯��ֻ����һ�Σ�
��һ�㷽�����Ա��ö�����ö�Ρ�

ʲôʱ���幹�캯���أ�
����������ʱ����������ھ߱�һЩ���Ի�����Ϊ����ô����Щ���ݶ����ڹ��캯���С�

*/
/*
this:����ȥ�����������־ֲ������ͳ�Ա����ͬ�������
thisΪʲô���Խ����������أ�
this���״������ʲô�أ�

this���ʹ�����Ķ��󣬴��������ں���������������á�
	��˵���ĸ������ڵ���this���ڵĺ�����this�ʹ����ĸ�����
this��Ӧ�ã����������й���ʱ���ú����ڲ�Ҫ�õ����øú����Ķ���ʱ����ʱ��this����ʾ�������
			�����๦���ڲ�ʹ���˱�����󣬶���this��ʾ��
*/
class Person
{
	private String name;
	private int age;
	/*��������飺
	���ã���������г�ʼ����
	����һ���������У����������ڹ��캯��ִ�С�
	�͹��캯��������
	���������Ǹ����ж������ͳһ��ʼ����
	�����������Ǹ���Ӧ�Ķ����ʼ����

	���������ж�����ǲ�ͬ�����Եĳ�ʼ�����ݡ�
	*/
	{//��������ڵľ��Ǿ��й��ԵĴ����
		//System.out.println("person code run");
		cry();
	}
	Person(int age)
	{
		this.age=age;
		System.out.println("D��name="+name+",,age="+age);
	}

	Person()//����ǹ��캯����������һ��//�������������еĹ���ĺ���˽�л���
						//��ô�����Ͳ��ܴ���������Ϊ���󶼲��ܳ�ʼ������
	{
		System.out.println("A��name="+name+",,age="+age);
		
	}
	Person(String name)//����ǹ��캯����������һ��
	{
		this.name=name;//this���Ϳ���30��
		System.out.println("B��name="+name+",,age="+age);
	}
	Person(String name,int age)//����ǹ��캯����������һ��
	{
		this.name=name;
		this.age=age;
		System.out.println("C��name="+name+",,age="+age);
	}
	public void cry()//һ�������ĺ���
	{
		System.out.println("...cry...");
	}
	public void setName(String n)//������
	{
		name=n;
	}
	public String getName()//�õ����� 
	{
		return name;
	}
/*���󣺸��˶���һ�����ڱȽ������Ƿ���ͬ�Ĺ��ܣ�Ҳ�����Ƿ���ͬ����*/
	public boolean compare(Person p)
	{
		return this.age==p.age;
	}
}

class  gouZaoHanShu
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Person p1=new Person();//����˳���û�����֣�û������//����һ�������ͻ������֮��Ӧ�Ĺ��캯��
		p1.cry();//��һ������������Σ��������һ�㺯����
					//��������Person p1=new Person();�����䣬������ȼ����ٴ���һ��������������
		System.out.println("---------------------------------------");
		Person p2=new Person("zhang san");//����˳��������֣�û������
		
		System.out.println("---------------------------------------");

		Person p3=new Person("����",10);//����˳��������֣�������
		p3.setName("���");//���Ը�����
		p3.setName("������");//�����ٸ�����
		System.out.println(p3.getName());

		System.out.println("---------------------------------------");

		Person p4=new Person("��Ԩ",24);
		Person p5=new Person(20);
		boolean b=p4.compare(p5);
		System.out.println("�Ƿ�ͬ���أ���"+b);
	}
}

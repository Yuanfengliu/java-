/*
�����ڿ���һ��ϵͳʱ����Ҫ������Ա�����н�ģ��Ա������3�����ԣ�
�����������Լ����ʡ�����Ҳ��Ա�������˺���Ա���������⣬���⻹��һ��
�������ԡ���ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ�
���������Է��ʡ�
 Ա���ࣺname id pay
 �����ࣺ�̳���Ա���������Լ����е�bonus
*/

abstract class Employee  //Ա�������Ǿ������ͨԱ������Ա������˼��
{
	private String name;
	private String id;
	private double pay;
	Employee(String name,String id,double pay)
	{
		this.name=name;
		this.id=id;
		this.pay=pay;
	}
	public abstract void work();//ÿ���˵Ĺ������ܲ�һ��������Ҫ����
	
}
class Manager extends Employee  //����
{
	private int bonus;//bonus������
	Manager(String name,String id,double pay,int bonus)
	{
		super(name,id,pay);
		this.bonus=bonus;
	}
	public void work()
	{
		System.out.println("manager work");
	}
}
class Pro extends Employee   //��ͨԱ��
{
	Pro(String name,String id,double pay)
	{
		super(name,id,pay);
	}
	public void work()
	{
		System.out.println("pro work");
	}
}
class  AbstractDemo7
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

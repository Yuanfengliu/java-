//��װ����ָ���ض�������Ժ�ʵ��ϸ�ڡ��������ṩ�������ʷ�ʽ��
//�ô���1�����任���롣2������ʹ�á�3����������ԡ�4����߰�ȫ��
//��װԭ��1��������Ҫ�����ṩ�����ݶ�����������2�������Զ����أ��ṩ��������������ʡ�

/*
private:˽�У�Ȩ�����η��������������еĳ�Ա����Ա��������Ա��������
˽��ֻ�ڱ�������Ч��

��age˽�л��Ժ������⼴ʹ�����˶���Ҳ����ֱ�ӷ��ʡ�
������Ӧ�������䣬����Ҫ��Person�����ṩ��Ӧ����age�ķ�ʽ��

ע�⣺˽�н����Ƿ�װ�ı�����ʽ

֮���Զ����ṩ���ʷ�ʽ������Ϊ�����ڷ��ʷ�ʽ�м����߼��жϵ���䡣
�Է��ʵ����ݽ��в������ṩ���뽡׳�ԡ�


*/
class Person
{
	private int age;
	public void setAge(int a)
	{
		if (a>0 && a<130)
		{
			age=a;
			speak();
		}
		else 
			System.out.println("�Ƿ�������");
		
	}
	public int getAge()//�õ����� 
	{
		return age;
	}
	void speak()
	{
		System.out.println("sge="+age);
	}
}
class duiXiang2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Person p=new Person();
		//p.age=10;//��ΪPerson���У�age�Ѿ�˽�л������ܷ���
		
		p.setAge(24);
		p.speak();
		
	}
}

/*


*/
class Fu
{
	int  num=5;
	void method1()
	{
		System.out.println("fu method_1");
	}
	void method2()
	{
		System.out.println("fu method_2");
	}
	static void method4()
	{
		System.out.println("fu method_4");
	}
}
class Zi extends Fu
{
	int num=8;
	void method1()
	{
		System.out.println("zi method_1");
	}
	void method3()
	{
		System.out.println("zi method_2");
	}
	static void method4()
	{
		System.out.println("zi method_4");
	}
}

class DuoTaiDemo4 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Fu f1=new Zi();
		System.out.println(f1.num);//�����5�����ͼ�66��67
		Zi z1=new Zi();
		System.out.println(z1.num);//8

		System.out.println("----------------");
		Fu f2=new Zi();
		f2.method4();//����Ǹ���ķ����ģ����ͼ�68��69
		Zi z2=new Zi();
		z2.method4();//���������ķ����ģ�		
		System.out.println("----------------");

		Fu f=new Zi();
		f.method1();
		f.method2();
//		f.method3();//������Ͳ����ˣ���Ϊ��������û�з�����
/*
�ڶ�̬�г�Ա�������ص㣺  
�ڱ���ʱ�ڣ����������ͱ��������������Ƿ��е��õķ���������У�����ͨ�������û�У�����ʧ�ܡ�
������ʱ�ڣ����Ķ��������������Ƿ��е��õķ�����  
���ܽ���ǣ���Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұߡ������ǵȺŵ���߻����ұ߱���ʽ��ʲô����˼��

//�����¼��еĽ����������вŶ����
�ڶ�̬�У���Ա���� ���ص㣺
���۱��뻹�����У����ο���ߣ������ͱ����������ࣩ�� ����42��46�Ǽ��У� 
�ڶ�̬�У���̬��Ա���� ���ص㣺
���۱��뻹�����У����ο���ߣ������ͱ����������ࣩ��
*/

/**********���������ǿ�����������********/
//		Zi z=new Zi();
//		z.method1();
//		z.method2();
//		z.method3();

	
	}
}
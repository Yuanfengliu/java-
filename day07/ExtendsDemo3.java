/*
�Ӹ����еĺ������ص�
������͸����г���һ���ĺ���ʱ��
�����������øú��������������ຯ�������ݡ�
��ͬ����ĺ���������һ����

��������Ǻ�������һ�����ԣ���д�����ǣ�
������̳и��࣬��Ϯ�˸���Ĺ��ܣ��������У�
��������߱��ù��ܣ����ǹ��ܵ�����ȴ�͸��಻һ�¡�
��ʱû�б�Ҫ�����¹��ܣ�����ʹ�ø������⣬��������Ĺ��ܶ��壬����д�������ݡ�

���ǣ�
1.���า�Ǹ��࣬���뱣֤����Ȩ�޴��ڸ���Ȩ�ޣ��������ʧ��
2.��ֻ̬�ܸ��Ǿ�̬��

��Ҽ�ס��
���أ�ֻ��ͬ�������Ĳ����б�
��д���Ӹ��෽��Ҫһģһ����
*/

class Fu
{
	void show()
	{
		System.out.println("fu show");
	}
	void speak()
	{
		System.out.println("vb");
	}
}
class Zi extends Fu
{
	void speak()
	{
		System.out.println("java");
	}
	void show()
	{
		System.out.println("zi show");
	}
}

class  ExtendsDemo3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Zi z=new Zi();
		z.speak();
	}
}
class Tel
{
	void show()
	{
	System.out.println("number");
	}
}
class NewTel extends Tel//������չ�������п��Է����޸�Դ�룬
{
	void show()
	{
	//System.out.println("number");
	super.show();
	System.out.println("name");
	System.out.println("pic");
	}
}
/*
��̬�����
��ʽ��
static
	{
		��̬�����е�ִ����䡣
	}

�ص㣺������ļ��ض�ִ�У�ִֻ��һ�Σ�������������������ס����һ�Ρ�
���ڸ�����г�ʼ����
*/
class staticCode
{
	static
	{
		System.out.println("a");
	}
	public static void show()
	{
		System.out.println("show run");
	}
}


class  staticCodeDemo
{
	static
	{
		System.out.println("b");
	}
	public static void main(String[] args) 
	{
		new staticCode();
		new staticCode();//��һ�в�����ִ�У���Ϊ����һ���Ѿ�ִ�й�һ�Ρ�
		System.out.println("Hello World!");
		staticCode.show();
		staticCode s=null;
	}
	static
	{
		System.out.println("c");
	}
}

/*
�ڲ��ඨ���ھֲ�ʱ��  
1. �����Ա���Ա���η�����
2. ����ֱ�ӷ����ⲿ���еĳ�Ա����Ϊ�������ⲿ���е����á�
���ǲ����Է��������ڵľֲ��еı�����ֻ�ܷ��ʱ�final���εľֲ�����

*/
class Outer
{
	int x=3;
	void method(final int a)
	{
		final int y=4;
		class Inner
		{
			void function()
			{
				System.out.println("x="+Outer.this.x);
				System.out.println("y="+y);
				System.out.println("a="+a);
			}
		}
		new Inner().function();//��Ҫ������Innerǰ�棬��Ϊ���������Inner��û�ж���
	}
}

class InnerClassDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		new Outer().method(7);
	
	
	}
}
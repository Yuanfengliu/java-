/*
�ڲ�����ʹ���
1. �ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽��  
    ֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա������Ϊ�ڲ����г����� һ���ⲿ������ã���ʽ���ⲿ����.this
2. �ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ������  
	ֱ�ӷ����ڲ����еĳ�Ա  

���ʸ�ʽ��  
1�����ڲ��ඨ�����ⲿ��ĳ�Աλ���ϣ����ҷ�˽�л����������ⲿ�������С�
����ֱ�ӽ����ڲ������
��ʽ�� �ⲿ����.�ڲ�����  ������ = �ⲿ�����.�ڲ������
		Outer.Inner in=new Outer().new Inner();

2�����ڲ����ڳ�Աλ���ϣ��Ϳ��Ա���Ա���η������Ρ�
   ���磬private�����ڲ������ⲿ���н��з�װ��
	static���ڲ���;߱�static�����ԡ�
/*/
class Outer
{
	private int x=3;
	class Inner//�ڲ���
	{
		int x=4;
		void function()
		{
			int x=6;
			System.out.println("inner:"+x);//���xû��4��6����ʵ����xǰ���ʡ��Outer.this.
	
			System.out.println("inner:"+this.x);//��ӡ�������4�ķ���
		
			System.out.println("inner:"+Outer.this.x);//��ӡ�������3�ķ���
		}
	}
	void method()
	{
		Inner in =new Inner();
		in.function();
	}
}
class  InnerClassDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Outer out=new Outer();//����һ�ַ����ڲ���ķ���
		out.method();

System.out.println("--------------------");

		//ֱ�ӷ����ڲ����еĳ�Ա��
		Outer.Inner in=new Outer().new Inner();//һ�㲻��������������������Ǳ���
		System.out.println("ֱ�ӷ����ڲ����еĳ�Ա:  ");
		in.function();
	}
}

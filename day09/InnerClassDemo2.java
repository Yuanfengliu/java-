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

2�����ڲ����ڳ�Աλ���ϣ��Ϳ��Ա���Ա���η������Ρ���********���²����ص�����********��
   ���磬private�����ڲ������ⲿ���н��з�װ��
	static���ڲ���;߱�static�����ԡ�
	���ڲ��౻static���κ�ֻ��ֱ�ӷ����ⲿ���е�static��Ա�������˷��ʾ��ޡ�

	���ⲿ�������У����ֱ�ӷ���static���ڲ���ķǾ�̬��Ա�أ�
	    new Outer.Inner().function();

	���ⲿ�������У����ֱ�ӷ���static���ڲ���ľ�̬��Ա�أ�
		Outer.Inner.function();

ע�⣺���ڲ����ж����˾�̬��Ա�����ڲ��������static��
		���ⲿ���еľ�̬���������ڲ�ʱ���ڲ���Ҳ������static�ġ�

����������ʱ��������ڲ�����������������ڲ�����������
��Ϊ�ڲ�������ʹ���ⲿ��������ݡ�
/*/
class Outer
{
	private static int x=3;

	static class Inner//��̬�ڲ���
	{
		
		 static void function()
		{
			
			System.out.println("inner:"+x);
		
		}
	}
		static class Inner2
		{
			void show()
			{
				System.out.println("inner2 show");
			}
		}
		public static void method()
		{		
			Inner.function();
			new Inner2().show();
		}

}
class  InnerClassDemo2
{
	public static void main(String[] args) 
	{
		
		new Outer.Inner().function();
		Outer.Inner.function();

System.out.println("--------------");
		Outer.method();
		//ֱ�ӷ����ڲ����еĳ�Ա��
//		Outer.Inner in=new Outer().new Inner();//һ�㲻��������������������Ǳ���
//		System.out.println("ֱ�ӷ����ڲ����еĳ�Ա:  ");
//		in.function();
	}
}

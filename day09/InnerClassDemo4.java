/*
�����ڲ���
1. �����ڲ�����ʵ�����ڲ���ļ�д��ʽ  
2. ���������ڲ����ǰ�᣺
	�ڲ�������Ǽ̳�һ�������ʵ�ֽӿڡ�  
3. �����ڲ���ĸ�ʽ��new ������߽ӿڣ���{�������������}    (30��36��)
4. ��ʵ�����ڲ������һ������������󣬶�����������е��֡���������Ϊ�����ݵĶ���  
5. �����ڲ����ж���ķ�����಻Ҫ����������
*/

abstract class abcDemo
{
	abstract void show();
}
class Outer
{
	int x=3;
	/*
	class Inner extends abcDemo
	{
		void show()
		{
			System.out.println("show:"+x);
		}
	}
	*/
	public void function()
	{
//		new Inner().show();
		new abcDemo()
		{
			void show()
			{
				System.out.println("show:"+x);
			}
		}.show();

		abcDemo d=new abcDemo()
		{
			void show()
			{
				System.out.println("show(d���������):"+x);
			}
			void abc()
			{
				System.out.println("haha");
			}
		};
		d.show();
		//d.abc();//����ʧ�ܣ�����û�ж���abc����

	}
}
class InnerClassDemo4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		new Outer().function();
	}
}

interface Inter5
{
	void method();
}
class Test
{
	//������롣ͨ�������ڲ��ࡣ
	/*
	static class Inner implements Inter5
	{
		public void method()
		{
			System.out.println("method run");
		}
	}
	*/

	static Inter5 function()
	{
		return new Inter5()
		{
			public void method()
			{
				System.out.println("method run");
			}	
		};
	}
}
class InnerClassTest5 
{
	public static void main(String[] args) 
	{
		Test.function().method();//�൱�� Inter5 in=Test.function();   in.method();
		//Test.function()  :Test������һ����̬�ķ���function.
		//.method() :function������������ý����һ�����󡣶�����һ��Inter5���͵Ķ���
		//��Ϊֻ����Inter5���͵Ķ��󣬲ſ��Ե���method������
	
			
	}
}

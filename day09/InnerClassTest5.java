
interface Inter5
{
	void method();
}
class Test
{
	//不足代码。通过匿名内部类。
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
		Test.function().method();//相当于 Inter5 in=Test.function();   in.method();
		//Test.function()  :Test类中有一个静态的方法function.
		//.method() :function这个方法运算后得结果是一个对象。而且是一个Inter5类型的对象。
		//因为只有是Inter5类型的对象，才可以调用method方法。
	
			
	}
}

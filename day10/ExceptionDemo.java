/*
finally����飺����һ��ִ�еĴ��롣ͨ�����ڹر���Դ��

��һ�ָ�ʽ��
try
{
}
catch()
{
}
�ڶ��ָ�ʽ��
try
{	
}
catch ()
{
}
finally
{
}
�����ָ�ʽ��
try
{	
}
finally
{
}
��סһ�㣺catch�����ڴ����쳣�ġ����û��catch�ʹ����쳣û�б��������������쳣�Ǽ��ʱ�쳣����ô��������.
*/
class FuShuException extends Exception	
{	
	
	FuShuException(String msg)
	{
		super(msg);
	}	
}
class Demo
{
	int div(int a,int b)throws FuShuException
	{
		if (b<0)
		{
			throw new FuShuException("�����˳���Ϊ������");
		}			
		return a/b;
	}									  
}
class  ExceptionDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo d=new Demo();
		try
		{
			int x=d.div(4,-1);
			System.out.println("x="+x);
		}
		catch (FuShuException e)
		{
			System.out.println(e.toString());
			return;//��һ����Ϊ�˺���ġ�over������䣬������û�����У�finally�κ�����¶���ִ�е�
		}
		finally 
		{
			System.out.println("finally");//finally�д�ŵ���һ���ᱻִ�еĴ���
		}							
		System.out.println("over");
	}
}

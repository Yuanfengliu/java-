
/*
Exception����һ������������쳣RuntimeException����ʱ�쳣��
����ں������׳����쳣�������Ͽ��Բ�������������һ��ͨ����  
����ں����������˸��쳣�������߿��Բ��ý��д�������һ��ͨ����
֮���Բ����ں�������������Ϊ����Ҫ�õ����ߴ��������쳣������ϣ������ֹͣ����Ϊ������ʱ���������޷���������������
ϣ��ֹͣ����󣬶Դ��뾡��������  

�Զ����쳣ʱ��������쳣�ķ������޷��ټ����������㣬�����Զ����쳣�̳�RuntimeException   

�����쳣�����֣� 

1. ����ʱ�������쳣��  
2. ����ʱ���������쳣������ʱ�쳣��RuntimeException�Լ������ࣩ


*/
class FuShuException extends RuntimeException	
{	
	
	FuShuException(String msg)
	{
		super(msg);
	}	
}

class Demo
{
	int div(int a,int b)//throws ArithmeticException
	{
		if (b<0)
		{
			throw new ArithmeticException("�����˳���Ϊ������");
		}
		if (b==0)
		{
			throw new ArithmeticException("�������");//�����׳�����ͨ������ִ�г�����Ϊ�������׳����ĸ�����RuntimeExceptionm��������Ҫ�������Ƚ����⡣
		}											//���ArithmeticException�ĳ�Exception���������붼����ͨ������Ϊ�������׳��ˣ������ϱ���������
		return a/b;
	}									  
}
class ExceptionDemo10 
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		Demo d=new Demo();
					
			int x=d.div(4,-4);
			System.out.println("x="+x);
		
		System.out.println("over");
	}
}

/*
�쳣�����ǳ���������ʱ���ֲ������������  
�쳣������������Ҳ����ʵ������һ����������Ҳ����ͨ��java�������ʽ����������
			����װ�ɶ�����ʵ����java�Բ������������������Ķ�������.

��������Ļ��֣����֣�һ�������ص����⣬һ���ǲ����ص�����

�������صģ�javaͨ��Error�����������������Error��һ�㲻��д����ԵĴ�����д�����
						������ת���쳣������Ǳ�Խ���쳣����ָ���쳣�ȵȣ���˼����û�ȵģ�ϵͳ������ʾ����������
���ڷ����صģ�javaͨ��Exception�����������������ʹ������ԵĴ�����ʽ���д��� ��

����Error����Exception������һЩ�������ݡ�
���磺�������������Ϣ������ԭ��ȡ�
throwable�����������֣�
	|--Error
	|--Exception

2���쳣�Ĵ�����java�ṩ�����е������д���   
try
{
	��Ҫ�����Ĵ��룻
}
catch(�쳣�� ����)
{
	�����쳣���룻��������ʽ��
}
finally
{
	һ����ִ�е���䣻
}
3.�Բ��񵽵��쳣������г����ķ���������
	String getMessage():��ȡ�쳣��Ϣ������������ĵ�60�У�
	toString()������ǻ�ȡ�쳣������ַ���������ʽ��������쳣���ƺ��쳣��Ϣ��������JDK API�ĵ��鿴
	printStackTrace()������JDK API�ĵ���֪����void�ͣ�û�з���ֵ���ʲ��������䣬ֱ�ӵ��ô˺����Ϳ��ԣ���63��
*/
class Demo
{
	int div(int a,int b)
	{
		return a/b;//���ִ���ʱ,����new ArithmeticException()���������catch��������
	}				//���û�к���catch��������������Լ�������������˯����֮ǰ��ʾ�ĳ��������
					  //����ֹͣ������У�����Ҳ�Ͳ���ִ�С�
}
class ExceptionDemo7
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo d=new Demo();
		try
		{
			int x=d.div(4,0);//�������԰�0�ĳ�1����������Ƿ�һ��
							//û�г�������ִ������һ��󣬲���ִ��catch������
						//���ִ���ʱ,����new ArithmeticException()���������catch����
			System.out.println("x="+x);	//�����������䲻��ִ�У�ֱ������catch����
		}
		catch (Exception e)//���ִ���ʱ���൱��Exception e=new ArithmeticException();
		{
			System.out.println("������");
			System.out.println(e.getMessage());//�����by zero
			System.out.println(e.toString());//���ֵĽ����  �쳣���ƣ��쳣��Ϣ
			System.out.println("------------------------------");
			e.printStackTrace();//����ǣ��쳣���ƣ��쳣��Ϣ���쳣����λ��
								//��ʵJVM������������쳣�������ƣ������ڵ���printStackTrace����
								//���ӡ�쳣�Ķ�ջ�ĸ�����Ϣ��
		}
		
		

		System.out.println("over");
	}
}
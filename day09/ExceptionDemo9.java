/*
�Զ����쳣��
��Ŀ�л�������е����⣬����Щ���Ⲣδ��java����������װ����
���Զ�����Щ���е�������԰���java�������װ��˼�룬�����е����⡣
�����Զ�����쳣��װ��

�����ڱ������У����ڳ�����-1��Ҳ��Ϊ��������޷���������ġ�
��ô����Ҫ�������������Զ����������

���ں����ڲ�������throw�׳��쳣������ô�ͱ���Ҫ����Ӧ�Ĵ�������  
Ҫô���ڲ�try catch����Ҫô�ں����������õ����ߴ���  

һ������£������ڳ����쳣����������Ҫ������

���ִ�ӡ�Ľ����ֻ���쳣�����ƣ�ȱû���쳣����Ϣ��
��Ϊ�Զ�����쳣��δ����������Ϣ��  

��ζ����쳣��Ϣ�أ�
�������Ѿ����쳣��Ϣ�Ĳ���������ˡ���������ֻҪ�ڹ���ʱ��
���쳣��Ϣ���ݸ�����ͨ��super��䡣��ôֱ�ӾͿ���ͨ��getMessage������ȡ�Զ�����쳣��

�Զ����쳣��
�������Զ�����̳�Exception��ԭ���ǣ�
�쳣��ϵ��һ���ص㣺��Ϊ�쳣����쳣���󶼱��׳������Ƕ��߱������ԡ�
�����������Throwable�����ϵ�еĶ����ص㡣ֻ�������ϵ�е���Ͷ���ſ��Ա�throw��throws������

*/
/*
class FuShuException extends Exception//�Լ�����ĸ����쳣Ҫ�̳��쳣������ϵͳ����ʶ
{
	private String msg;
	FuShuException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}
*///29-40�п��Ըĳ�43-50�У�ԭ���98-116һ���ĵ���
/*
class FuShuException extends Exception
{
	
	FuShuException(String msg)
	{
		super(msg);//�������࣬�������һ�ַ���һ��
	}	
}
*/
/************Ϊ��֪������Ĵ������ĸ����Խ�43-50�ĳ�53-65���������*******************/
class FuShuException extends Exception		//�Լ�����ĸ����쳣Ҫ�̳��쳣������ϵͳ����ʶ
{	
	private int value;
	FuShuException(String msg,int value)
	{
		super(msg);//�������࣬�������һ�ַ���һ��
		this.value=value;
	}
	public int getValue()
	{
		return value;
	}
}
class Demo
{
	int div(int a,int b)throws FuShuException
	{
		if (b<0)
		{
			throw new FuShuException("���ֳ������쳣�����------/by ����",b);//�ֶ�ͨ��throw�ؼ����׳�һ���Զ����쳣����
		}
		return a/b;
	}									  
}
class ExceptionDemo9
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		Demo d=new Demo();
		try
		{			
			int x=d.div(4,-2);
			System.out.println("x="+x);
		}		

		catch (FuShuException e)	
		{		
			System.out.println("�������ָ����ˣ�"+e.toString());//���ִ�����ʾʱ������û�о����쳣��Ϣ����Ϊ�ⲻ��Java�Դ��쳣����ģ����Լ������		
			System.out.println("����ĸ�����"+e.getValue());
		}
		System.out.println("over");
	}
}
/*
class Throwable
{
	private String message;
	Throwable(String getMessage)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}	
}
class Exception extends Throwable
{
	Exception(String message)
	{
		super(message);
	}
}
*/
/*
throws ��throw������
throwsʹ���ں�����(���������')'�͡�{��֮��)��throwʹ���ں�����

throws��������쳣�࣬���Ը�������ö��Ÿ�����
throw����������쳣����
*/
/*
�Զ��쳣�Ĵ���
1. �����쳣ʱ������������Ϊ������쳣����������Ŀ��Ը����塣
2. �Է����������쳣���Ͷ�Ӧ�м���catch�顣��Ҫ��������catch��  
   ������catch���е��쳣���ּ̳й�ϵ�������쳣catch����������棬�����س���  
   
�����ڽ���catch����ʱ��catch��һ��Ҫ����Ĵ���ʽ����Ҫ�򵥵Ķ���һ��e.peintStackTrace()��
Ҳ��Ҫ�򵥵ľ���дһ�������䡣

*/
class Demo
{
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException//�ڹ�����ͨ��throws�Ĺؼ��������˸Ĺ����п��ܻ��������//���Կ�����û����������������Ƿ�ͨ��
	{
		int[] arr =new int[a];
		System.out.println(arr[5]);//����4������û�нǱ�Ϊ5�ģ������쳣���Ǳ�Խ��
									//����쳣һ���֣�����һ��Ͳ���ִ�У���������Ͳ����ٽ���ִ�У��ͻ��׳�һ���쳣
		return a/b;
	}									  
}
class ExceptionDemo8
{
	public static void main(String[] args) //throws Exception//�����������׸������
	{
		System.out.println("Hello World!");
		Demo d=new Demo();
		try
		{			
			int x=d.div(4,0);
		}		
/*
		catch (ArithmeticException e)	
		{
		System.out.println(e.toString());	
		System.out.println("��������������");
		}
		catch (ArrayIndexOutOfBoundsException e)	
		{
		System.out.println(e.toString());
		System.out.println("�Ǳ�Խ���ˣ�����");
		}
*/
		catch (Exception e)	//����30-39����д�����¼��У���û������ԣ������塣���ᳫ�����ַ�����
		{					//Ҳ���Ժ�����2��һ����ϣ�����Ҫ��������档�������һ�����쳣�ͻ�ִ����������쳣��
			System.out.println("�쿴��"+e.toString());			
		}
		System.out.println("over");
	}
}

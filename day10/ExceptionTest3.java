/*******************************�쳣��ϰ1*********************
��һ��������
�����Ի�ȡ������������������ֵ���ֵ����Ϊ�ǻ�ȡ����������⡣
����ͨ���쳣����ʾ��
���ж����������л�����ơ�
*/
class NoValueException extends RuntimeException//�����Exception���21�оͲ���ע�͵���
{
	NoValueException(String message)
	{
		super(message);
	}
}
interface Shape
{
	void getArea();
}
class Rec implements Shape
{
	private int len,wid;
	Rec(int len,int wid)//throws NoValueException
	{
		if (len<=0 || wid<=0)
			throw new NoValueException("���ַǷ�ֵ");
		this.len=len;
		this.wid=wid;
	}
	public void getArea()
	{
		System.out.println(len*wid);
	}
}
class ExceptionTest3 
{	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Rec r=new Rec(-3,4);
			r.getArea();
		System.out.println("over");
		/*(���������������͵���7��21����2���Ķ�һ������ʱ�����������)
		try
		{
			Rec r=new Rec(-3,4);
			r.getArea();
		}
		catch (NoValueException e)
		{
			System.out.println(e.toString());
		}
		System.out.println("over");
		*/
	}
}
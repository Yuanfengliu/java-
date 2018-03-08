/*����ϰ������
����ʦ�õ����Ͽ�

˼���Ͽ��г��ֵ����⣺
���磺��������������ð��

Ҫ�����������������װ�ɶ���

����ð�̷����󣬳��ֽ��ν����޷�������
���ֽ�ʦ�����⣻��ʱ�ƻ��޷���ɡ�
*/

class LanPingException extends Exception//ϵͳ�������Դ���
{
	LanPingException(String message)
	{
		super(message);
	}
}
class MaoYanException extends Exception//ð��ϵͳ�����Դ���
{
	MaoYanException(String message)
	{
		super(message);
	}
}
class NoPlanException extends Exception
{
	NoPlanException (String msg)
	{
		super(msg);
	}
}
class Computer
{
	private int state=3;//����ֵ1��ʾ����
	public void run() throws LanPingException,MaoYanException
	{
		if (state==2)
			throw new LanPingException("������");	
		if (state==3)
			throw new MaoYanException("ð����");
		System.out.println("��������");
	}
	public void reset()
	{
		state=1;
		System.out.println("��������");
	}
}
class Teacher
{
	private String name;
	private Computer cmpt;
	Teacher(String name)
	{
		this.name=name;
		cmpt=new Computer();
	}
	public void prelect() throws NoPlanException//�����׳�����Ϊð���Լ��޷�����
	{
		try
		{
			cmpt.run();
		}
		catch (LanPingException e)
		{
			cmpt.reset();
		}
		catch (MaoYanException e)
		{
			test();
			throw new NoPlanException("��ʱ�޷�����"+e.getMessage());
			//test();��Ҫ���ں��棬ǰ��һ�������Ͳ�����ִ����
		}
		System.out.println("����");
	}
	public void test()
	{
		System.out.println("��ϰ");
	}
}
class ExceptionDemo11
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		Teacher t= new Teacher("����ʦ");
		try
		{
			t.prelect();
		}
		catch (NoPlanException e)
		{
			System.out.println(e.toString());
			System.out.println("����ʦ�����߷ż�");
		}
		
		
	}
}


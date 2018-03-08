/*（练习举例）
刘老师用电脑上课

思考上课中出现的问题：
比如：电脑蓝屏，电脑冒烟

要对问题进行描述，封装成对象。

可是冒烟发生后，出现讲课进度无法继续。
出现讲师的问题；课时计划无法完成。
*/

class LanPingException extends Exception//系统蓝屏可以处理
{
	LanPingException(String message)
	{
		super(message);
	}
}
class MaoYanException extends Exception//冒烟系统不可以处理
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
	private int state=3;//用数值1表示正常
	public void run() throws LanPingException,MaoYanException
	{
		if (state==2)
			throw new LanPingException("蓝屏了");	
		if (state==3)
			throw new MaoYanException("冒烟了");
		System.out.println("电脑运行");
	}
	public void reset()
	{
		state=1;
		System.out.println("电脑重启");
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
	public void prelect() throws NoPlanException//这里抛出是因为冒烟自己无法处理
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
			throw new NoPlanException("课时无法继续"+e.getMessage());
			//test();不要放在后面，前面一旦出错，就不会再执行了
		}
		System.out.println("讲课");
	}
	public void test()
	{
		System.out.println("练习");
	}
}
class ExceptionDemo11
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		Teacher t= new Teacher("刘老师");
		try
		{
			t.prelect();
		}
		catch (NoPlanException e)
		{
			System.out.println(e.toString());
			System.out.println("换老师，或者放假");
		}
		
		
	}
}


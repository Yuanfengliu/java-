/*
���󣺻�ȡһ�γ������е�ʱ�䡣
ԭ����ȡ����ʼ�ͽ�����ʱ�䲢������ɡ�

��ȡʱ�䣺System.currentTimeMillis()

����������Ż��󣬾Ϳ��Խ����������

���ַ�ʽ��ģ�鷽�����ģʽ��

ʲô��ģ�巽���أ�
���ڶ��幦��ʱ�����ܵ�һ������ȷ���ģ�������һ���ֹ���ʱ��ȷ���ģ�
��ȷ���Ĳ�����ʹ�ò�ȷ���Ĳ��֣��ͽ���ȷ���Ĳ��ֱ�¶��ȥ��

*/
abstract class GetTime
{
	public final void GetTime()//����final ֻ��Ϊ�˲���GetTime��д��ֻ��runcode()��д
	{
		long start =System.currentTimeMillis();
		runcode();
		long end =System.currentTimeMillis();
		System.out.println("");
		System.out.println("���룺"+(end-start));
	}
	public abstract void runcode();
//	{
//		for(int X=0;X<100;X++)
//		{
//			System.Out.Print(X);
//		}
//	}
}
class SubTime extends GetTime
{
	public void runcode()
	{		
		for(int x=0;x<111;x++)
		{
			System.out.print(x);
		}		
	}
}
class  TempplateDemo8
{
	public static void main(String[] args) 
	{
		//GetTime gt=new GetTime();
		SubTime gt=new SubTime();
		gt.GetTime();
		System.out.println("Hello World!");
	}
}

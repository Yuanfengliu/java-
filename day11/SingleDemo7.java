/*
�������ģʽ��


*/
/*
����ʽ��
class single
{
	private static final Single s=new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}
*/
//����ʽ
class single
{
	private static Single s=null;
	private Single(){}

	public static Single getInstance()
	{
		if (s==null)//�������жϣ�Ϊ���������ʽ��Ч�ʡ��ǲ������������̲߳��ڽ���ͬ��
		{
			synchronized(Single.class)
			{
				if(s==null)
					s=new Single();
			}
		}
		return s;
	}
}

class  SingleDemo7
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
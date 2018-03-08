/*֮ǰ������һ�ַ������������ȳ�ʼ�����󣻳�Ϊ������ʽ��

single��һ�����ڴ棬���Ѿ��������˶��󡣣�����һ���ö���ʽ��
class single
{
	private static single s=new single();
	private single(){}
	public static single getInstance()
	{
		return s;
	}
}
*/
//�ڶ���д���������Ƿ���������ʱ���ų�ʼ����Ҳ�����������ʱ���ء���Ϊ������ʽ����
//single���ڴ棬����û�д���ֻ�е���getInstance����ʱ���Ž�������
class single
{
	private static single s=null;
	private single(){}
	public static single getInstance()//�������ַ������ܻ�����ɼ���synchronized�����Ǽ�������˼��
	{										//�������ּ�����Ч�ʾͱ����ˣ��Ľ��ķ����ڱ������
		if (s==null)
		{
			s=new single();
		}
		return s;
	}
}
//��סԭ�򣺶��嵥��������ʹ�ö���ʽ��
class singleDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		single ss=single.getInstance();
	}
}

/*����ʽ�ĸĽ���������ʹ�Ľ��ˣ����Ǵ�����࣬������ʹ�ö���ʽ�ģ�
class single
{
	private static single s=null;
	private single(){}
	public static single getInstance()
	{
		if (s==null)
		{
			synchronized(single.class)
			{
				if(s==null)
					s=new single();
			}			
		}
		return s;
	}
}


*/
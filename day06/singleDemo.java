/*
���ģʽ�����ĳһ����������֮��Ч�ķ�����
Java��23�����ģʽ��
�������ģʽ�����һ�������ڴ�ֻ����һ������

��Ҫ��֤����Ψһ��
1��Ϊ�˱�������������ཨ����������Ƚ�ֹ�����������ö���
2����Ϊ��������������Է��ʵ��������ֻ���ڱ����У��Զ���һ������
3��Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ

����������ô�ô��������أ�
1�������캯��˽�л���
2�������д���һ���������
3���ṩһ���������Ի�ȡ���ö���


�����������ô����������ô������
����Ҫ��������Ķ���֤���ڴ���Ψһʱ�����������������ɡ�
*/
class single
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	private single(){}
	private static single s =new single();
	public static single getInstance()
	{
		return s;
	}
}
class singleDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//single ss=single.getInstance();//ssָ����ڴ�Ķ���new single();��Ϊ���Ƿ���ֵs��ֵ������
		//single ssss=single.getInstance();������һ�������ssss����ָ��new single() ͬssһ����ֻ��һ������֤�˶����Ψһ�ԡ�

//		single s1=new single();
//		single s2=new single();
//		s1.setNum(30);
//		System.out.println(s2.getNum());
		//����ǰ�����еĽ������ȥ��31�е�private�������޷����ʣ�
		//���Ϊ0
	}
}
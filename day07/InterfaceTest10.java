abstract class student//�������ܶ��������У���չ�����ڽӿ���
{
	abstract void study();
	void sleep()
	{
		System.out.println("sleep");
	}
}
interface smoking//��չһ��ʵ�֣��������̣����˲����̡���Ҫ�ľ�ʵ����һ���ӿ�
{
	void smoking();
}
class zhangsan extends student implements smoking//zhangsan�����̣������ʵ��smoking�ӿ�
{
	void study(){}
	public void smoking(){};
}
class lisi extends student
{
	void study(){}
}
class  InterfaceTest10
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

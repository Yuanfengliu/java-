/*
�ӿڣ�������⣬������Ϊ��һ������ĳ�����  
���������еķ������ǳ���ģ���ô�������ͨ���ӿڵ���ʽ����ʾ��
class ���ڶ�����  
interface ���ڶ���ӿ�  

�ӿڶ���ʱ����ʽ�ص㣺  
1. �ӿ��г������壺���������󷽷���
2. �ӿ��еĳ�Ա���й̶������η���
   ������public static final
   ������public abstract  
��ס���ӿ��еĳ�Ա����public�� ;�ڽӿ���ӿ�֮����ڶ�̳У�������ǵ��̳С�

�ӿ�:�ǲ����Դ�������ģ���Ϊ�г��󷽷���
��Ҫ������ʵ�֣�����Խӿ��еĳ��󷽷�ȫ�����Ǻ�����ſ���ʵ������
����������һ��������

�ӿڿ��Ա����ʵ�֣�Ҳ�ǶԶ�̳в�֧�ֵ�ת����ʽ��JAVA֧�ֶ�ʵ�֡�

�ӿڵ��ص�
1. �ӿ��Ƕ��Ⱪ¶�Ĺ���
2. �ӿ��ǳ���ĳ�����չ
3. �ӿڿ���������ʵ��
4. ����ӿ�֮����ʵ�ֹ�ϵ����������Լ̳�һ�����ͬʱʵ�ֶ���ӿ�
5. �ӿ���ӿ�֮������м̳й�ϵ  
*/

interface Inter
{
	public static final int num=3;
	public abstract void show();
}
interface InterA
{
	public abstract void show();
}
class Demo
{
	public void function(){}
}
class Test extends Demo implements Inter,InterA//�̳�һ�����ͬʱ������ʵ�ֶ���ӿ�
{
	public void show(){}
}

interface A
{
	void menthonA();
}
interface B extends A//ʵ�ָ��ӿ�֮���Ǽ̳й�ϵ
{
	void menthonB();
}
interface C extends B
{
	void menthonC();
}
class D implements C
{
	public void menthonA(){}
	public void menthonB(){}
	public void menthonC(){}
}
class  InterfaceDemo9
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println(t.num);
		System.out.println(Test.num);
		System.out.println(Inter.num);
		System.out.println("Hello World!");
	}
}

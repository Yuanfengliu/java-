/*
�Ӹ�����ֺ����Ա���ص�:
���Ա��
1.����
2.����
3.���캯��

�Ӹ����еı������ص㣺
��������г��ַ�˽�е�ͬ����Ա����ʱ��
����Ҫ���ʱ����еı�������this
����Ҫ���ʸ����е�ͬ����������super��

super��ʹ�ú�this��ʹ�ü���һ�¡�
this�������Ǳ����������á�
super�������Ǹ����������á�
*/

class Fu
{
	int num=4;
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum(int num)
	{
		return this.num;
	}
}
class Zi extends Fu
{
	int num=5;
	void show()
	{
		System.out.println(super.num);
	}
}

class  ExtendsDemo2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Zi z=new Zi();
		z.show();//�����4�����û��super�������5
		//System.out.println(z.num1+"......"+z.num2);
	}
}
/*
��̬��static
�÷�����һ�����η����������γ�Ա����Ա��������Ա��������
����Ա����̬���κ󣬾Ͷ���һ�����÷�ʽ�����˿��Ա���������⣬
������ֱ�ӱ��������á�����.��̬��Ա��

static�ص㣺
1��������ļ��ض����ء�
	Ҳ����˵����̬�����������ʧ����ʧ��˵�����������������
2�������ڵĶ������
��ȷһ�㣺��̬�����ȴ��ڵģ������Ǻ���ڵġ�

3�������ж���������
4������ֱ�ӱ����������á�

ʵ�������������������
1�����λ��
	�����������ļ��ض������ڷ������С�
	ʵ���������Ŷ���Ľ����������ڶ��ڴ��С�
2���������ڣ�
	���������������������������ʧ����ʧ��
	ʵ�����������������Ŷ������ʧ����ʧ��
3���������Ǿ�̬�ġ�

��̬��ʹ��ע�����
1����̬����ֻ�ܷ��ʾ�̬��Ա��
	�Ǿ�̬�������Է��ʾ�̬��Ա��Ҳ���Է��ʷǾ�̬��
2����̬�����в����Զ���this��super�ؼ��֡�
	��Ϊ��̬�����ڶ�����ڣ����Ծ�̬�����в����Գ���this

��̬�����б�
�����Զ���Ĺ������ݽ��е����ռ�Ĵ洢����ʡ�ռ䡣û�б�Ҫÿһ�������ж��洢һ�ݡ�
	����ֱ�ӱ��������á�
�׶ˣ��������ڹ���
		���ʳ��־����ԡ�����̬��ã�ֻ�ܷ��ʾ�̬����
*/

class Person
{
	String name;//��Ա������ʵ������
	static String country="CN";//��̬�ĳ�Ա�����������.�����ڣ�Ҳ���Ե��á�
	public static void show()
	{
		System.out.println("::"+country);
	}
}

class  StaticDemo
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		//Person p=new Person();
		//p.name="zhangsan";
		//p.show();

		//System.out.println(p.country);//�����ֵ��÷�ʽһ��
		System.out.println(Person.country);//�����ֵ��÷�ʽһ��
		Person.show();//ע��show�����У������зǾ�̬����name����Ϊ�޷��Ӿ�̬�����÷Ǿ�̬����
							//������ʱ������û�У���ô���þ�̬����
	}
}
/*
final:���գ���Ϊһ�����η�
1. ���������࣬����������
2. ��final���ε�������಻���Ա��̳�,Ϊ�˱��� ���̳У������ิд����.
3. ��final���εķ��������Ա���д
4. ��final���εı�����һ������ֻ�ܸ�ֵһ�Σ��ȿ������ξֲ�������Ҳ�������γ�Ա������
		����������ʱ��һЩ���ݵĳ���ֵ�ǹ̶��ģ���ô��ʱΪ����ǿ�Ķ��ԣ�������ֵ������֣�
	�������Ķ��������ֵ����Ҫ�ı䣬���ԼӸ�final���Ρ���Ϊ��������������д�淶������ĸ��
	��д������ɶ��������ɣ����ʼ�ͨ��_���ӡ�
5. �ڲ��ඨ�������еľֲ�λ��ʱ��ֻ�ܷ��ʸþֲ���final���εľֲ�������
*/
class Demo
{
	final int x=3;
	public static final double PI=3.14;
	final void show1()
	{}
	void show2()
	{
		final int y=4;
		System.out.println("---");
	}
}
class SubDemo extends Demo
{
	void show2(){}//���ﲻ��show1���������Ϊ������final
}
class FinalDemo5 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

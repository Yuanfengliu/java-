/*
�����ࣺ�����͵��ࡣ  
ʲôʱ���巺���ࣿ
������Ҫ�����������������Ͳ�ȷ����ʱ��
���ڶ���Object�������չ�����ڶ��巺�������չ��


�����ඨ��ķ��ͣ�������������Ч�����������ʹ�ã�
��ô������Ķ���û��ȷҪ�����ľ������ͺ�����Ҫ���������;��Ѿ��̶��ˡ�
Ϊ���ò�ͬ�������Բ�����ͬ���ͣ��������ͻ���ȷ����
��ô���Խ����Ͷ��嵽�����ϡ�


����֮���ǣ���̬���������Է������϶���ķ��ͣ�
�����̬���������������������Ͳ�ȷ�������Խ����Ͷ����ڷ����ϡ�

���� ͨ�����Ҳ�������Ϊռλ����
���͵��޶���
�� extends E�� ���Խ���E���ͻ���E�������͡�����  
�� super E�����Խ���E���ͻ���E�ĸ����͡�����
*/
class Demo<T>
{
	public <T> void show(T t) 
	{
		System.out.println("show: "+t);
	}
	public <Q> void print(Q q) 
	{
		System.out.println("print: "+q);
	}
	public static <W> void method(W t)
	{
		System.out.println("method: "+t);
	}
}
class  GenericDemo4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Demo <String> d=new Demo<String>();
		d.show("haha");
		//d.show(4);������У�����ķ��ͷ����ͷ�����һ����������2�н�������ʱ�Ѿ��趨��String���ͣ����Գ���
		d.print(5);
		d.print("hehe");

		Demo.method("hahahaasd");

/*
		Demo d =new Demo();
		d.show("haha");
		d.show(new Integer(4));
		d.print("heihei");
*/
	}
}

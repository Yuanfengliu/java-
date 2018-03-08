/*
����
��������ʵ����
�������л������塣
*/
interface PCI
{
	public void open();
	public void close();
}
class MainBoard//����
{
	public void run()
	{
		System.out.println("MainBoard run");
	}
	public void usePCI(PCI p)//PCI p=new NetCard()//�ӿ�������ָ���Լ����������
	{
		if (p!=null)
		{
			p.open();
			p.close();
		}
	}
}
class NetCard implements PCI
{
	public void open()
	{
		System.out.println("netcard open");
	}
	public void close()
	{
		System.out.println("netcard close");
	}
}
class SoundCard implements PCI
{
	public void open()
	{
		System.out.println("SoundCard open");
	}
	public void close()
	{
		System.out.println("SoundCard close");
	}
}
class DuoTaiDemo5 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		MainBoard mb=new MainBoard();
		mb.run();
		mb.usePCI(null);
		mb.usePCI(new NetCard());
		mb.usePCI(new SoundCard());
	}
}
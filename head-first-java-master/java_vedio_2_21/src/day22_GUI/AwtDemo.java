package day22_GUI;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class AwtDemo {
	public static void main(String[] args) {
		Frame f=new Frame("My awt");
		f.setSize(500, 200);
		f.setLocation(200, 20);
		f.setLayout(new FlowLayout());
		Button b=new Button("����һ����ť");
		f.add(b);
		b.setSize(20, 50);
		
		f.addWindowListener(new WindowAdapter() 
		{
			public void windowActivated(WindowEvent e)
			{
				System.out.println("�һ���");
			}
			public void windowClosing(WindowEvent e)
			{
				System.out.println("�ҹ�");
				System.exit(0);
			}
			public void windowOpened(WindowEvent e)
			{
				System.out.println("�ұ�����");
			}
		});
		
		
		
		f.setVisible(true);
	}
}
/*class NyWin implements WindowListener
{
	//����7������,ֻ�õ��˹رյĶ���������������û���õ���
}*/

class MyWin extends WindowAdapter
{
	public void windowClosed(WindowEvent e)
	{
//		System.out.println("Window closing");
		System.exit(0);
	}
}
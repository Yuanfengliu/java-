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
		Button b=new Button("我是一个按钮");
		f.add(b);
		b.setSize(20, 50);
		
		f.addWindowListener(new WindowAdapter() 
		{
			public void windowActivated(WindowEvent e)
			{
				System.out.println("我活了");
			}
			public void windowClosing(WindowEvent e)
			{
				System.out.println("我关");
				System.exit(0);
			}
			public void windowOpened(WindowEvent e)
			{
				System.out.println("我被打开了");
			}
		});
		
		
		
		f.setVisible(true);
	}
}
/*class NyWin implements WindowListener
{
	//覆盖7个方法,只用到了关闭的动作，其他动作都没有用到。
}*/

class MyWin extends WindowAdapter
{
	public void windowClosed(WindowEvent e)
	{
//		System.out.println("Window closing");
		System.exit(0);
	}
}

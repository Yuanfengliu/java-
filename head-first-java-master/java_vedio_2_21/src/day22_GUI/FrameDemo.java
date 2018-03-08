package day22_GUI;

import java.awt.*;
import java.awt.event.*;

public class FrameDemo {
	// 定义该图形中所需的组件的引用
	private Frame f;
	private Button but;

	public FrameDemo() {

		init();
	}

	public void init() {
		f = new Frame("我的第一个图形界面");
		f.setBounds(300, 100, 500, 600);
		f.setLayout(new FlowLayout());
		but = new Button("my button");
		// 加载窗体的事件
		f.add(but);
		myEvent();

		// 将组件添加到frame中
		f.setVisible(true);
	}

	public void myEvent() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//让按钮具备退出程序的功能
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("退出，按钮");
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new FrameDemo();
	}
}

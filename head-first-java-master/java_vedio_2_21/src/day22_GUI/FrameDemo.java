package day22_GUI;

import java.awt.*;
import java.awt.event.*;

public class FrameDemo {
	// �����ͼ������������������
	private Frame f;
	private Button but;

	public FrameDemo() {

		init();
	}

	public void init() {
		f = new Frame("�ҵĵ�һ��ͼ�ν���");
		f.setBounds(300, 100, 500, 600);
		f.setLayout(new FlowLayout());
		but = new Button("my button");
		// ���ش�����¼�
		f.add(but);
		myEvent();

		// ��������ӵ�frame��
		f.setVisible(true);
	}

	public void myEvent() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//�ð�ť�߱��˳�����Ĺ���
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("�˳�����ť");
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new FrameDemo();
	}
}
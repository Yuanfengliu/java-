package day22_GUI;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class MyWindowDemo {
	private Frame f;
	private Button but;
	private TextField tf;
	private TextArea ta;
	private Dialog da;
	private Label lab;
	private Button okbut;
	
	public MyWindowDemo() {
		// TODO Auto-generated constructor stub
		init();
	}
	
	public void init()
	{
		f=new Frame("我的窗体");
		f.setBounds(300,200,600,500);
		f.setLayout(new FlowLayout());
		
		tf=new TextField(50);
		but=new Button("转到");
		ta=new TextArea(25,70);
		
		
		da=new Dialog(f,"提示信息",true);
		lab=new Label();
		okbut=new Button("确定");
		da.setBounds(300, 200, 240, 150);
		da.setLayout(new FlowLayout());
		
		da.add(lab);
		da.add(okbut);
		
		f.add(tf);
		f.add(but);
		f.add(ta);
		
		f.setVisible(true);
		
		myEvent();
	}
	
	public void myEvent()
	{
		but.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showDir();
//				ta.setText(dirPath);
//				tf.setText("");
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					showDir();
				}
			}
		});
		
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		da.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				da.setVisible(false);
			}
		});
		
		okbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				da.setVisible(false);
			}
				
		});
	}
	public void showDir()
	{
		ta.setText("");
		String dirPath=tf.getText();
		File dir=new File(dirPath);
		if(dir.exists() && dir.isDirectory())
		{
			ta.setText("");
			String[] names =dir.list();
			for(String name:names)
			{
				ta.append(name+"\r\n");
			}
		}
		else
		{
			String info="你输入的信息"+dirPath+"是错误的，请重新输入";
			lab.setText(info);
			da.setVisible(true);
		}
	}
	public static void main(String[] args) {
		new MyWindowDemo();
	}
}

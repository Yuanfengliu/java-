package day22_GUI;
import java.awt.*;
import java.awt.event.*;
public class MyMenuDemo {
	private Frame f;
	private MenuBar mb;
	private Menu m,subMenu;
	private MenuItem closeItem,subItem;
	
	public MyMenuDemo() {
		// TODO Auto-generated constructor stub
		init();
	}
	
	public void init()
	{
		f=new Frame("�˵�չʾ");
		f.setBounds(200,300,500,600);
		f.setLayout(new FlowLayout());
		
		mb=new MenuBar();
		m=new Menu("�ļ�");
		
		subMenu=new Menu("�Ӳ˵�");
		
		subItem=new MenuItem("����Ŀ");
		closeItem=new MenuItem("�˳�");
		subMenu.add(subItem);
		
		m.add(subMenu);
		m.add(closeItem);
		mb.add(m);
		f.setMenuBar(mb);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyMenuDemo();
	}
}
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
		f=new Frame("菜单展示");
		f.setBounds(200,300,500,600);
		f.setLayout(new FlowLayout());
		
		mb=new MenuBar();
		m=new Menu("文件");
		
		subMenu=new Menu("子菜单");
		
		subItem=new MenuItem("子条目");
		closeItem=new MenuItem("退出");
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

package day22_GUI;
import java.awt.*;
import java.awt.event.*;
public class MouseEventDemo {
	private Frame f;
	private Button but;
	private TextField tf;
	public MouseEventDemo() {
		// TOD|O Auto-generated constructor stub
		init();
	}
	
	public void init()
	{
		f=new Frame("���ͼ���ʱ�����");
		f.setBounds(100, 200, 500, 300);
		f.setLayout(new FlowLayout());
		but=new Button("����¼�");
		tf=new TextField(20);
		tf.setSize(100, 200);
		f.add(tf);
		f.add(but);
//		f.add(tf);
		
		f.setVisible(true);
		myEvent();
	}
	public void myEvent()
	{
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e)
			{
				int code=e.getKeyCode();
				if(!(code>=KeyEvent.VK_0 && code <=KeyEvent.VK_9))
				{
					e.consume();
					System.out.println(code+"...�ǷǷ���");
				}
			}
		});
		
		
		
		
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("action ok!");
			}
		});
		
		but.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e)
			{
				System.out.println(e.getKeyChar()+"..."+e.getKeyCode()+"..."+e.getKeyText(e.getKeyCode()));
				if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					System.out.println("ctrl+enter is run");
					System.exit(0);
				}
			}
		});
		
		but.addMouseListener(new MouseAdapter() {
			private int count=1;
			private int clickCount=1;
			public void mouseEntered(MouseEvent e)
			{
				System.out.println("����������"+count++);
			}
			public void mouseClicked(MouseEvent e)
			{
				if(e.getClickCount()==2)
					System.out.println("˫������"+clickCount++);
			}
		});
	}
	public static void main(String[] args) {
		new MouseEventDemo();
	}
}
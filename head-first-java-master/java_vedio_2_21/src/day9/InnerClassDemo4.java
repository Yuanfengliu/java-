package day9;
abstract class AbsDemo{
	abstract void show();
}
class Outer4{
	int x=3;
	/*
	 * �����ڲ��࣬��
	 
	class Inner extends AbsDemo{
		void show(){System.out.println("show:"+x);}
	}*/
	public void function(){
		AbsDemo d=new AbsDemo() {
		
		@Override
		void show() {
			// TODO Auto-generated method stub
			System.out.println("x="+x);
		}
		void abc(){System.out.println(x);}
	};
	d.show();
	}//new Inner().show()  ���滻�������ĸ����滻
	}

class InnerClassDemo4{
	public static void main(String[] args) {
		new Outer4().function();
	}
}
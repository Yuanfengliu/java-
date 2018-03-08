package day9;
abstract class AbsDemo{
	abstract void show();
}
class Outer4{
	int x=3;
	/*
	 * 匿名内部类，简化
	 
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
	}//new Inner().show()  被替换，用它的父类替换
	}

class InnerClassDemo4{
	public static void main(String[] args) {
		new Outer4().function();
	}
}
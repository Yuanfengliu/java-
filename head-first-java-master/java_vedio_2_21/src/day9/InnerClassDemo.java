package day9;
class Outer{
	int x=3;
	class Inner{//�ڲ���
		void function(){
			System.out.println("Inner :");
		}
		
	}
	void method(){
		System.out.println(x);
		Inner in=new Inner();
		in.function();}
		
	}

public class InnerClassDemo {
	public static void main(String[] args) {
//		Outer o=new Outer();
		Outer.Inner in=new Outer().new Inner();
		in.function();
	}
}

package day9;
class Outer3{
	int x=3;
	void method(final int a){
		final int y=4;
		class Inner{
			void function(){System.out.println(a);}
		}
		new Inner().function();
	}
	
}
public class InnerClassDemo3 {
	public static void main(String[] args) {
		new Outer3().method(4);
		new Outer3().method(6);
	}
}

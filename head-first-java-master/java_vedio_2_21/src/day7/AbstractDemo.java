package day7;
abstract class Student{
	abstract void study();
	void sleep(){System.out.println("ливек╞");}
}
class ChongCiStudent extends Student{
	void study(){System.out.println("chongci study");}
}
class BaseStudent extends Student{
	void study(){
		System.out.println("base study");
	}
}
class AdvStudent extends Student{
	void study(){
		System.out.println("adv study");
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		new BaseStudent().study();
		new BaseStudent().sleep();
}
}

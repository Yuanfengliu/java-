package day8;
/*������ѧ����ѧϰ��˯��
 �߼���ѧ����ѧϰ��˯��
 */
abstract class Student{
	public abstract void study();
	public void sleep(){System.out.println("����˯");}
}
class BaseStudent extends Student{
	public void study(){System.out.println("base study");}
	public void sleep(){System.out.println("����˯");}
}
class AdvStudent extends Student{
	public void study(){System.out.println("adv study");}
	
}
class DoStudent{
	public void doSome(Student stu){
		stu.study();
		stu.sleep();
	}
}
public class DuotaiDemo3 {
	public static void main(String[] args) {
		DoStudent ds=new DoStudent();
		ds.doSome(new BaseStudent());
		ds.doSome(new AdvStudent());
//		BaseStudent bs=new BaseStudent();
//		bs.study();
	}
	
}

/*
������ѧ����
	ѧϰ  ˯��
�߼���ѧ����
	ѧϰ��˯��
���Խ�������������г�ȡ��
*/
abstract class Student
{
	public abstract void study();
	public void sleep()
	{
		System.out.println("����˯��");
	}
}
class DoStudent
{
	public void dosome(Student stu)
	{
		stu.study();
		stu.sleep();
	}
}

class BaseStudent extends Student
{
	public void study()
	{
		System.out.println("base study");
	}
	public void sleep()
	{
		System.out.println("����˯");
	}
}
class AdvStudent extends Student
{
	public void study()
	{
		System.out.println("adv study");
	}
}

class  DuoTaiDemo3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		DoStudent ds=new DoStudent();
		ds.dosome(new BaseStudent());
		ds.dosome(new AdvStudent());

//		BaseStudent bs=new BaseStudent();
//		bs.study();
//		bs.sleep();
//		AdvStudent as=new AdvStudent();
//		as.study();
//		as.sleep();
	}
}

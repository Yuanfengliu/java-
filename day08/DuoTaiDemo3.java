/*
基础班学生：
	学习  睡觉
高级班学生：
	学习，睡觉
可以将这两类事项进行抽取。
*/
abstract class Student
{
	public abstract void study();
	public void sleep()
	{
		System.out.println("躺着睡觉");
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
		System.out.println("坐着睡");
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

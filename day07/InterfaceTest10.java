abstract class student//基本功能定义在类中，扩展内容在接口中
{
	abstract void study();
	void sleep()
	{
		System.out.println("sleep");
	}
}
interface smoking//扩展一个实现，有人吸烟，有人不吸烟。需要的就实现这一个接口
{
	void smoking();
}
class zhangsan extends student implements smoking//zhangsan会吸烟，程序就实现smoking接口
{
	void study(){}
	public void smoking(){};
}
class lisi extends student
{
	void study(){}
}
class  InterfaceTest10
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

//封装：是指隐藏对象的属性和实现细节。仅对外提供公共访问方式。
//好处：1：将变换隔离。2：便于使用。3：提高重用性。4：提高安全性
//封装原则：1：将不需要对外提供的内容都隐藏起来。2：把属性都隐藏，提供公共方法对其访问。

/*
private:私有，权限修饰符：用于修饰类中的成员（成员变量，成员函数）。
私有只在本类中有效。

将age私有化以后，类以外即使建立了对象也不能直接访问。
但是人应该有年龄，就需要在Person类中提供对应访问age的方式。

注意：私有仅仅是封装的表现形式

之所以对外提供访问方式，就因为可以在访问方式中加入逻辑判断等语句。
对访问的数据进行操作，提供代码健壮性。


*/
class Person
{
	private int age;
	public void setAge(int a)
	{
		if (a>0 && a<130)
		{
			age=a;
			speak();
		}
		else 
			System.out.println("非法你年龄");
		
	}
	public int getAge()//得到年龄 
	{
		return age;
	}
	void speak()
	{
		System.out.println("sge="+age);
	}
}
class duiXiang2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Person p=new Person();
		//p.age=10;//因为Person类中，age已经私有化，不能访问
		
		p.setAge(24);
		p.speak();
		
	}
}

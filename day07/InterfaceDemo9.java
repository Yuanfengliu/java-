/*
接口：初期理解，可以认为是一个特殊的抽象类  
当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示。
class 用于定义类  
interface 用于定义接口  

接口定义时，格式特点：  
1. 接口中常见定义：常量，抽象方法。
2. 接口中的成员都有固定的修饰符。
   常量：public static final
   方法：public abstract  
记住：接口中的成员都是public的 ;在接口与接口之间存在多继承，而类间是单继承。

接口:是不可以创建对象的，因为有抽象方法。
需要被子类实现，子类对接口中的抽象方法全部覆盖后，子类才可以实例化。
否则子类是一个抽象类

接口可以被类多实现，也是对多继承不支持的转换形式。JAVA支持多实现。

接口的特点
1. 接口是对外暴露的规则
2. 接口是程序的程序扩展
3. 接口可以用来多实现
4. 类与接口之间是实现关系，而且类可以继承一个类的同时实现多个接口
5. 接口与接口之间可以有继承关系  
*/

interface Inter
{
	public static final int num=3;
	public abstract void show();
}
interface InterA
{
	public abstract void show();
}
class Demo
{
	public void function(){}
}
class Test extends Demo implements Inter,InterA//继承一个类的同时，还能实现多个接口
{
	public void show(){}
}

interface A
{
	void menthonA();
}
interface B extends A//实现各接口之间是继承关系
{
	void menthonB();
}
interface C extends B
{
	void menthonC();
}
class D implements C
{
	public void menthonA(){}
	public void menthonB(){}
	public void menthonC(){}
}
class  InterfaceDemo9
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println(t.num);
		System.out.println(Test.num);
		System.out.println(Inter.num);
		System.out.println("Hello World!");
	}
}

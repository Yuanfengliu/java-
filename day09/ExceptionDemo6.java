/*
异常：就是程序在运行时出现不正常的情况。  
异常的由来：问题也是现实生活中一个具体的事物，也可以通过java的类的形式进行描述。
			并封装成对象。其实就是java对不正常情况进行描述后的对象体现.

对于问题的划分：两种：一种是严重的问题，一种是不严重的问题

对于严重的：java通过Error类进行描述。（对于Error，一般不编写针对性的代码进行处理）
						（类型转换异常，数组角标越界异常，空指针异常等等，意思就是没救的，系统不会提示具体代码错误）
对于非严重的：java通过Exception类进行描述。（可以使用针对性的处理方式进行处理，如33行，1改成0，出现错误时的提示 ）

无论Error或者Exception都具有一些共性内容。
比如：不正常情况的信息，引发原因等。
throwable（有以下两种）
	|--Error
	|--Exception

*/
class Demo
{
	int div(int a,int b)
	{
		return a/b;
	}

}
class ExceptionDemo6 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo d=new Demo();
		int x=d.div(4,1);//当1改成0时，就会出现错误，就是异常，此时结果连‘over正常’也不会显示。即程序停止
		System.out.println("x="+x);

		System.out.println("over正常");
	}
}

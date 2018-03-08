/*
基本数据类型对象包装类.

基本数据类型		引用数据类型（类）
byte				Byte
short				short
int					Integer  
long				Long  
boolean				Boolean  
float				Float  
double				Double  
char				Character   

基本数据类型对象包装类的最常见作用：就是用于基本数据类型和字符串类型之间做转换。  

基本数据类型转成字符串:  
	基本数据类型+“” 或者 基本数据类型.toString(基本数据类型值)  
	如：Integer.toString(34);//将34整数变成“34”;

字符串转基本类型:
	基本数据类型包装类 a=Xxx.parseXxx(String)
		如： int a=Int.parseInt(String);
			double b=Double.parseDouble(String);

十进制转换成其他进制
	toBinaryString()
	toHexString()
其他进制转换成十进制
	parseInt(String,radix);//radix代表的是什么进制
*/

class IntegerDemo4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//将一个字符串转换成整数
		int num=Integer.parseInt("123");
		System.out.println("num"+(num+4));
		System.out.println(Integer.toBinaryString(-6));//转换成二进制
		System.out.println(Integer.toHexString(60));//转换成16进制


		System.out.println("----------------------------");

		Integer a=127;
		Integer b=127;
		System.out.println("a==b?    "+(a==b));//结果是true。因为a和b指向了同一个Integer对象
							//因为当数值在byte范围内（-128到127），对于新的特性，如果该数值已经存在，则不会在开辟新的空间。

		Integer m=128;
		Integer n=128;
		System.out.println("m==n?    "+(m==n));
	}
}

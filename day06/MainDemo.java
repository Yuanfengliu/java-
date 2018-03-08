/*
public static void main(String[] args)
主函数：是一个特殊的函数，作为程序的入口，可以被jvm调用。

主函数定义：
public：代表着该函数访问权限是最大的。
static：代表着主函数随着类的加载就已经存在了。
void：主函数没有具体的返回值。
main：不是关键字，但是是一个特殊的单词，可以被jvm识别。
(String[] args)：函数的参数，参数类型是一个数组，该数组中的元素是字符串，字符串类型的数组。

主函数是固定格式的：jvm识别。

jvm调用主函数时，传入的是new string[0]
*/
////////////////////////开发过程中不要写两个主函数，这里自己了解就行//////////////////////////
class MainDemo 
{
	public static void main(String[] args) //虚拟机需要的主函数，括号内一定是字符串类型的数组。
	{
		System.out.println("Hello World!");
		System.out.println(args.length);
		//System.out.println(args[0]);//有数组，但是是空的所以执行后没有结果
										//除非在用dos命令时：Java MainDemo haha hehe heihei   （加入元素，并以空格间隔）
										//这样结果就是haha，因为此时已经存进去三个元素
		String[] arr={"yuan","feng","aa","gsg","22"};
		MainTest.main(arr);
	}
	
	
	/*public static void main(String[] args,int x) 
	{
		System.out.println("Hello World!");
	}
	public static void main(int x) 
	{
		System.out.println("Hello World!");
	}
	*/
}
class  MainTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		for (int x=0;x<args.length ;x++ )
		{
			System.out.println(args[x]);
		}
	}
}

package day6;
/*主函数：是一个特殊的函数。作为程序的入口，可以被jvm调用。
主函数的定义：
1. public：代表着该函数的访问权限是最大的
2. static：代表着主函数随着类的加载就已经存在了
3. void：主函数没有具体的返回值
4. main：不是关键字，但是是一个特殊的单词，可以被jvm识别。
5. (String[] args)： 函数的参数，参数类型是一个数组，该数组中的元素是字符串。字符串的类型是数组。
主函数的格式是固定的，jvm识别
jvm在调用主函数时，传入的是new String[0]*/
public class MainDemo {
	public static void main(String[] args) {//new String[]
		System.out.println(args[0]);
	}
//	public static void main(int x){}
}

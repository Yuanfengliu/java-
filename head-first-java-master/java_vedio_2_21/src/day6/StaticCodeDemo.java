package day6;
/*静态代码块。
格式：
static{
	静态代码块中的执行语句
}
特点：随着类的加载而执行，只执行一次。并优先于主函数执行
用于给类进行初始化*/

class StaticCode{
	static{
		System.out.println("a");
	}
	public static void show(){
		System.out.println("show run");
	}
}
public class StaticCodeDemo {
	static {
		System.out.println("b");
	}
	public static void main(String[] args){
		/*new StaticCode();
		new StaticCode();//不会再次被加载
		System.out.println("over");*/
//		StaticCode.show();
		StaticCode staticCode=null;
	}
	
	static{
		System.out.println("c");
	}
}

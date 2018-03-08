package day7;
/*
 需求：获取一段程序运行的时间。
 原理：获取程序开始和结束的时间并相减
 
获取时间：System.currentTimeMillis()
当代码优化后，就可以解决这类问题。
这种方式，排版方法设计模式*/
abstract class GetTime{
	public final void getTime(){
		long start=System.currentTimeMillis();
		runCode();
		long end=System.currentTimeMillis();
		System.out.println("毫秒："+(end-start));
	}
	public abstract void  runCode();
	}

class SubTime extends GetTime{
	public void runCode(){
		for (int x=0;x<2000;x++){System.out.println(x);}
	}
}
public class TemplateDemo {
	public static void main(String[] args) {
		SubTime gt=new SubTime();
		gt.getTime();
	}
}

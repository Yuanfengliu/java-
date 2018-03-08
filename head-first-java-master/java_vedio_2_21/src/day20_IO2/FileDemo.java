import java.io.*;
class FileDemo
{
	public static void main(String[] args)throws IOException
	{
		method_5();
	}
	
	public static void method_5()
	{
		File f1=new File("c:\\Test.java");
		File f2=new File("c:\\hahaha.java");
		sop("reNameTo:"+f1.renameTo(f2));
	}
	
	public static void method_4()
	{
		File f=new File("file.txt");
		sop("path:"+f.getPath());
		sop("abspath:"+f.getAbsolutePath());
	}
	
	public static void method_3()throws IOException
	{
		File f=new File("file.txt");
		f.mkdir();
		sop("dir:"+f.isDirectory());
		sop("file:"+f.isFile());
		sop(f.isAbsolute());
	}
	
	public static void method_2()
	{
		File f=new File("file.txt");
		//sop("canexcute:"+f.canExecute());
		//sop("exit:"+f.exists());
		//创建文件夹
		File dir=new File("abc");
		sop("mkdir:"+dir.mkdir());
	}
	public static void method_1() throws IOException
	{
		File f=new File("file.txt");
		//sop("create:"+f.createNewFile());
		sop("delete:"+f.delete());
	}
	//创建File对象
	public static void consMethod()
	{
		//将a.txt封装成file对象，可以将已有的和未出现的文件和文件夹封装成对象
		File f=new File("a.txt");
		
		File f2=new File("C:\\abc","b.txt");
		
		File d=new File("C:\\abc");
		File f3=new File(d,"c.txt");
		
		File f4=new File("C:\\");
		sop("f1:"+f+" f2:"+f2+" f3:"+f3);
	}
	public static void sop(Object o)
	{
		System.out.println(o);
	}
}
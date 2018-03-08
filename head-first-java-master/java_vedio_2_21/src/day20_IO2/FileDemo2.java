import java.io.*;
class FileDemo2
{
	public static void main(String[] args)
	{
		
		File dir =new File("c:\\");
		File[] files=dir.listFiles();
		for(File f:files)
			sop(f.getName()+"::  "+f.length());
		
	}
	
	public static void filenameFilterDemo()
	{
		File dir=new File("E:\\Github\\head-first-java\\test_12.16\\src");
		String[] arr=dir.list(new FilenameFilter()
		{
			public boolean accept(File dir,String name)
			{
				//sop("dir:"+dir+"  ...name:"+name);
				
				return name.endsWith(".java");
			}
		});
		sop("length:"+arr.length);
		for(String a:arr)
			sop(a);
	}
	
	public static void listDemo()
	{
		File f=new File("c:\\");
		String[] names=f.list();
		for(String name:names)
			sop(name);
	}
	
	public static void listRootDemo()
	{
		File[] files=File.listRoots();
		for(File f:files)
			sop(f);
	}
	
	
	public static void sop(Object o)
	{
		System.out.println(o);
	}
}
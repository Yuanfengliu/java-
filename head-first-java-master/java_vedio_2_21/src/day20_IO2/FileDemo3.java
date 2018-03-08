import java.io.*;
class FileDemo3
{
	public static void main(String[] args)
	{
		File dir=new File("E:\\Github\\head-first-java\\test_12.16\\src");
		showDir(dir,0);
	}
	public static String getLevel(int level)
	{
		
		//sop(getLevel()+dir.getName());
		StringBuilder sb=new StringBuilder();

		for(int x=0;x<level;x++)
		{
			sb.append("---");
		}
		return sb.toString();
	}
	public static void showDir(File dir,int level)
	{
		sop(getLevel(level)+dir.getName());
		level++;
		File[] files=dir.listFiles();
		for(int x=0;x<files.length;x++)
		{
			if(files[x].isDirectory())
				showDir(files[x],level);
			else
				sop(getLevel(level)+files[x]);
		}
	}
	
	
	public static void sop(Object o)
	{
		System.out.println(o);
	}
}

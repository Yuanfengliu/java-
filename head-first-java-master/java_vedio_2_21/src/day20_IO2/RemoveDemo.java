import java.io.*;
class RemoveDir
{
	public static void main(String[] args)
	{
		removeDir(new File("F:\\yxdown"));
	}
	
	public static void removeDir(File dir)
	{
		File[] files=dir.listFiles();
		for(int x=0;x<files.length;x++)
		{
			if(files[x].isDirectory())
				removeDir(files[x]);
			else
				sop("delete:"+files[x].getName()+":: "+files[x].delete());
		}
		sop(dir+"::dir:"+dir.delete());
	}
	
	
	
	public static void sop(Object o)
	{
		System.out.println(o);
	}
}
import java.io.*;
import java.util.*;
class SplitFileDemo
{
	public static void main(String[] args)throws IOException
	{
		merge();
	}
	public static void splitFile() throws IOException
	{
		FileInputStream fis=new FileInputStream("c:\\2.jpg");
		FileOutputStream fos=null;
		byte[] buf=new byte[1024];
		int len=0;
		int count=1;
		while((len=fis.read(buf))!=-1)
		{
			fos=new FileOutputStream("c:\\splitjava\\"+(count++)+".part");
			fos.write(buf,0,len);
			fos.close();
			
		}
		fis.close();
	}
	public static void merge()throws IOException
	{
		ArrayList<FileInputStream> al=new ArrayList<FileInputStream>();
		for(int x=1;x<=39;x++)
		{
			al.add(new FileInputStream("c:\\splitjava\\"+x+".part"));
		}
		Iterator<FileInputStream> it=al.iterator();
		Enumeration<FileInputStream> en=new Enumeration<FileInputStream>()
		{
			public boolean hasMoreElements()
			{
				return it.hasNext();
			}
			public FileInputStream nextElement()
			{
				return it.next();
			}
		};
		
		SequenceInputStream sis=new SequenceInputStream(en);
		FileOutputStream fos=new FileOutputStream("c:\\splitjava\\0.jpg");
		byte[] buf=new byte[1024];
		int len=0;
		while((len=sis.read(buf))!=-1)
		{
			fos.write(buf,0,len);
		}
		fos.close();
		sis.close();
	}
}
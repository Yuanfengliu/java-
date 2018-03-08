import java.io.*;
public class CopyMp3
{
    public static void main(String[] args)throws IOException
    {
		long start=System.currentTimeMillis();
		copy_1();
		long end=System.currentTimeMillis();
        System.out.println(end-start);
		
    }
    public static void copy_1()throws IOException
    {
    
		BufferedInputStream bufis=new BufferedInputStream(new FileInputStream("c:\\1.mp3"));
		BufferedOutputStream bufos=new BufferedOutputStream(new FileOutputStream("c:\\2.mp3"));
		
		int by=0;
		while((by=bufis.read())!=-1)
		{
			bufos.write(by);
		}
		bufos.close();
		bufis.close();
		

    }
}

import java.io.*;

class MyBufferedInput
{
	private InputStream in;
	private byte[] buf=new byte[1024*4];
	private int pos=0,count=0;

	MyBufferedInput(InputStream in)
	{
		this.in=in;
	}
	public int myRead()throws IOException
	{
		if(count==0)
		{
		count=in.read(buf);
		pos=0;
		byte b=buf[pos];
		count--;
		pos++;
		return b&255;
		}
		else if(count>0)
		{
			byte b=buf[pos];
			count--;
			pos++;
			return b&0xff;
		}
		return -1;
	}
	public void myClose() throws IOException
	{
		in.close();
	}
}
public class MyBufferedInputStream
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

		MyBufferedInput bufis=new MyBufferedInput(new FileInputStream("c:\\1.mp3"));
		BufferedOutputStream bufos=new BufferedOutputStream(new FileOutputStream("c:\\2.mp3"));

		int by=0;
		System.out.println("the first"+bufis.myRead());
		while((by=bufis.myRead())!=-1)
		{
			bufos.write(by);
		}
		bufos.close();
		bufis.myClose();


    }
}

import java.io.*;

class Read implements Runnable
{
	private PipedInputStream in;
	Read(PipedInputStream in)
	{
		this.in=in;
	}
	public void run()
	{
		try
		{
			byte[] buf=new byte[1024];
			int len=in.read(buf);
			String s=new String(buf,0,len);
			System.out.println(s);
			in.close();
		}
		catch(IOException e)
		{
			throw new RuntimeException("管道读取流失败");
		}
	}
}
class Write implements Runnable
{
	private PipedOutputStream out;
	Write(PipedOutputStream out)
	{
		this.out=out;
	}
	public void run()
	{
		try
		{
			out.write("管道来了".getBytes());
			out.close();
		}
		catch(IOException e)
		{
			throw new RuntimeException("管道输出流失败");
		}
	}
}
class PipedSreamDemo
{
	public static void main(String[] args) throws IOException
	{
		PipedInputStream in =new PipedInputStream();
		PipedOutputStream out=new PipedOutputStream();
		in.connect(out);
		Read r=new Read(in);
		Write w=new Write(out);
		
		new Thread(r).start();
		new Thread(w).start();
		
	}
}
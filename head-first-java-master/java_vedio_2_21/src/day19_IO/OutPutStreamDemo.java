//package day19_IO;
import java.io.*;
public class OutPutStreamDemo {
	public static void main(String[] args) throws IOException{
		readFile3();
	}
	public static void readFile2()throws IOException
	{
		FileInputStream fis=new FileInputStream("fos.txt");
		byte[] buf=new byte[fis.available()];//定义一个刚刚好的缓冲区
		int len=0;
		while((len=fis.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,len));
		}
		fis.close();
	}
	public static void readFile3()throws IOException
	{
		FileInputStream fis=new FileInputStream("fos.txt");
		int num=fis.available();
		System.out.println(num);
		fis.close();
	}
	public static void writeFile() throws IOException
	{
		FileOutputStream fos=new FileOutputStream("fos.txt");
		
		fos.write("abcde".getBytes());
		fos.close();
	}
	public static void readFile()throws IOException
	{
		FileInputStream fis=new FileInputStream("fos.txt");
		int ch=0;
		while((ch=fis.read())!=-1)
		{
			System.out.println((char)ch);
		}
		fis.close();
	}
}

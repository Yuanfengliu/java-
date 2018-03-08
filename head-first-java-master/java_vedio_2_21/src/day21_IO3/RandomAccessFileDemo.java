import java.io.*;
class RandomAccessFileDemo
{
	public static void main(String[] args)throws IOException
	{
		writeFile2();
		//readFile();
		//System.out.println(Integer.toBinaryString(258));
	}
	public static void writeFile() throws IOException
	{
		RandomAccessFile raf=new RandomAccessFile("a.txt","rw");
		raf.write("Lisi".getBytes());
		//raf.write("\n".getBytes());
		raf.writeInt(97);
		raf.write("王五".getBytes());
		raf.writeInt(98);
		//raf.writeInt(258);
		raf.close();
	}
	public static void writeFile2() throws IOException
	{
		RandomAccessFile raf =new RandomAccessFile("a.txt","rw");
		raf.seek(8*3);
		raf.write("周期".getBytes());
		raf.writeInt(103);
		raf.close();
	}
	public static void readFile() throws IOException
	{
		RandomAccessFile raf=new RandomAccessFile("a.txt","r");
		//raf.write("haha".getBytes());
		//调整对象中的指针
		raf.seek(8);
		byte[] buf=new byte[4];
		raf.read(buf);
		String name=new String(buf);
		int age=raf.readInt();
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		raf.close();
	}
}
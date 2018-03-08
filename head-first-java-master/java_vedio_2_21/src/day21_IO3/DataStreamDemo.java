import java.io.*;
//可以用于操作基本数据类型
class DataStreamDemo
{
	public static void main(String[] args)throws IOException
	{
		writeData();
		readData();
	}
	public static void writeData() throws IOException
	{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("data.txt"));
		dos.writeInt(234);
		dos.writeBoolean(true);
		dos.writeDouble(98232.2323);
	}
	public static void readData() throws IOException
	{
		DataInputStream dis=new DataInputStream(new FileInputStream("data.txt"));
		int num=dis.readInt();
		boolean b=dis.readBoolean();
		double d=dis.readDouble();
		System.out.println(num+"  "+b+" "+d);
	}
}
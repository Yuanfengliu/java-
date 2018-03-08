import java.io.*;
class EncodeDemo
{
	public static void main(String[] args) throws Exception
	{
		String s="ÁªÍ¨";
		byte[] by=s.getBytes("GBK");
		for(byte b:by)
		{
			System.out.println(Integer.toBinaryString(b&255));
		}
		System.out.println("Hello world");
	}
}
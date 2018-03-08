package day19_IO;

import java.io.*;

import javax.print.attribute.standard.RequestingUserName;

//������BufferedReader�������з���readLine��ԭ���󣬿����Զ���һ�����а���һ�����ܺ�readLineһ���ķ�����
class MyBufferedReader {
	private FileReader r;

	MyBufferedReader(FileReader r) {
		this.r = r;
	}

	// ����һ����ʱ������ԭStringReader��װ�����ַ����顣
	// Ϊ��
	public String myReadLine() throws IOException
	{
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while((ch=r.read())!=-1)
		{
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			else
				sb.append((char)ch);
		}
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	public void myClose() throws IOException
	{
		r.close();
	}
}

public class MyBufferedReaderDemo {
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("buf.txt");
		MyBufferedReader mbfr=new MyBufferedReader(fr);
		String ch=null;
		while((ch=mbfr.myReadLine())!=null)
		{
			System.out.println(ch);
		}
		mbfr.myClose();
	}
}
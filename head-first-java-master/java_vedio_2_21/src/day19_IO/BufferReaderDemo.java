package day19_IO;
import java.io.*;
public class BufferReaderDemo {
	public static void main(String[] args) throws IOException{
		//����һ����ȡ��������ļ������
		FileReader fr=new FileReader("buf.txt");
		//Ϊ�����Ч�ʣ����뻺�弼�������ַ���ȡ��������Ϊ���������������Ĺ��캯��
		BufferedReader bufr=new BufferedReader(fr);
//		String s1=bufr.readLine();
		String line=null;
		while((line=bufr.readLine())!=null)
			System.out.println(line);
		bufr.close();
	}
}
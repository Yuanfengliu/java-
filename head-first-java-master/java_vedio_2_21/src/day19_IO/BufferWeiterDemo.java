package day19_IO;
import java.io.*;
public class BufferWeiterDemo {
	public static void main(String[] args) throws IOException {
		//����һ���ַ�д��������
		FileWriter fw=new FileWriter("buf.txt");
		//Ϊ�� ����ַ�д����Ч�ʣ������˻��弼��,ֻҪ����Ҫ���Ч�ʵ���������Ϊ�������ݸ��������Ĺ��캯�����ɡ�
		BufferedWriter bufw=new BufferedWriter(fw);
		for(int x=0;x<10;x++)
		{
			bufw.write("abcd"+x);
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
		/*bufw.write("abcde");
		bufw.newLine();
		bufw.write("abcde");
		bufw.flush();
		bufw.close();*/
	}
}

package day19_IO;
import java.io.*;
public class BufferWeiterDemo {
	public static void main(String[] args) throws IOException {
		//创建一个字符写入流对象
		FileWriter fw=new FileWriter("buf.txt");
		//为了 提高字符写入流效率，加入了缓冲技术,只要将需要提高效率的流对象作为参数传递给缓冲区的构造函数即可。
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

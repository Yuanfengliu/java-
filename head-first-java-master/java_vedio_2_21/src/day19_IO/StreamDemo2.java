//需求:想把键盘录入的数据存储到个文件中
import java.io.*;
public class StreamDemo2
{
	public static void main(String[] args) throws IOException
	{
		//获取键盘录入对象
		//InputStream in=System.in;
		
		//InputStreamReader isr=new InputStreamReader(in);
		//为了提高效率。将字符串缓冲区技术高效操作
		
		
		//BufferedReader bufr=new BufferedReader(isr);
		BufferedReader bufr=new BufferedReader(new InputStreamReader(new FileInputStream("out.txt")));
		//OutputStream out=System.out;
		//OutputStreamWriter osw=new OutputStreamWriter(out);
		//BufferedWriter bufw=new BufferedWriter(osw);
		BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			//System.out.println(line.toUpperCase());
			bufw.write(line.toUpperCase());
			bufw.newLine(); 
			bufw.flush();
		}
		bufr.close();
	}
}
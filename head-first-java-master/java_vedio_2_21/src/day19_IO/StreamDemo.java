import java.io.*;
public class StreamDemo
{
	public static void main(String[] args) throws IOException
	{
		//��ȡ����¼�����
		//InputStream in=System.in;
		
		//InputStreamReader isr=new InputStreamReader(in);
		//Ϊ�����Ч�ʡ����ַ���������������Ч����
		
		
		//BufferedReader bufr=new BufferedReader(isr);
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
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
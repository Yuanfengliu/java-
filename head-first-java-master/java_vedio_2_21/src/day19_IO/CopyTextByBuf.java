package day19_IO;
import java.io.*;

import javax.management.RuntimeErrorException;
public class CopyTextByBuf {
	public static void main(String[] args) throws IOException{
		BufferedReader bfr=null;
		BufferedWriter bfw=null;
		
		try
		{
			bfr=new BufferedReader(new FileReader("BufferWeiterDemo.java"));
			bfw=new BufferedWriter(new FileWriter("BufWriter_Copy.txt"));
			String line=null;
			
			while((line=bfr.readLine())!=null)
			{
				bfw.write(line);
				bfw.newLine();
				bfw.flush();
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException("��д����");
		}
		finally {
			try
			{
				if(bfr!=null)
					bfr.close();
			}
			catch(IOException e)
			{
				throw new RuntimeException("��ȡ�ر�ʧ��");
			}
			
			try
			{
				if(bfw!=null)
					bfw.close();
			}
			catch(IOException e)
			{
				throw new RuntimeException("д��ر�ʧ��");
			}
		}
		
	}
}

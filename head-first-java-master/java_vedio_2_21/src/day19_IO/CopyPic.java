//package day19_IO;
import java.io.*;
public class CopyPic {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try
		{
			fos=new FileOutputStream("c:\\2.jpg");
			fis=new FileInputStream("c:\\1.jpg");
			byte[] buf=new byte[1024];
			int len=0;
			while ((len=fis.read(buf))!=-1)
			{
				fos.write(buf,0,len);
			}
		}
			catch (IOException e) {
				// TODO: handle exception
				throw new RuntimeException("�����ļ�ʧ��");
			}
			finally {
				try
				{
					if(fis!=null)
						fis.close();
				}
				catch(IOException e)
				{
					throw new RuntimeException("��ȡ�ر�ʧ��");
				}
				try
				{
					if(fos!=null)
						fos.close();
				}
				catch(IOException e)
				{
					throw new RuntimeException("д��ر�ʧ��");
				}
			}
		
	}
	
}

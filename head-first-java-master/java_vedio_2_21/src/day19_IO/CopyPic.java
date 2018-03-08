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
				throw new RuntimeException("复制文件失败");
			}
			finally {
				try
				{
					if(fis!=null)
						fis.close();
				}
				catch(IOException e)
				{
					throw new RuntimeException("读取关闭失败");
				}
				try
				{
					if(fos!=null)
						fos.close();
				}
				catch(IOException e)
				{
					throw new RuntimeException("写入关闭失败");
				}
			}
		
	}
	
}

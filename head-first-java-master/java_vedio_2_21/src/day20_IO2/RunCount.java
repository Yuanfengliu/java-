/*
 用于记录应用程序的与运行次数。
 如果使用次数已到，那么给出注册提示。
 
 很容易想到的是：计数器。
 但是该计数器定义在程序中，随着应用程序运行而在运行中存在，并进行自增。
 可是随着该应用程序的退出，该计数器也在内存中消失了。
*/
import java.io.*;
import java.util.*;

class RunCount
{
	public static void main(String[] args) throws IOException
	{
		Properties prop =new Properties();
		File file=new File("count.ini");
		if(!file.exists())
			file.createNewFile();
		
		
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);
		String value=prop.getProperty("time");
		int count=0;
		if(value!=null)
		{
			count=Integer.parseInt(value);
			if(count>=5)
			{
				System.out.println("次数已到");
				return ;
			}
		}
		count++;
		prop.setProperty("time",count+"");
		FileOutputStream fos=new FileOutputStream(file);
		prop.store(fos," ");
		fos.close();
		fis.close();
	}
}
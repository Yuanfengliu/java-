/*
 ���ڼ�¼Ӧ�ó���������д�����
 ���ʹ�ô����ѵ�����ô����ע����ʾ��
 
 �������뵽���ǣ���������
 ���Ǹü����������ڳ����У�����Ӧ�ó������ж��������д��ڣ�������������
 �������Ÿ�Ӧ�ó�����˳����ü�����Ҳ���ڴ�����ʧ�ˡ�
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
				System.out.println("�����ѵ�");
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
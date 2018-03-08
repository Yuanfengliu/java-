import java.io.*;
import java.util.*;
class PropertiesDemo
{
	public static void main(String[] args)throws IOException
	{
		loadDemo();
	}
	
	/*
	想要将
	
	*/
	public static void loadDemo()throws IOException
	{
		FileInputStream fis=new FileInputStream("info.txt");
		Properties prop=new Properties();
		//将流中的数据加载进集合
		prop.load(fis);
		prop.setProperty("wangwu","39");
		FileOutputStream fos=new FileOutputStream("info.txt");
		prop.store(fos,"haha");
		//sop(prop);
		prop.list(System.out);
		fos.close();
		fis.close();
	}
	
	//读取一个txt文件，存取到Properties
	public static void getTxtProperties() throws IOException
	{
		BufferedReader bufr =new BufferedReader(new FileReader("info.txt"));
		String line=null;
		Properties prop=new Properties();
		while((line=bufr.readLine())!=null)
		{
			String[] arr=line.split("=");
			//sop(line);
			prop.setProperty(arr[0],arr[1]);
			
		}
		bufr.close();
		sop(prop);
	}
	public static void setAndGet()
	{
		Properties prop=new Properties();
		prop.setProperty("zhangsan","30");
		prop.setProperty("Lisi","22");
		//sop(prop);
		String value=prop.getProperty("zhangsan");
		sop(value);
		prop.setProperty("Lisi","89");
		Set<String> names=prop.stringPropertyNames();
		for(String s:names)
		{
			sop(s+": "+prop.getProperty(s));
		}
	}
	
	public static void sop(Object o)
	{
		System.out.println(o);
	}
}
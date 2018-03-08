import java.util.*;
import java.io.*;
public class SystemInfo
{
	public static void main(String[] args) throws IOException
	{
		Properties prop=System.getProperties();
		//System.setOut(new PrintStream("info.txt"));
		//System.out.println(prop);
		prop.list(new PrintStream("info.txt"));
	}
}
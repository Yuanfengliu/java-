import java.io.*;
class PrintStreamDemo
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("a.txt")),true);
		
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			out.println(line.toUpperCase());
			out.flush();
		}
		out.close();
		bufr.close();
		
	}
}
package day19_IO;
import java.io.*;
public class LineNumberReaderDemo{
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("BufferReaderDemo.java");
		LineNumberReader lnr=new LineNumberReader(fr);
		String line=null;
		lnr.setLineNumber(100);
		while((line=lnr.readLine())!=null)
		{
			System.out.println(lnr.getLineNumber()+":"+line);
		}
		lnr.close();
	}
}

package day18_others;
import java.lang.*;
public class RuntimeDemo {
	public static void main(String[] args) throws Exception {
		Runtime r=Runtime.getRuntime();
		Process p=r.exec("notepad.exe 23123.txt");
		Thread.sleep(4000);
//		p.destroy();
	}
}

package day13;
//获取一个字符串在另一个字符串中出现的次数
//"abkkcdkkefkkskk"
public class StringTest3 {
	public static void main(String[] args) {
		System.out.println(countString("abkkcdkkefkkskk", "kk"));
	}
	public static int countString(String str,String str2){
		char[] c=str.toCharArray();
		int count=0;
		boolean t=false;
		char[] s=str2.toCharArray();
		for(int i=0;i<=str.length()-str2.length();i++){
			for(int x=0;x<=str2.length()-1;x++){
				if(s[x]==c[i+x])
					t=true;
				else
					{
					t=false;
					break;
					}
			}
			if(t)
				count++;
			t=false;
		}
		return count;
	}
}

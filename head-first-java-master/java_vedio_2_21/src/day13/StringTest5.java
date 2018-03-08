package day13;
//获取一个字符串在另一个字符串中出现的次数
//"abkkcdkkefkkskk"
public class StringTest5 {
	public static void main(String[] args) {
		System.out.println(getCount("abkkcdkkefkkskk", "kk"));
	}
	//方式一
	public static int getString(String str,String key){
		int count=0;
		int index=0;
		while((index=str.indexOf(key))!=-1){
			System.out.println("str="+str);
			count++;
			str=str.substring(index+key.length(), str.length());
		}
		return count;
	}
	//方式二
	public static int getCount(String str,String key){
		int count=0;
		int index=0;
		while((index=str.indexOf(key, index))!=-1){
			count++;
			index+=2;
		}
		return count;
	}
}

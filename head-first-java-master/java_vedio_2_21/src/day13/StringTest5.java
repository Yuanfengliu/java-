package day13;
//��ȡһ���ַ�������һ���ַ����г��ֵĴ���
//"abkkcdkkefkkskk"
public class StringTest5 {
	public static void main(String[] args) {
		System.out.println(getCount("abkkcdkkefkkskk", "kk"));
	}
	//��ʽһ
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
	//��ʽ��
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

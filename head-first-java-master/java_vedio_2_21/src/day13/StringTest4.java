package day13;
//找出两个字符串中相同的子串
public class StringTest4 {
	public static void main(String[] args) {
		System.out.println(getSameSubString("dlajsldhellodhjska", "dshello"));
	}
	public static String getSameSubString(String s1,String s2){
		String max="",min="";
		max=(s1.length()>s2.length())?s1:s2;
		min=(max==s1)?s2:s1;
		for(int x=0;x<max.length();x++){
			for(int y=0,z=min.length()-x;z!=min.length()+1;y++,z++){
				String temp=min.substring(y, z);
//				System.out.println(temp);
				if(max.contains(temp))
					return temp;
			}
		}
		return "";
	}
}

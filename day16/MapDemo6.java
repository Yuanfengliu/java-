/*
map��չ֪ʶ��

map���ϱ�ʹ������Ϊ�߱�ӳ���ϵ��

"yureban" "01" "zahngfei"
"yureban" "02" "lisi"

"jiuyeban" "01" "liu"
"jiuyeban" "02" "yuan"
*/
import java.util.*;
class  MapDemo6
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		HashMap<String,HashMap<String,String>> czbk=new HashMap<String,HashMap<String,String>>();
		HashMap<String,String> yure =new HashMap<String,String>();
		HashMap<String,String> jiuye =new HashMap<String,String>();

		czbk.put("yureban",yure);
		czbk.put("jiuyeban",jiuye);
		
		yure.put("01","zahngfei");
		yure.put("02","lisi");

		jiuye.put("01","liu");
		jiuye.put("02","yuan");

		//����czbk���ϣ���ȡ���еĽ���
		Iterator<String> it =czbk.keySet().iterator();

		while (it.hasNext())
		{
			String roomName =it.next();
			HashMap<String,String> room =czbk.get(roomName);
			System.out.println(roomName);
			getStudentInfo(room);//��ȡÿ�������
		}
		//getStudentInfo(jiuye);
		//getStudentInfo(yure);
	}
	public static void getStudentInfo(HashMap<String,String> roomMap)
	{
		Iterator<String> it =roomMap.keySet().iterator();

		while (it.hasNext())
		{
			String id=it.next();
			String name =roomMap.get(id);
			System.out.println(id+":"+name);
		}
	}
}
package day6;
/*����������һ������ĺ�������Ϊ�������ڣ����Ա�jvm���á�
�������Ķ��壺
1. public�������Ÿú����ķ���Ȩ��������
2. static��������������������ļ��ؾ��Ѿ�������
3. void��������û�о���ķ���ֵ
4. main�����ǹؼ��֣�������һ������ĵ��ʣ����Ա�jvmʶ��
5. (String[] args)�� �����Ĳ���������������һ�����飬�������е�Ԫ�����ַ������ַ��������������顣
�������ĸ�ʽ�ǹ̶��ģ�jvmʶ��
jvm�ڵ���������ʱ���������new String[0]*/
public class MainDemo {
	public static void main(String[] args) {//new String[]
		System.out.println(args[0]);
	}
//	public static void main(int x){}
}

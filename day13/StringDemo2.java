/*
String�������������ַ������
��ô�����ṩ�˶���������ַ������в�����

�����Ĳ�������Щ��
��abcd��

1����ȡ
	1.1 �ַ����еİ������ַ�����Ҳ�����ַ����ĳ��ȡ�
		int length()����ȡ���ȡ���ע�����ǰ���鳤�Ȳ�һ����������һ�����ţ�
	1.2 ����λ�û�ȡλ���ϵ�ĳһ���ַ���
		char charAt(int index);
	1.3 �����ַ���ȡ���ַ����ַ����е�λ�á�
		int indexOf(int ch);���ص���ch���ַ����еĵ�һ�γ��ֵ�λ�á�
		int indexOf(int ch��int fromIndex); ��fromIndexָ��λ�ÿ�ʼ����ȡch���ַ����еĵ�һ�γ��ֵ�λ�á�

		int indexOf(int str);���ص���str���ַ����еĵ�һ�γ��ֵ�λ�á�
		int indexOf(int str��int fromIndex); ��fromIndexָ��λ�ÿ�ʼ����ȡstr���ַ����еĵ�һ�γ��ֵ�λ�á�
2���ж�
	2.1 �ַ������Ƿ����ĳһ���Ӵ���
		boolean contains(str);
			����֮����indexOf(str):��������str��һ�γ��ֵ�λ�ã��������-1��ʾ��str�����ַ����д��ڡ�
				���ԣ�Ҳ�������ڶ�ָ���ж��Ƿ������
				���磺 if(str.indexOf("aa")!=-1)

				���Ҹ÷����ȿ����жϣ�Ҳ���Ի�ȡ���ֵ�λ�á�
	2.2 �ַ������Ƿ�������
		boolean isEmpty();  ԭ������жϳ����Ƿ�Ϊ0.
	2.3 �ַ������Ƿ�����ָ�����ݿ�ͷ
		boolean startsWith(str);
	2.4�ַ������Ƿ�����ָ�����ݽ�β��
		boolean endsWith(str);
	2.5 �ж��ַ��������Ƿ���ͬ����д��object���е�equals������
		boolean equals(str);
	2.6 �ж������Ƿ���ͬ�������Դ�Сд��
		boolean equalsIgnoreCase(str);
3��ת��
	3.1 ���ַ�����ת�����ַ�����
		���캯����String(char[])
					String(char[],offset,count);���ַ������е�һ����ת�����ַ�����
		��̬������
			static String copyValueOf(char[]);
			static String copyValueOf(char[] date,int offset,int count)
			
			static String valueOf(char[]);
	3.2 ���ַ���ת�����ַ����顣 ***(��ס)
		char[]���͵�    toCharArray();
	3.3 ���ֽ�����ת�����ַ���
		String(byte[])
		String(byte[],offset,count);���ֽ������е�һ����ת�����ַ�����
	3.4 ���ַ���ת�����ֽ�����
		byte[]���͵�   getBytes[];
	3.5 ��������������ת�����ַ���
		static String valueOf(int)
		static String valueOf(double)

		3+"abc";//String valueOf(3)//��3����ȥ������ַ���3


����ط����ַ������ֽ�������ת�������У��ǿ���ָ�������ġ�

4���滻
	String replace(oldchar,newchar);

5���и�
	String[]����    split(regex);//����������и�ĵط�

6���Ӵ�����ȡ�ַ����е�һ���֡�
	String substring(begin);
	String substring(begin,end);

7. ת����ȥ���ո񣬱Ƚϡ�
	7.1���ַ���ת���ɴ�д����Сд��
		String toUpperCase();	
		String toLowerCase();	
	7.2���ַ������˵Ķ���ո�ȥ����
		String trim();
	7.3 �������ַ���������Ȼ˳��ıȽϡ�
		int compareTo(string);

*/


class StringDemo2 
{
	public static void method_7()
	{
		String s="  hello java    ";
		sop(s.toLowerCase());
		sop(s.toUpperCase());
		
		sop(s.trim());

		String s1="a1c";//�������԰�1�ĳ�b����a���ߡ�����
		String s2="aaa";
		sop(s1.compareTo(s2));//��ȷ���0�����ڷ���һ������0������С�����Ƿ��ص��Ǹ�����
	}
	public static void method_sub()
	{
		String s="abcdef";
		sop(s.substring(2));//��ָ��λ�ÿ�ʼ����β;����Ǳ겻���ڣ��������ַ����Ǳ�Խ���쳣��
		sop(s.substring(2,4));//ָ��λ�ã�����ͷ��������β����ȫ����ȡ��s.substring(0,s.length());
	}
	public static void method_split()
	{
		String s="����,����,����";
		String[] arr =s.split(",");
		for (int x=0;x<arr.length ;x++ )
		{
			sop(arr[x]);
		}
	}
	public static void method_replace() 
	{
		String s="hello java";//
		String s1=s.replace('a','n');//����һ���µ��ַ���//���Ҫ�滻���ַ��������ڣ��򷵻ص���ԭ�ַ���
		
		String s2=s.replace("java","world");
		sop("s="+s);
		sop("s1="+s1);
		sop("s2="+s2);
	}
	public static void method_trans() 
	{
		char[] arr={'a','b','c','d','e','f'};
		String s=new String(arr);
		String s1=new String(arr,1,3);//λ��1-3���ַ���
		sop("s="+s);
		sop("s="+s1);

		String s2="afdafgkod";
		char[] chs=s2.toCharArray();
		for (int x=0;x<chs.length ;x++ )
		{
			sop("ch="+chs[x]);
		}
	}
	public static void method_is()
	{
		String str="ArrayDemo.java";

		//�ж��ļ������Ƿ���Array���ʿ�ͷ
		sop(str.startsWith("Array"));
		//�ж��ļ������Ƿ���.java���ļ�
		sop(str.endsWith(".java"));
		//�ж��ļ������Ƿ����Demo
		sop(str.contains("Demo"));
	}
	public static void method_get()
	{
		String str="abcdeakpf";

		//����
		sop(str.length());
		
		//����������ȡ�ַ�
		sop(str.charAt(4));//�����ʵ��ַ����в����ڵĽǱ�ʱ�ᷢ��StringIndexOutOfBoundsException

		//�����ַ���ȡ����
		sop(str.indexOf('a',3));//���û���ҵ����ͷ���-1

		//��������һ���ַ�������λ��
		sop(str.lastIndexOf("a"));

	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		method_get();

		System.out.println("---------------------------------");

		method_is();
		
		System.out.println("---------------------------------");

		method_trans();

		System.out.println("---------------------------------");
		method_replace();

		System.out.println("---------------------------------");
		method_split();

		System.out.println("---------------------------------");
		method_sub();
	
		System.out.println("---------------------------------");
		method_7();
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

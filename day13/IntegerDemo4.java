/*
�����������Ͷ����װ��.

������������		�����������ͣ��ࣩ
byte				Byte
short				short
int					Integer  
long				Long  
boolean				Boolean  
float				Float  
double				Double  
char				Character   

�����������Ͷ����װ���������ã��������ڻ����������ͺ��ַ�������֮����ת����  

������������ת���ַ���:  
	������������+���� ���� ������������.toString(������������ֵ)  
	�磺Integer.toString(34);//��34������ɡ�34��;

�ַ���ת��������:
	�����������Ͱ�װ�� a=Xxx.parseXxx(String)
		�磺 int a=Int.parseInt(String);
			double b=Double.parseDouble(String);

ʮ����ת������������
	toBinaryString()
	toHexString()
��������ת����ʮ����
	parseInt(String,radix);//radix�������ʲô����
*/

class IntegerDemo4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//��һ���ַ���ת��������
		int num=Integer.parseInt("123");
		System.out.println("num"+(num+4));
		System.out.println(Integer.toBinaryString(-6));//ת���ɶ�����
		System.out.println(Integer.toHexString(60));//ת����16����


		System.out.println("----------------------------");

		Integer a=127;
		Integer b=127;
		System.out.println("a==b?    "+(a==b));//�����true����Ϊa��bָ����ͬһ��Integer����
							//��Ϊ����ֵ��byte��Χ�ڣ�-128��127���������µ����ԣ��������ֵ�Ѿ����ڣ��򲻻��ڿ����µĿռ䡣

		Integer m=128;
		Integer n=128;
		System.out.println("m==n?    "+(m==n));
	}
}

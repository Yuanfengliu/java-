/*
StringBuffer ���ַ�������������һ��������

1. ���ҳ����ǿɱ仯�ġ�  
2. ���Բ�������������͡�  
3. ���ջ�ͨ��toString��������ַ���
   C��create��U��update��R��read��D��delete��  
   1.�洢  
	 StringBuffer append��������ָ����������Ϊ�������ӵ����������ݵĽ�β��.(���ػ���ԭ������)
	 StringBuffer insert��index�����ݣ������Խ����� ���뵽����ָ��indexλ�á�  
   2.ɾ��   
		StringBuffer delete(start,end):ɾ���������е����ݣ�����start��������end��
		StringBuffer deleteCharAt(index):ɾ��ָ��λ�õ��ַ���
   3.��ȡ  
		char charAt(int index)
		int indexOf(String str)
		int lastIndexOf(String str)
		int length()
		String substring(int start ,int end)
   4.�޸�
		StringBuffer replace(start,end,string);
		void setCharAt(int index,char ch);
	5.��ת��
		StringBuffer reverse();
	
	6. ����������ָ�����ݴ洢��ָ���ַ������У������Դӿ��Դ�ָ��λ�ÿ�ʼ�洢
		void getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)

JDK1.5 �汾֮�������StringBuilder

StringBuffer���߳�ͬ��
StringBuilder���̲߳�ͬ��

java�������������أ�
1.���Ч��  
2.����д  
3.��ȫ��  

�Ժ󿪷�������ʹ��StringBuilder  **************
*/

class StringBufferDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
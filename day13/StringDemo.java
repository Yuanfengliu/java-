class StringDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		String s1="abc";//s1��һ�������ͱ�������abc����һ������
						//�ַ��������ص㣺һ������ʼ���Ͳ����Ա��ı�

		String s2=new String("abc");
		String s3="abc";

//s1��s2��ʲô����
//s1���ڴ�����һ������
//s2���ڴ������������󡣣�������new��sbc��

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//String�ิд��object����equals�������÷��������ж��ַ����Ƿ���ͬ
										//����s1��s2��ָ��Ķ���ıȽϣ�����abc
		//�����false true
	
		System.out.println(s1==s3);	//����true,��������ʱ�����������abc���󣬾ͺ�s1һ��ָ���������
	}
}

class HanShu
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int x;
		boolean c;
		x=get(4);
		System.out.println(x);
		c=compare(3,5);
		System.out.println(c);
	}
	//����������ʱ��û�о���ķ���ֵʱ�����Ƿ���ֵ������һ������Ĺؼ�������ʶ��
	//�ùؼ��־���void��void��������Ǻ���û�о���ķ���ֵ�������
	//�������ķ���ֵ������voidʱ��������return������ʡ�Բ�д��
	public static int get(int num)// public ����ɾ����int������ֵ���ͣ�
		{							//������ú�����������������棬��������涼����
			return num*3+5;
		}
	public static boolean compare(int a,int b)//�Ƚ��������Ƿ����
											//���������ַ���
	{/*
		if (a==b)
			return true;
		//else
			return false;
	  */
	  //return (a==b)?true:false
		return a==b;

	}
}
	

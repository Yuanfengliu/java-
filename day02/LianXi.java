class LianXi 
{
	public static void main(String[] args) 
	{		//��������ָ���·ݣ���ӡ���·ݼ���
		//345�Ǵ��ڣ�678�ļ���9��10��11�＾��12��1��2����
		int x=4;
		if (x==3||x==4||x==5)//������||����ʾֻҪ��һ��x=3�Ϳ��Բ��ÿ��Ƿ����4���Ƿ����5��Ч���ȡ�|������
			System.out.println(x+"���Ǵ���");
		else if(x==6||x==7||x==8)
			System.out.println(x+"�����ļ�");
		else if(x==9||x==10||x==11)
			System.out.println(x+"�����＾");
		else if(x==12||x==1||x==2)
			System.out.println(x+"���Ƕ���");
		else 
			System.out.println(x+"�·ݲ�����");
		System.out.println("Hello World!");
		//�����������������������(x>=3 && x<=5)��ʾ
	}
}
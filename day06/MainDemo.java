/*
public static void main(String[] args)
����������һ������ĺ�������Ϊ�������ڣ����Ա�jvm���á�

���������壺
public�������Ÿú�������Ȩ�������ġ�
static��������������������ļ��ؾ��Ѿ������ˡ�
void��������û�о���ķ���ֵ��
main�����ǹؼ��֣�������һ������ĵ��ʣ����Ա�jvmʶ��
(String[] args)�������Ĳ���������������һ�����飬�������е�Ԫ�����ַ������ַ������͵����顣

�������ǹ̶���ʽ�ģ�jvmʶ��

jvm����������ʱ���������new string[0]
*/
////////////////////////���������в�Ҫд�����������������Լ��˽����//////////////////////////
class MainDemo 
{
	public static void main(String[] args) //�������Ҫ����������������һ�����ַ������͵����顣
	{
		System.out.println("Hello World!");
		System.out.println(args.length);
		//System.out.println(args[0]);//�����飬�����ǿյ�����ִ�к�û�н��
										//��������dos����ʱ��Java MainDemo haha hehe heihei   ������Ԫ�أ����Կո�����
										//�����������haha����Ϊ��ʱ�Ѿ����ȥ����Ԫ��
		String[] arr={"yuan","feng","aa","gsg","22"};
		MainTest.main(arr);
	}
	
	
	/*public static void main(String[] args,int x) 
	{
		System.out.println("Hello World!");
	}
	public static void main(int x) 
	{
		System.out.println("Hello World!");
	}
	*/
}
class  MainTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		for (int x=0;x<args.length ;x++ )
		{
			System.out.println(args[x]);
		}
	}
}
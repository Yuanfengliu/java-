/*
�������ݿ�Ĳ���
�����ǣ��û���Ϣ
 1.�������ݿ�  JDBC  Hibernate
 2.�������ݿ�
	c creat r read u update d delete
 3.�ر����ݿ�����
 dao����date access object:���ݷ��ʶ���
*/
interface UserInfoDao
{
	public void add(UserInfoDao user);
	public void delete(UserInfoDao user);
}
class UserInfoByJDBC implements UserInfoDao
{
	public void add(UserInfoDao user)
	{
//		1��JDBC�������ݿ�
//		2��ʹ��sql���������������
//		3���ر����ӡ�
	}
	public void delete(UserInfoDao user)
	{
//		1��JDBC�������ݿ�
//		2��ʹ��sql�������ɾ������
//		3���ر����ӡ�
	}
}
class UserInfoByHibernate implements UserInfoDao
{
	public void add(UserInfoDao user)
	{
//		1��JDBC�������ݿ�
//		2��ʹ��sql���������������
//		3���ر����ӡ�
	}
	public void delete(UserInfoDao user)
	{
//		1��JDBC�������ݿ�
//		2��ʹ��sql�������ɾ������
//		3���ر����ӡ�
	}
}
class DuoTaiDemo6 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		UserInfoDao ui=new UserInfoByJDBC();
		ui.add(ui);
		ui.delete(ui);
	}
}
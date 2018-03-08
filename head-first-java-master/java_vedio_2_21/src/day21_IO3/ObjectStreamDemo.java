import java.io.*;
class ObjectStreamDemo
{
	public static void main(String[] args)throws Exception
	{
		//writeObj();
		readObj();
	}
	public static void writeObj() throws IOException
	{
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("object.txt"));
		oos.writeObject(new Person("lisi0",399,"kr"));
		oos.close();
	}
	public static void readObj() throws Exception
	{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Object.txt"));
		Person p=(Person)ois.readObject();
		System.out.println(p);
		ois.close();
	}
}

class Person implements Serializable
{
	public static final long serialVersionUID = 42L;
	String name;
	transient int age;
	static String country="cn";
	Person(String name,int age,String country)
	{
		this.name=name;
		this.age=age;
		this.country=country;
	}
	public String toString()
	{
		return name+":"+age+":"+country;
	}
}
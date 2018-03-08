/*
集合框架（体系概述）

为什么出现集合类？
答：面对对象语言对事物的体现都是以对象的形式，所以为了方便对多个对象的操作，就对对象进行存储，
集合就是存储对象最常用的一种方式。

数组和集合类  都是容器，有何不同？
答：数组是固定长度的，集合是可变长度的；数组中存储基本数据类型，集合只存储对象（可以存储不同类型的对象）。

为什么出现这么多的容器？  
答：因为每一个容器对数据的存储方式都有不同。这个存储方式称之为：数据结构。

什么是迭代器？
答：其实就是集合中元素的取出方式。  

把取出方式定义在集合的内部，这样取出方式就可以直接访问集合内容的元素。那么取出方式就被定义成了内部类。
而每一个容器的结构数据不同，所以取出的动作细节也不一样。但是都有共性内容：判断和取出。那么可以将这些共性抽取。

那么这些内部类都符合一个规则。该规则是Iterator.
如何获取集合的取出对象呢？
通过一个对外提供的方法。Iterator（）；
*/

/*
1. add方法的参数类型是object，以便于接受任意类型对象
2. 集合吧存储的都是对象的引用（即地址）
*/
import java.util.*;
class  CollectionDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//创建一个集合容器，使用collection接口的子类  ArrayList
		ArrayList al1 =new ArrayList();

		//添加元素
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");

		//打印原集合
		System.out.println("原集合"+al1);

		//删除元素
		al1.remove("java02");

		//获取个数，集合长度
		System.out.println("size:"+al1.size());

		//打印现在集合
		System.out.println("改变后集合"+al1);



		ArrayList al2 =new ArrayList();


System.out.println("-----------------------------------------------");
		//添加元素(注意：al1现在只剩下三个元素，不是原来四个元素，所以交集是由一个元素)
		al2.add("java01");
		al2.add("java02");
		al2.add("java05");
		al2.add("java06");

		//取交集
		al1.retainAll(al2);//取交集,al1只会留下与al2中相同的元素

		System.out.println("al1"+al1);
		System.out.println("al2"+al2);

System.out.println("-------------------------------------------------");

		Iterator it=al2.iterator();//获取迭代器，用于取出集合中的元素。
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}

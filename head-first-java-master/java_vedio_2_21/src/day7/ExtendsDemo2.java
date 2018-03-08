package day7;



/*子父类出现后，类成员的特点
类成员：
1.变量
2.函数
3.构造函数

1.变量
如果子类中出现非私有的同名成员变量时，子类要访问本类中的变量，用this
super代表的是父类对象的引用
2.子父类中的函数
当子类和父类中出现一样的函数时，当子类对象调用该函数，会运行子类函数的内容。如同父类的函数被覆盖一样。
这种情况是函数的另一个特性：重写（覆盖）
当子类继承父类，沿袭了父类的功能，但是功能的内容却和父类不一致。这时没有必要定义新功能，而是使用覆盖特殊，保留父类的功能定义，并重写功能内容。

覆盖：
1.子类覆盖父类，必须保证子类权限大于父类权限，否则编译失败
2.静态只能覆盖静态。
*/
class Fu{
	int num=4;
}

class Zi extends Fu{
	int num=5;
	void show(){
		System.out.println(super.num);
	}
}
public class ExtendsDemo2 {
	public static void main(String[] args) {
		Zi z=new Zi();
		System.out.println(z.num+"..."+z.num);
		z.show();
	}
}

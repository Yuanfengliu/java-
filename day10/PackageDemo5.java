
/*
在cmd上输入：javac -d . PackageDemo.java
然后回车
系统会在指定目录上生成一个pack文件夹，里面有PackageDemo.class文件
这样Java文件和class就会隔开，传给别人运行就把class文件发给别人就行，不需要源文件


为了简化类名的书写，使用一个关键字，import
只要在开头声明即可：如：
import pack.xxx.xxx.类名
这样后面建立类的时候就跟以前一样

建议不要写通配符 * ，需要用到包中的那个类，就导入哪个类

定义包名不要重复，可以使用url来定义，uri是唯一的

www.itcast.cn

package cn.itcast.demo
package cn.itcast.test
*/ 
package pack;//定义包名  所有的字母小写

class  PackageDemo5
{
	public static void main(String[] args) 
	{
		System.out.println("Hello package!");
	}
}

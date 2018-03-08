package ch7_ReuseClass;
//protected ¹Ø¼ü×Ö
class Villain{
	private String name;
	protected void set(String nm) {name=nm;}
	public Villain(String name){this.name=name;}
	public String toString(){
		return "I'm Villain and my name is "+name;
	}
	}
public class Orc extends Villain{
	private int orcNumber;
	public Orc(String name,int orcName){
		super(name);
		this.orcNumber=orcName;
	}
	public void change(String name,int orcNumber){
		set(name);
		this.orcNumber=orcNumber;
	}
	public String toString(){
		return "Orc"+orcNumber+": "+super.toString();
	}
	public static void main(String[] args) {
		Orc orc=new Orc("Limburger", 12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}
}

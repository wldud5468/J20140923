
public class 생성자 {
	String name;
	public 생성자() //기본생성자
	{
		this("SSS");
		System.out.println("기본생성자");
		this.name = "AAA";//생성자("TEST"); //this는 class를
		
	}
	public 생성자(String name)
	{
		this("SSS",10);
		System.out.println("생성자"+name);
	}
	public 생성자(String name, int a)
	{
		this("SSS",10,100.5d);
		System.out.println("생성자"+name+" "+a);
	}
	public 생성자(String name, int a, double b)
	{
		System.out.println("생성자"+name+" "+a+" "+b);
	}
}

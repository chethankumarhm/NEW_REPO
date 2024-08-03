package Test;

public class D extends C{
	public void add(int a) {
		System.out.println("override abstract 1");
	}
	
	
	public String add(int a,int b) {
		String s="override abstract 2";
		return s;
	}
	
public static void main(String[] args) {
	C c=new D();
	c.add(10);
	System.out.println(c.add(10, 20));
}
}

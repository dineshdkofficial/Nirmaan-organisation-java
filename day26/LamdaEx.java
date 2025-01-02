package day26;

interface calc{
	void add();
}

public class LamdaEx {
	public static void main(String[] args) {
		int a =20;
		int b =40;
		calc c1 = () -> System.out.println(a+b);
		
		c1.add();	
	}
	
}

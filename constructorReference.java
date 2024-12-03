package day7;

public class constructorReference {
	int a;
	constructorReference(int firstNum){
		this.a=firstNum;
	}
	constructorReference(int firtNum,int secondNum){
		this.a=firstNum+secondNum;
	}
	public static void main(String[] args) {
		constructorReference con1 = new constructorReference(15);
		constructorReference con2 = new constructorReference(15,20);
		
		System.out.println(con2.a);
		
	}

}

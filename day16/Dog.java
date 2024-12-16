package day16;

public class Dog implements AnimalBehaviour{
	
	public void move() {
		System.out.println("the dog runs on four legs");
	}
	public void speak() {
		System.out.println("the dog says: woof woof!");
	}
	public static void main(String[] args) {
		   Dog D=new Dog();
		   D.speak();
		   D.move();
		     System.out.println(AnimalBehaviour.CATEGORY);
		     System.out.println(AnimalBehaviour.isMammal("tiger"));
}
}

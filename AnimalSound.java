package day13;

class Animal {
	void makeSound() {
		System.out.println("This Animal make Sound");
		
	}
}
	class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("The Dog barks");
	}
	
	}
	class Cat extends Animal{
		@Override
		void makeSound() {
			System.out.println("The Cat Meows");
		}
	}
	public class AnimalSound {
	public static void main(String[]agrs) {
		Dog D=new Dog();
		D.makeSound();
		Cat C=new Cat();
		C.makeSound();
	}
	}
	
	



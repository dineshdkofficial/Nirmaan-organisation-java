package day16;

public class Brid implements AnimalBehaviour{
	

	public void move() {
		System.out.println("the bird files in the sky");
	}

	public void speak() {
		System.out.println("the bird says : chirp chirp!");
	}
	public static void main(String[] args) {
     Brid B=new Brid();
     B.speak();
     B.move();
     System.out.println(AnimalBehaviour.CATEGORY);
     System.out.println(AnimalBehaviour.isMammal("lion"));
}
}

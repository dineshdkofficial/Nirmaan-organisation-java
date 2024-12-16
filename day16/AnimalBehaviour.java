package day16;

public interface AnimalBehaviour {
  String CATEGORY = "human being";
	static boolean isMammal(String animalName) {
		return(animalName.equalsIgnoreCase( "Dog")) || (animalName.equalsIgnoreCase( "Cat")) || (animalName.equalsIgnoreCase( "Human"));
	}
default void speak() {
	System.out.println("Animal is making sound");
}
abstract void move();
}


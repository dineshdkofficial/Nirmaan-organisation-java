package day10;

public class Car {
	String make;
	int year;
	
public Car() {
	this.make="unkown";
	this.year=2000;
}
Car(String make){
	this.make=make;
	this.year=2000;
}
Car(String make,int year){
		this.make=make;
		this.year=2000;
}
void displayCarDetails() {
System.out.println("Car make"+make);
System.out.println("Car year"+year);
		
}	
	


}

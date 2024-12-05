package day10;

public class main {
	public static void main(String[]agrs) {
		Car car1=new Car();
		car1.displayCarDetails();
		
		Car car2=new Car("tata");
		car2.displayCarDetails();
		
		Car car3=new Car("tata",2000);
		car3.displayCarDetails();
	}
}


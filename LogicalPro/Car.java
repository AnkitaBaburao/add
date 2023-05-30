package statement;

public class Car {
double price;
String name;
String color;
static String brand="BMW";
	public static void main(String[] args) {
		Car car1=new Car();
		System.out.println(car1.brand+"is the C1 brand");
		car1.price=100.43;
		System.out.println(car1.price+"is the C1 price");
		car1.color="Pink";
		System.out.println(car1. color+"is the C1 color");
		car1.name="A1";
		System.out.println(car1.name+"is the C1 name ");

	}

}

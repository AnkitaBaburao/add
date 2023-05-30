package statement;

public class Marker {
double price;
static String brand="Camlin";
String name;
String color;
	public static void main(String[] args) {
	Marker marker=new Marker();
	System.out.println(marker.brand+"is the brand");
	System.out.println(marker.price);
	System.out.println(marker.name);
	marker. color="Red";
	System.out.println(marker.color+"is the M1 color ");
System.out.println("======Marker2======");
Marker marker2=new Marker();
System.out.println(marker2.brand+" is the brand");
System.out.println(marker2.price);
System.out.println(marker2.name);
marker. color="Black";
System.out.println(marker2.color+"is the M2 color");

	}

}

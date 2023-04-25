package designpatterns.decorator;

public class Decorator {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.addFeatures();
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.addFeatures();
    }
}

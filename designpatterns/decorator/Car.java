package designpatterns.decorator;

public interface Car {
    public void addFeatures();
}

class BasicCar implements Car {
	@Override
	public void addFeatures() {
		System.out.print("Basic Car.");
	}
}

class CarDecorator implements Car {
	protected Car car;
	
	public CarDecorator(Car c){
		this.car=c;
	}
	
	@Override
	public void addFeatures() {
		this.car.addFeatures();
	}
}

class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void addFeatures(){
		super.addFeatures();
		System.out.print(" Adding features of Sports Car.");
	}
}

class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void addFeatures(){
		super.addFeatures();
		System.out.print(" Adding features of Luxury Car.");
	}
}
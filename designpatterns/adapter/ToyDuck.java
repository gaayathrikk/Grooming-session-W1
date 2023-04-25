package designpatterns.adapter;

public interface ToyDuck {
    public void squeak();
}

class PlasticToyDuck implements ToyDuck{
	public void squeak()
	{
		System.out.println("Squeak");
	}
}

class BirdAdapter implements ToyDuck{
	Bird bird;
	public BirdAdapter(Bird bird){
		this.bird = bird;
	}

	public void squeak(){
		bird.makeSound();
	}
}

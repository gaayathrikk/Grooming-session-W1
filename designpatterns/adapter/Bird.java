package designpatterns.adapter;

public interface Bird {
    public void fly();
	public void makeSound();
}

class Sparrow implements Bird{
	public void fly(){
		System.out.println("Flying");
	}
	public void makeSound(){
		System.out.println("Chirp Chirp");
	}
}

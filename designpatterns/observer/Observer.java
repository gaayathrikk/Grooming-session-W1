package designpatterns.observer;

public interface Observer {
	public void update(int length, int breadth);
}

class AreaOfShape implements Observer
{
	private float area;

	public void update(int length, int breadth){
		this.area =(float)length*breadth;
		display();
	}

	public void display(){
		System.out.println("\nArea of shape:  " + area);
	}
}

class Values implements Observer
{
	private int length,breadth;

	public void update(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
		display();
	}

	public void display()
	{
		System.out.println("\nValues:\n" + "length: " + length + "\nbreath:" + breadth );
	}
}
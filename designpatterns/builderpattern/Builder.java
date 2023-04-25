package designpatterns.builderpattern;

public class Builder {
    public static void main(String[] args)
	{
		HouseBuilder aBuilder = new AHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(aBuilder);

		engineer.constructHouse();

		House house = engineer.getHouse();

		System.out.println("Builder constructed: "+ house);
	}
}

// shouldn't force user - constructor not necessary
// setters
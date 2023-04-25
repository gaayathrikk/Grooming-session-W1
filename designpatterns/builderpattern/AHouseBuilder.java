package designpatterns.builderpattern;

class AHouseBuilder implements HouseBuilder{
	private House house;

	public AHouseBuilder(){
		this.house = new House();
	}

	public void buildStructure(){
		house.setStructure("Structure");
	}

	public void buildInterior(){
		house.setInterior("Interior");
	}

	public House getHouse(){
		return this.house;
	}
}


package designpatterns.builderpattern;

class WoodHouseBuilder implements HouseBuilder{
	private House house;

	public WoodHouseBuilder(){
        this.house = new House();
	}

	public void buildStructure(){
		house.setStructure("Wood and Ice");
	}

	public void buildInterior(){
		house.setInterior("Fire Wood");
	}

	public House getHouse(){
		return this.house;
	}

}

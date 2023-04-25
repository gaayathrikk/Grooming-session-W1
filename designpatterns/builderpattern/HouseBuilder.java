package designpatterns.builderpattern;

public interface HouseBuilder {
	public void buildStructure();
	public void buildInterior();
	public House getHouse();
}

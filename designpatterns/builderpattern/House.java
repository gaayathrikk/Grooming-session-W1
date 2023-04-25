package designpatterns.builderpattern;

class House implements HousePlan{
	private String structure;
	private String interior;

	public void setStructure(String structure){
		this.structure = structure;
	}

	public void setInterior(String interior){
		this.interior = interior;
	}

}


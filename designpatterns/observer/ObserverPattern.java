package designpatterns.observer;

public class ObserverPattern {

	public static void main(String args[]) {
		AreaOfShape AreaOfShape = new AreaOfShape();
		Values Values = new Values();

		Shape Shape = new Shape();

		Shape.registerObserver(AreaOfShape);
		Shape.registerObserver(Values);

		Shape.dataChanged();
		Shape.unregisterObserver(AreaOfShape);
	}
}

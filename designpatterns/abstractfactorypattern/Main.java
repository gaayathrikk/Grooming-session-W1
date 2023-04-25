package designpatterns.abstractfactorypattern;

import designpatterns.abstractfactorypattern.Color.Color;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape = shapeFactory.getShape("Square");
        shape.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color color = colorFactory.getColor("Red");
        color.fill();
    }
}

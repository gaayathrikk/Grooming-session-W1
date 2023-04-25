package designpatterns.abstractfactorypattern;

import designpatterns.abstractfactorypattern.Color.Color;

public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("Triangle")) {
            return (Shape) new Triangle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return (Shape) new Square();
        }else {
            return null;
        }
    }

    Color getColor(String color){
        return null;
    }
}

package designpatterns.abstractfactorypattern;

import designpatterns.abstractfactorypattern.Color.Color;
import designpatterns.abstractfactorypattern.Color.Red;
import designpatterns.abstractfactorypattern.Color.Yellow;

public class ColorFactory extends AbstractFactory{
    public Shape getShape(String shape) {
        return null;
    }

    Color getColor(String color){
        if (color.equalsIgnoreCase("Yellow")) {
            return new Yellow();
        } else if (color.equalsIgnoreCase("Red")) {
            return new Red();
        }else {
            return null;
        }
    }
}

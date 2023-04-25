package designpatterns.abstractfactorypattern;

import designpatterns.abstractfactorypattern.Color.Color;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}

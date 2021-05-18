package mode.instance.abstractfactorymode;

import mode.instance.factory.Shape;

abstract class AbstractFactory{
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}

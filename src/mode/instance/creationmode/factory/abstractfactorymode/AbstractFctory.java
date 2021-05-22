package mode.instance.creationmode.factory.abstractfactorymode;

import mode.instance.creationmode.factory.Shape;

abstract class AbstractFactory{
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}

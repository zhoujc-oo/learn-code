package mode.instance.creationmode.factory.abstractfactorymode;

import mode.instance.creationmode.factory.Circle;
import mode.instance.creationmode.factory.Rectangle;
import mode.instance.creationmode.factory.Shape;
import mode.instance.creationmode.factory.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

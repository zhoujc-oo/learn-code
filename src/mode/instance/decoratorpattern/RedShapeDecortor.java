package mode.instance.decoratorpattern;

public class RedShapeDecortor extends ShapeDecorator{
    public RedShapeDecortor(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}

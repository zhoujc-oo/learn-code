package mode.instance.decoratorpattern;

public class DecoratedPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecortor(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecortor(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border"  );
        redRectangle.draw();
    }
}

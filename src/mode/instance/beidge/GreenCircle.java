package mode.instance.beidge;

public class GreenCircle implements DrawAPI{
    @Override
    public void drawCiecle(int radius, int x, int y) {
        System.out.println("Drawing Circle[color: green, radius:" + radius + ", x:" + x + "," + y +"]");
    }
}

package mode.instance.beidge;

public class RedCircle implements DrawAPI{
    @Override
    public void drawCiecle(int radius, int x, int y) {
        System.out.println("Drawing Circle[color: red,radius:" + radius +", x:" + x +"," + y +"]");

    }
}

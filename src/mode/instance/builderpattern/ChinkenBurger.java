package mode.instance.builderpattern;

public class ChinkenBurger extends Burger{
    @Override
    public float price() {
        return 50.0f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}

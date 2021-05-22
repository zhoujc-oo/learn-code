package mode.instance.creationmode.factory.builderpattern;

public abstract class Burger implements Item{
    @Override
    public Wrapper packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

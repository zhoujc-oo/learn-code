package mode.instance.behavioralmodel.commandpattern.observerpattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
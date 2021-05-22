package mode.instance.structuuralmodel.adapterpattern.beidge;

public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape (DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}

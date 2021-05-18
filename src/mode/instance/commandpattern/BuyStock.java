package mode.instance.commandpattern;

public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abStock){
        this.abcStock = abStock;
    }

    public void execute(){
        abcStock.buy();
    }

    @Override
    public void draw() {

    }
}

package cn.zjc.instanceof1;

public class MerchandiseV2 {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;
    public MerchandiseV2(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }
    public MerchandiseV2(String name, String id, int count, double soldPrice) {
        this(name, id, count, soldPrice, soldPrice * 0.8);
    }
    public MerchandiseV2() {
        this("无名", "000", 0, 1, 1.1);
    }
    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice + "。商品进价是" +
                purchasePrice + "。商品库存量是" + count + "。销售一个的毛利润是" + calculateProfit());
    }
    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        return profit;
    }
    public double buy(int count) {
        System.out.println("Merchandise里的buy(int count)");
        if (this.count < count) {
            System.out.println("购买失败，库存不够");
            return -1;
        }
        this.count -= count;
        double cost = count * soldPrice;
        System.out.println("购买成功，花费为" + cost);
        return cost;
    }
    public double buy(boolean reallyBuy) {
        System.out.println("Merchandise里的buy(boolean reallyBuy)");
        if (reallyBuy) {
            return buy(1);
        } else {
            return -1;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
     }
    public void setId(String id) {
        this.id = id;
     }

}
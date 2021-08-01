package cn.zjc.supermarket;

/**
 * 商品类
 */
public class MerchandiseV2 {

    // 属性
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double merchandises;
    public double purchasePrice;
    String madeIn;

    /**
     * 描述
     */
    public void describe() {
        double netTncome = soldPrice - purchasePrice;
        System.out.println("商品名叫:" + name + "\nid为" + id + "价格销售价为"
                + soldPrice + "商品进价为" + count + "商品库存为" +
                count + "商品的毛利润为" + netTncome + "制造地为" + madeIn);
    }


    public void changePrice(double newPrice) {
        System.out.println("修改商品价格");
        this.soldPrice = newPrice;
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        //if(profit <= 0){
        //return 0;
        //}
        return profit;
    }

    public double buy(int count) {
        if (this.count < count) {
            return -1;
        }
        return this.count -= count;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void shangPing(int newcount) {
        System.out.println("改变商品数量");
        this.count = newcount;
    }

    protected void setSoldPrice(double soldPrice) {

    }


    /** public double calculateProfit() {
     double profit = soldPrice - purchasePrice;
     if (profit <= 0) {
     return 0;
     }
     return profit;
     }
     public double getCurrentCount() {
     return count;
     }
     public int getIntSoldPrice() {
     return (int) soldPrice;
     }
     }
     */
}



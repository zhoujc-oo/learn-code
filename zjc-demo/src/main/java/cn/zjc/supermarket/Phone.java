package cn.zjc.supermarket;



public class Phone extends MerchandiseV2 {
    private double screenSize;
    private double cpuHZ;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;
    private static int MAX_BUY_ONE_ORDER = 5;

    public Phone(
            String name, String id, int count, double soldPrice, double purchasePrice,
            double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os
    ) {
        this.screenSize = screenSize;
        this.cpuHZ = cpuHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;

        this.setName(name);
        this.setId(id);
        this.setCount(count);
        this.setSoldPrice(soldPrice);
        this.setPurchasePrice(purchasePrice);
    }



    private void setPurchasePrice(double purchasePrice) {

    }

    //子类并不是只会把父类的方法拿过来，而且可以通过覆盖来替换其中不适合子类的方法
    public double buy(int count) {

        if (count > MAX_BUY_ONE_ORDER) {
            System.out.println("购买失败，手机一次最多只能买" + MAX_BUY_ONE_ORDER + "个");
            return -1;
        }

        if (this.count < count) {
            System.out.println("购买失败，库存不够");
            return -1;
        }

        this.count -= count;
        double cost = count * soldPrice;
        System.out.println("购买成功，花费：" + cost);
        return cost;

        //todo 返回值必须一样，不是类型兼容。而且必须一模一样
        //public boolran buy(int count){
        //return true;


        // todo 覆盖可以覆盖掉父类的方法，同一个方法，不同的行为
        // todo 方法不止眼前的代码，还有子类的覆盖，才能多态
    }

    //todo 返回值必须一样，不是类型兼容，而是必须一模一样。
    //todo 如果签名一样，但是返回值不一样，会错。
    /** punlic int buy(int count){
     if(count > MAX_BUY_ONE_ORDER){
     return -2;
     }
     if (this.count < count){
     return -1;
     }
     return this.count -= count;
     }
     */

    public String getName () {
        return this.brand + ":" + this.os + ":" + name;
    }

    public String describePhone () {
        System.out.println("此手机商品属性如下");
        describe();
        System.out.println("手机厂商为" + brand + ":系统为" + os + ":硬件配置如下：\n" +
                "屏幕：" + screenSize + "寸\n" +
                "cpu主题" + cpuHZ + "GHz\n" +
                "内存" + memoryG + "Gb\n" +
                "内存空间" + storageG + "Gb");
        return "zhou";
    }


    public String describePhone1(String msg) {
        System.out.println("msg" + msg);
        return "1";
    }
}







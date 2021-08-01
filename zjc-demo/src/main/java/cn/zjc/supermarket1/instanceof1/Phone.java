package cn.zjc.supermarket1.instanceof1;

public class Phone extends MerchandiseV2 {

// 给Phone增加新的属性和方法
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
        super(name, id, count, soldPrice * 1.2, purchasePrice);
        this.screenSize = screenSize;
        this.cpuHZ = cpuHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;
    }
    public double buy(int count) {
        System.out.println("Phone里的buy(int count)");
        if (count > MAX_BUY_ONE_ORDER) {
            System.out.println("购买失败，手机一次最多只能买" + MAX_BUY_ONE_ORDER + "个");
            return -2;
        }
        return super.buy(count);
    }
    public String getName() {
        return this.brand + ":" + this.os + ":" + super.getName();
    }
    public void describe() {
        System.out.println("此手机商品属性如下");
        super.describe();
        System.out.println("手机厂商为" + brand + "；系统为" + os + "；硬件配置如下：\n" + "屏幕：" + screenSize + "寸\n" +
        "cpu主频" + cpuHZ + " GHz\n" + "内存" + memoryG + "Gb\n" + "存储空间" + storageG + "Gb");
    }

    protected double getPurchasePrice() {
        return 0;
    }
}


package cn.zjc.instanceof1;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public MerchandiseV2[] merchandises;
    public int[] merchandiseSold;
    public LittleSuperMarket(String superMarketName, String address, int parkingCount,
                             int merchandiseCount, int count) {
        this.superMarketName = superMarketName;
        this.address = address;
        this.parkingCount = parkingCount;
        merchandises = new MerchandiseV2[merchandiseCount];
        for (int i = 0; i < merchandises.length; i++) {
// 创建手机，手机壳变色的手机，和普通商品，都放在商品数组里
            MerchandiseV2 m = null;
            if (i > 0 & i % 100 == 0) {
                m = new ShellColorChangePhone(
            "商品" + i, "ID" + i, count, 1999, 999, 4.5, 3.5,
                        4, 128, "三星", "Android"
                );
            } else if (i > 0 & i % 10 == 0) {
                m = new Phone(
            "商品" + i, "ID" + i, count, 1999, 999, 4.5, 3.5,
                        4, 128, "索尼", "Android"
                );
            } else {
                double purchasePrice = Math.random() * 200;
                m = new MerchandiseV2(
             "商品" + i, "ID" + i, count, purchasePrice * (1 + Math.random()),
                        purchasePrice
                );
            }
            merchandises[i] = m;
        }
        merchandiseSold = new int[merchandises.length];
    }
    public String getSuperMarketName() {
        return superMarketName;
    }
    public String getAddress() {
        return address;
    }
    public int getParkingCount() {
        return parkingCount;
    }
    public double getIncomingSum() {
        return incomingSum;
    }
    public void setSuperMarketName(String superMarketName) {
        this.superMarketName = superMarketName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setParkingCount(int parkingCount) {
        this.parkingCount = parkingCount;
    }
    public void setIncomingSum(double incomingSum) {
        this.incomingSum = incomingSum;
    }
    public void setMerchandises(MerchandiseV2[] merchandises) {
        this.merchandises = merchandises;
    }
    public void setMerchandiseSold(int[] merchandiseSold) {
        this.merchandiseSold = merchandiseSold;
    }
    public MerchandiseV2 getBiggestProfitMerchandise() {
        MerchandiseV2 curr = null;
        for (int i = 0; i < merchandises.length; i++) {
            MerchandiseV2 m = merchandises[i];
            if (curr == null || curr.calculateProfit() < m.calculateProfit()) {
                curr = m;
            }
        }
        return curr;
    }
    public MerchandiseV2 getMerchandiseOf(int merchandiseIndex) {
        if (merchandiseIndex < 0 || merchandiseIndex >= merchandises.length) {
            return null;
        }
        return merchandises[merchandiseIndex];
    }
    public void addIncomingSum(double toBeAdded) {
        this.incomingSum += toBeAdded;
    }
    public boolean spendMoney(double toBeSpent) {
        if (toBeSpent > incomingSum) {
            return false;
        }
        incomingSum -= toBeSpent;
        return true;
    }

}
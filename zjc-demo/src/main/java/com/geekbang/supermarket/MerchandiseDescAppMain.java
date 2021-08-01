package com.geekbang.supermarket;

import javax.xml.namespace.QName;

public class MerchandiseDescAppMain {
    public static void main(String[] args) {
        Merchandise merchandise = new Merchandise();

        merchandise.name = "书桌";
        merchandise.soldPrice = 999.9;
        merchandise.purchasePrice = 500;
        merchandise.count = 40;
        merchandise.id = "DESK9527";

//        merchandise.init( name)

        System.out.println("商品名叫:" + merchandise.name + "\nid为"+merchandise.id+"价格销售价为"
                +merchandise.soldPrice+"商品进价为"+merchandise.purchasePrice+"商品库存为"+
                merchandise.count+"商品的毛利润为"+(merchandise.soldPrice-merchandise.purchasePrice));
    }
}
/**
 *
 */

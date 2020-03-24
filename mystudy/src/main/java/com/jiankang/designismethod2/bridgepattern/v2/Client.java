package com.jiankang.designismethod2.bridgepattern.v2;

/*
 *@create by jiankang
 *@date 2019/12/26 time 20:01
 */

public class Client {
    public static void main(String[] args) {
        System.out.println("---------------房地产这样运营---------------");
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        System.out.println();
        System.out.println("---------------服装厂这样运营--------------------");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();

        System.out.println("---------------山寨公司这样运营-------------------");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();
    }
}

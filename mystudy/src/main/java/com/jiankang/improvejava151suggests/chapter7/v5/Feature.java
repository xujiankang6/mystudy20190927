package com.jiankang.improvejava151suggests.chapter7.v5;

/*
 *@create by jiankang
 *@date 2020/10/30 time 17:54
 */

public interface Feature {
    public void load();
}

class FlyFeature implements Feature{

    @Override
    public void load() {
        System.out.println("增加一只翅膀。。。。");
    }
}

class DigFeature implements Feature{

    @Override
    public void load() {

        System.out.println("增加钻地能力.....");
    }


}

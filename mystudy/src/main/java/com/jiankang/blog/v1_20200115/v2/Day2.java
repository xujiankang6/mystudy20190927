package com.jiankang.blog.v1_20200115.v2;

/*
 *@create by jiankang
 *@date 2020/1/15 time 16:20
 */

public enum Day2 {

    //枚举实例必须定义到最前面
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");//记住要用分号结束

    private String desc;

    /**
     * 私有构造，防止外部调用
     * @param desc
     */
    private Day2(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }



    public static void main(String[] args) {
        for (Day2 day : Day2.values()) {
            System.out.println(day.name() + "-----" + day.getDesc());
        }
    }

    @Override
    public String toString() {
        return desc;
    }
}

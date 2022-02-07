package com.jiankang.otherstudy.v3.v3;

/**
 * ArrayDemo
 *
 * @author jiankang.xu
 * @date 2020/3/14
 */
public class Demo {
    public static void main(String[] args) {
        //构造年龄处理器
        AbstractAgeHandler lessThan18Handler = new LessThan18Handler();
        AbstractAgeHandler moreThan60Handler = new MoreThan60Handler();
        AbstractAgeHandler between18And60Handler = new Between18And60Handler();
        lessThan18Handler.setNextAgeHandler(between18And60Handler);
        between18And60Handler.setNextAgeHandler(moreThan60Handler);

        // 使用
        User user = new User();
        user.setAge((short) 114);
        user.setName("张三");
        user.setMale(true);

        lessThan18Handler.handle(user);
    }
}

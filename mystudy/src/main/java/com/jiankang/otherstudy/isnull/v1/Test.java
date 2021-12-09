package com.jiankang.otherstudy.isnull.v1;





import java.util.ArrayList;
import java.util.List;

/**
 * Test
 *
 * @author jiankang.xu
 * @date 2021/10/13
 */
public class Test {


    public static void main(String[] args) {
        List list = new ArrayList<>();
        Apple apple =new Apple();
        if(org.apache.commons.lang3.StringUtils.isEmpty(apple.getName())){
            //为空return
            return;
        }
        //不为空逻辑
        // TODO

        if(org.springframework.util.StringUtils.isEmpty(apple.getName())){
            //为空return
            return;
        }
        //字符串不为空时执行逻辑
        //TODO
        if (org.springframework.util.CollectionUtils.isEmpty(list)) {
            //为空return
            return;
        }
        //list不为空时执行逻辑
        //TODO

    }
}

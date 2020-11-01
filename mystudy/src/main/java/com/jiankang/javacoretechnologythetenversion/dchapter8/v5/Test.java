package com.jiankang.javacoretechnologythetenversion.dchapter8.v5;

/*
 *@create by jiankang
 *@date 2020/8/4 time 14:50
 */

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Map map = new HashMap<>();
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", list);
        XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream("D:\\mystudy20190927\\mystudy\\src\\main\\java\\com\\jiankang\\javacoretechnologythetenversion\\dchapter8\\v5\\a.xml"));

        xmlEncoder.writeObject(map);
        xmlEncoder.flush();
        xmlEncoder.close();
    }
}

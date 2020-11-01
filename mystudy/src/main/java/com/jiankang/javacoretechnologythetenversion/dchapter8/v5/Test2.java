package com.jiankang.javacoretechnologythetenversion.dchapter8.v5;

/*
 *@create by jiankang
 *@date 2020/8/4 time 14:55
 */

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
       XMLDecoder xmlDecoder= new XMLDecoder(new FileInputStream("D:\\mystudy20190927\\mystudy\\src\\main\\java\\com\\jiankang\\javacoretechnologythetenversion\\dchapter8\\v5\\a.xml"));
        final Map map = (Map) xmlDecoder.readObject();
        final Set set = map.keySet();
        for (Object o : set) {
            System.out.println(map.get(o));
        }
    }
}

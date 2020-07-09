package com.jiankang.javacoretechnologythetenversion.dchapter1.v2;

/*
 *@create by jiankang
 *@date 2020/7/5 time 17:02
 */

import java.nio.charset.Charset;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

//        try {
//            InputStreamReader in = new InputStreamReader(new FileInputStream("aa.txt"), Charset.defaultCharset());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        Charset charset = Charset.forName("utf-8");
        Set<String> aliases = charset.aliases();
        for (String alias : aliases) {
            System.out.println(alias);
        }


//        SortedMap<String, Charset> charsets = Charset.availableCharsets();
//        for (String s : charsets.keySet()) {
//            System.out.println(s.toString() );
//        }
    }
}

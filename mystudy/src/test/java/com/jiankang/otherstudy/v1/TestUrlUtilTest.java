package com.jiankang.otherstudy.v1;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;


public class TestUrlUtilTest {


    @Test
    public void testURLUtil() throws UnsupportedEncodingException {

        String url = "http://www.imooc.com/test?name=张三";
        // 旧的函数
        String encodeOrigin = URLEncoder.encode(url);
        String decodeOrigin = URLDecoder.decode(encodeOrigin);

        // 新的函数
        String encodeNew = URLEncoder.encode(url, "utf-8");
        String decodeNew = URLDecoder.decode(encodeNew, "utf-8");

        // 结果对比
        Assert.assertEquals(encodeOrigin, encodeNew);
        Assert.assertEquals(decodeOrigin, decodeNew);
    }

}
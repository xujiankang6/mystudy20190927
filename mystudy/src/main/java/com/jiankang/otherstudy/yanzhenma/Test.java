package com.jiankang.otherstudy.yanzhenma;

import java.util.ArrayList;
import java.util.Random;

/**
 * Test
 *
 * @author jiankang.xu
 * @date 2021/11/21
 */
public class Test {

    public static void main(String[] args) {
        Random random = new Random();
        int length = 50;// 50个随机数
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i4 = 0; i4 < length; i4++) {
            int number = random.nextInt(100) + 1;
            // 1-100的随机数（此处100必须比length大，否则会死循环）
            if (!list.contains(number)) {
                list.add(number);
            } else {
                i4--;// 保证生成的随机数个数足够，防止有重复随机数时造成空位
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + "\t");
        }
        System.out.println();
        System.out.println(list.size());
    }

    /*
     * 得到固定位数的密码随机数，固定位数的验证码。
     * pwd_len 生成的密码总长度
     */
    public static String getRandomNum(int pwd_len) {
        //如果把所有数字和字母小写写入str，这儿为36；
        final int maxNum = 6;
        int i6;//生成的随机数
        int count=0;//生成密码的长度
        char[] str= {'a','b','c','0','1','2'};//26个字母和10个数字


        StringBuffer pwd=new StringBuffer();
        Random r=new Random();
        while(count<pwd_len) {
            //生成随机数，取绝对值，防止生成负数
            i6=Math.abs(r.nextInt(maxNum));//生成的最大数为36-1
            if(i6>=0&&i6<str.length) {
                pwd.append(str[i6]);
                count++;
            }
        }
        return pwd.toString();
    }

}

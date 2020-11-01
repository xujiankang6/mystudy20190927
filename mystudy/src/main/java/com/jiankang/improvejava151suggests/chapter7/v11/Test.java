package com.jiankang.improvejava151suggests.chapter7.v11;

/*
 *@create by jiankang
 *@date 2020/11/1 time 16:25
 */

public class Test  {



    public static void main(String[] args) throws Exception {
         AbsPopulator userPopulator = new UserPopulator();
         AbsPopulator jobPopulator = new JobPopulator();
         userPopulator.dataTinitialing();
        System.out.println("-------------------------");
        jobPopulator.dataTinitialing();
    }
}

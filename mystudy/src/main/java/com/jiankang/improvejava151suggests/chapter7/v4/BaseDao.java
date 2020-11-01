package com.jiankang.improvejava151suggests.chapter7.v4;

/*
 *@create by jiankang
 *@date 2020/10/30 time 15:14
 */

abstract class BaseDao<T> {
    private  Class<T> clz = Utils.getGenricClassType(getClass());


    public static void main(String[] args) {
         BaseDao userDao = new UserDao();
        System.out.println(Utils.getGenricClassType(userDao.clz));
    }

}

class UserDao extends BaseDao<String>{

}
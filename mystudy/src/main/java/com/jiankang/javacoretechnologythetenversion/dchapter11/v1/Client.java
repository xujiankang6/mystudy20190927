package com.jiankang.javacoretechnologythetenversion.dchapter11.v1;

/*
 *@create by jiankang
 *@date 2020/7/28 time 18:54
 */

import javax.naming.InitialContext;

public class Client {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        String url = "rmi://127.0.0.1:8888/";
        try {
            final InitialContext initialContext = new InitialContext();
            IService client = (IService) initialContext.lookup(url + "server");
            final Class<? extends IService> clientClass = client.getClass();
            System.out.println("server: "+clientClass.getName());
            final Class<?>[] interfaces = clientClass.getInterfaces();
            for (Class<?> anInterface : interfaces) {
                System.out.println("interface: "+anInterface.getName());
            }
            System.out.println(client.service("hello"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

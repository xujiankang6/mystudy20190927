package com.jiankang.javacoretechnologythetenversion.dchapter11.v1;

/*
 *@create by jiankang
 *@date 2020/7/28 time 18:51
 */

import javax.naming.InitialContext;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try{
            final IServiceImpl server = new IServiceImpl("server");
            LocateRegistry.createRegistry(8888);
            final InitialContext initialContext = new InitialContext();
            initialContext.rebind("rmi://127.0.0.1:8888/server",server);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("服务器注册一个远程服务器");
    }
}

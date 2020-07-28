package com.jiankang.javacoretechnologythetenversion.dchapter11.v2;

/*
 *@create by jiankang
 *@date 2020/7/28 time 20:01
 */

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) throws RemoteException, NamingException {
        final PersonServiceImpl personService = new PersonServiceImpl();
        LocateRegistry.createRegistry(6677);
        InitialContext namingContext = new InitialContext();
        namingContext.rebind("rmi://127.0.0.1:6677/PersonService/", personService);
        System.out.println("server start!");

    }
}

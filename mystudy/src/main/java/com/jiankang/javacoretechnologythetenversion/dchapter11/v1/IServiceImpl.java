package com.jiankang.javacoretechnologythetenversion.dchapter11.v1;

/*
 *@create by jiankang
 *@date 2020/7/28 time 18:43
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class IServiceImpl extends UnicastRemoteObject implements IService {

    @SuppressWarnings("unused")
    private String name;

    public IServiceImpl(String name) throws RemoteException {
        this.name = name;
    }


    @Override
    public String service(String content) throws RemoteException {
        return ">>>>>" + content;
    }
}

package com.jiankang.javacoretechnologythetenversion.dchapter11.v1;

/*
 *@create by jiankang
 *@date 2020/7/28 time 18:37
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IService extends Remote {

    public String service(String content) throws RemoteException;
}

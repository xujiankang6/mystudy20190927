package com.jiankang.javacoretechnologythetenversion.dchapter11.v2;

/*
 *@create by jiankang
 *@date 2020/7/28 time 19:50
 */


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;



public interface PersionService extends Remote {

    public List<Person> getPersonList(int n) throws RemoteException;

}

package com.jiankang.javacoretechnologythetenversion.dchapter11.v2;

/*
 *@create by jiankang
 *@date 2020/7/28 time 19:52
 */


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl extends UnicastRemoteObject implements PersionService {
    protected PersonServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public List<Person> getPersonList(int n) throws RemoteException {
        System.out.println("get persons");
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("a", 1));
        persons.add(new Person("b", 2));
        persons.add(new Person("c", 3));
        return persons;
    }
}

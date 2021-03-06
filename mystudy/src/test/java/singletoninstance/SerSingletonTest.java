package singletoninstance;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;


/*
 *@create by jiankang
 *@date 2019/9/30 time 12:00
 */


public class SerSingletonTest {


    @Test
    public  void test() throws IOException, ClassNotFoundException {
        singletoninstance.SerSingleton instance= singletoninstance.SerSingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(instance);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        singletoninstance.SerSingleton newInstance = (singletoninstance.SerSingleton) ois.readObject();
        Assert.assertEquals(instance,newInstance);
    }

}
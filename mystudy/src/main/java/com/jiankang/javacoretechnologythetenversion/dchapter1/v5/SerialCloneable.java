package com.jiankang.javacoretechnologythetenversion.dchapter1.v5;

/*
 *@create by jiankang
 *@date 2020/7/9 time 12:09
 */

import java.io.*;

public class SerialCloneable implements Cloneable, Serializable {

    public Object clone() {

            try {
            //save the object to a byte array
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bout);
            out.writeObject(this);
            out.close();

            //read a clone of the object from the byte array
            ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bin);
            Object ret = in.readObject();
            in.close();
            return ret;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

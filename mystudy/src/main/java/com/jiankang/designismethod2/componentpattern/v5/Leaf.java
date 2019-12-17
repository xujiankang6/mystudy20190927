package com.jiankang.designismethod2.componentpattern.v5;

/*
 *@create by jiankang
 *@date 2019/11/25 time 13:58
 */

import java.util.ArrayList;

public class Leaf extends Component {
    @Override
    public void add(Component component) throws  UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) throws UnsupportedOperationException{
    throw new UnsupportedOperationException("aa");
    }

    @Override
    public ArrayList<Component> getChildren() {
        return null;
    }
}

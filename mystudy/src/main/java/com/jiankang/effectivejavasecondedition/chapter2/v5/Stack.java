package com.jiankang.effectivejavasecondedition.chapter2.v5;

/*
 *@create by jiankang
 *@date 2019/12/31 time 11:57
 */

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACTITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACTITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;  //Eliminate obsolete reference
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        System.out.println(stack.size);

    }
}

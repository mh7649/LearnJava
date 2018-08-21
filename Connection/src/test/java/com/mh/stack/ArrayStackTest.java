package com.mh.stack;

import org.junit.Test;

public class ArrayStackTest {
    static ArrayStack<String> arrayStack;

    static {
        arrayStack = new ArrayStack<String>();
        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");
        arrayStack.push("4");
    }

    @Test
    public void push() {
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pick());
    }

    @Test
    public void search() {
        System.out.println(arrayStack.search("3"));
    }
}
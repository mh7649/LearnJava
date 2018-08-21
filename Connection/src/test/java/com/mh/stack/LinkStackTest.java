package com.mh.stack;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class LinkStackTest {

    private LinkStack<String> strStack;

    @Before
    public void setUp() throws Exception {
        strStack = new LinkStack<String>();
        strStack.push("1");
        strStack.push("2");
        strStack.push("3");
        strStack.push("4");
        strStack.push("5");
    }

    @Test
    public void peek() {
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack.peek());
    }

    @Test
    public void push() {
    }

    @Test
    public void isEmpty() {
    }
}
package com.mh.queue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayQueueTest {

    private ArrayQueue<String> strQueue;

    @Before
    public void setUp() {
        strQueue = new ArrayQueue<String>(10);
        strQueue.add("1");
        strQueue.add("2");
        strQueue.add("3");
        strQueue.add("4");
        strQueue.add("5");
    }

    @Test
    public void add() {
    }

    @Test
    public void peek() {
        System.out.println(strQueue.peek());
    }

    @Test
    public void dequeue() {
        System.out.println(strQueue.dequeue());
        System.out.println(strQueue.dequeue());
        System.out.println(strQueue.dequeue());
        System.out.println(strQueue.dequeue());
        strQueue.add("1");
        strQueue.add("2");
        strQueue.add("3");
        strQueue.add("4");
        strQueue.add("5");
        strQueue.add("6");
    }

    @Test
    public void isEmpty() {
    }
}
package com.mh.queue;


public class ArrayQueue<E> {

    private Object[] data;
    private int maxSize;
    private int front;
    private int rear;

    public ArrayQueue() {
        this(10);
    }

    public ArrayQueue(int initCapacity) {
        if (initCapacity > 0) {
            this.maxSize = initCapacity;
            data = new Object[initCapacity];
        } else {
            throw new RuntimeException("初始容量不能小于0");
        }
    }

    public boolean add(E e) {
        if (rear == maxSize) {
            throw new RuntimeException("队列已满");
        }
        data[rear++] = e;
        return true;
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return (E) data[front];
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        Object value = data[front];
        data[front++] = null;
        return (E) value;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void clear() {
        data = null;
        front = rear = 0;
    }
}

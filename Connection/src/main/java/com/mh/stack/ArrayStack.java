package com.mh.stack;

/**
 * 基于数组实现的顺序栈
 * https://www.cnblogs.com/CherishFX/p/4608880.html
 * @param <E> 元素类型
 * @author mh7649
 */
public class ArrayStack<E> {

    private Object[] data;

    private int maxSize;

    private int top = -1;

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int initCapacity) {
        if (initCapacity >= 0) {
            maxSize = initCapacity;
            data = new Object[maxSize];
            top = -1;
        } else {
            throw new RuntimeException("初始化大小不能小于0");
        }
    }

    public boolean push(E e) {
        if (top == maxSize - 1) {
            throw new RuntimeException("栈已满，无法将元素入栈");
        } else {
            data[++top] = e;
            return true;
        }
    }

    public E pop() {
        if (top == -1) {
            throw new RuntimeException("栈为空");
        } else {
            return (E) data[top--];
        }
    }

    public E pick() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        } else {
            return (E) data[top];
        }
    }

    public int search(E e) {
        int i = top;
        while (top != -1) {
            if (pick() != e) {
                top--;
            } else {
                break;
            }
        }
        int result = top + 1;
        top = i;
        return result;
    }

    public void clear() {
        data = null;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

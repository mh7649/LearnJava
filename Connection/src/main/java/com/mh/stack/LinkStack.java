package com.mh.stack;


/**
 * https://www.cnblogs.com/CherishFX/p/4608880.html
 * @param <E>
 */
public class LinkStack<E> {

    private Node<E> top;
    private int size;

    static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        Node<E> value = top;
        top = value.next;
        value.next = null;
        size--;
        return value.data;
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        return top.data;
    }

    public boolean push(E data) {
        top = new Node<E>(data, top);
        size ++;
        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        top = null;
        size = 0;
    }
}

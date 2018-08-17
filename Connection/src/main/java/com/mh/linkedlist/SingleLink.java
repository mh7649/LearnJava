package com.mh.linkedlist;

/**
 * Java实现列表
 *
 * @author mh7649
 */
public class SingleLink {
    private MyNode head;

    public void add(int data) {
        MyNode newNode = new MyNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        MyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void traverse() {
        MyNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void insert(int index, int data) {
        if (falseIndex(index)) {
            return;
        }
        MyNode insertNode = new MyNode(data);
        MyNode temp = head;
        int currentIndex = 0;
        while (temp != null) {
            if (currentIndex == index - 1) {
                MyNode nextNode = temp.next;
                temp.next = insertNode;
                insertNode.next = nextNode;
                temp = null;
                return;
            }
            temp = temp.next;
            currentIndex++;
        }
    }

    public MyNode get(int index) {
        if (falseIndex(index)) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        MyNode temp = head;
        int currIndex = 0;
        while (temp != null) {
            if (currIndex == index) {
                return temp;
            }
            currIndex++;
            temp = temp.next;
        }
        return temp;
    }

    public boolean remove(MyNode node) {
        if (node == null || node.next == null) {
            return  false;
        }
        node.data = node.next.data;
        node.next = node.next.next;
        return true;
    }

    public boolean remove(int index) {
        if (falseIndex(index)) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        MyNode temp = head;
        int currIndex = 0;
        while (temp != null) {
            if (currIndex == index - 1) {
                MyNode removeNode = temp.next;
                temp.next = removeNode.next;
                return true;
            }
            temp = temp.next;
            currIndex++;
        }
        return false;
    }

    private boolean falseIndex(int index) {
        if (index < 1 || index > length()) {
            System.out.println("错误的索引：" + index);
            return true;
        }
        return false;
    }

    public int length() {
        int length = 0;
        MyNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static void main(String[] args) {
        SingleLink singleLink = new SingleLink();
        singleLink.add(0);
        singleLink.add(1);
        singleLink.add(2);
        singleLink.add(3);
        singleLink.add(4);
        singleLink.add(5);
        singleLink.remove(singleLink.get(4));
        singleLink.traverse();
        //更多链表相关方法
        //https://blog.csdn.net/jianyuerensheng/article/details/51200274
    }

    public MyNode getHead() {
        return head;
    }

    static class MyNode {
        private int data;

        private MyNode next;

        public MyNode() {
        }

        public MyNode(int data) {
            this.data = data;
        }

        public MyNode(int data, MyNode next) {
            this.data = data;
            this.next = next;
        }

    }
}


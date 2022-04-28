package edu.kis.vh.nursery.list;

public class IntLinkedList {

    static class Node {

        private int value;
        private Node prev;
        public Node next;

        public Node(int i) {
            setValue(i);
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }


    private static final int EMPTY_LIST = -1;

    private Node last;
    private int i;


    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.setPrev(last);
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_LIST;
        return last.getValue();
    }


    public int pop() {
        if (isEmpty())
            return EMPTY_LIST;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    public Node getLast() {
        return last;
    }

}

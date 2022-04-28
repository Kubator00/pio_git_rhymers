package edu.kis.vh.nursery.list;

public class IntLinkedList {

    static class Node {

        private int value;
        private Node prev;
        public Node next;

        /**
         * This is constructor which set value of node
         *
         * @param i integer new value of node
         */
        public Node(int i) {
            setValue(i);
        }

        /**
         * This method is used to get value from node
         *
         * @return int value from node
         */
        public int getValue() {
            return value;
        }


        /**
         * This method is used to set value to node
         *
         * @param value int new value to set
         */
        public void setValue(int value) {
            this.value = value;
        }

        /**
         * This method is used to get previous node
         *
         * @return Node previous
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * This method is used to set previous node
         *
         * @param prev Node to set
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }


    private static final int EMPTY_LIST = -1;

    private Node last;


    /**
     * This method is used to add integer to the list.
     *
     * @param i integer to add
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.setPrev(last);
            last = last.next;
        }
    }

    /**
     * This method is used to check if the list is empty
     *
     * @return boolean false if list is empty otherwise true
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * This method is used to check if the list is full
     *
     * @return boolean false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * This method is used to get top value of the list
     *
     * @return int last value of the list or value of EMPTY_LIST
     */
    public int top() {
        if (isEmpty())
            return EMPTY_LIST;
        return last.getValue();
    }


    /**
     * This method is used to remove last element of the list
     *
     * @return int last element of the list or value of EMPTY_LIST
     */
    public int pop() {
        if (isEmpty())
            return EMPTY_LIST;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * This method is used to get last node from the list
     *
     * @return Node  last element of the list
     */
    public Node getLast() {
        return last;
    }

}

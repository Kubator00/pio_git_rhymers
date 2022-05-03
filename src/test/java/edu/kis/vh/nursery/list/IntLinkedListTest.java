package edu.kis.vh.nursery.list;

import junit.framework.TestCase;

public class IntLinkedListTest extends TestCase {
    private static final int EMPTY_LIST = -1;

    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        int[] testValues = {3, 2, 4};
        for (int testValue : testValues)
            list.push(testValue);

        assertEquals(testValues[2], list.getLast().getValue());
        assertEquals(testValues[1], list.getLast().getPrev().getValue());
        assertEquals(testValues[0], list.getLast().getPrev().getPrev().getValue());
    }

    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        int testValue = 2;

        assertTrue(list.isEmpty());
        list.push(testValue);
        assertFalse(list.isEmpty());
    }

    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        int testValue = 2;

        assertFalse(list.isFull());
        list.push(testValue);
        assertFalse(list.isEmpty());
    }

    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        int[] testValues = {1, 2, 3};

        int result = list.top();
        assertEquals(EMPTY_LIST, result);

        for (int testValue : testValues)
            list.push(testValue);

        result = list.top();
        assertEquals(testValues[2], result);
    }

    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        int[] testValues = {3, 2, 4};
        for (int testValue : testValues)
            list.push(testValue);

        int result;
        for (int i = testValues.length - 1; i >= 0; i--) {
            result = list.pop();
            assertEquals(testValues[i], result);
        }

        result = list.pop();
        assertEquals(EMPTY_LIST, result);
    }
}
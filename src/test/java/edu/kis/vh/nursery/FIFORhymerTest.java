package edu.kis.vh.nursery;

import junit.framework.TestCase;
import org.junit.Assert;

public class FIFORhymerTest extends TestCase {
    final int EMPTY_STACK_VALUE = -1;

    public void testCountOut() {
        FIFORhymer rhymer = new FIFORhymer();

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int[] testValues = {6, 3, 5, 3};
        for (int value : testValues)
            rhymer.countIn(value);

        for (int testValue : testValues) {
            result = rhymer.countOut();
            Assert.assertEquals(testValue, result);
        }

        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }
}
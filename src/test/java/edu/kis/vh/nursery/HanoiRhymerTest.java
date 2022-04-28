package edu.kis.vh.nursery;

import junit.framework.TestCase;
import org.junit.Assert;

public class HanoiRhymerTest extends TestCase {

    public void testReportRejected() {
        HanoiRhymer rhymer = new HanoiRhymer();

        int[] testValues = {6, 3, 4, 5};
        int expectedRejected = 2;
        for (int testValue : testValues)
            rhymer.countIn(testValue);

        Assert.assertEquals(expectedRejected, rhymer.reportRejected());
    }

    public void testCountIn() {
        HanoiRhymer rhymer = new HanoiRhymer();

        int[] testValues = {6, 3, 4, 5};

        for (int testValue : testValues)
            rhymer.countIn(testValue);

        int result = rhymer.countOut();
        Assert.assertEquals(testValues[1], result);
        result = rhymer.countOut();
        Assert.assertEquals(testValues[0], result);
    }
}
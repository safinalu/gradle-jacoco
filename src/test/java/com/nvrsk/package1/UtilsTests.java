package com.nvrsk.package1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilsTests {

    @Test
    void calcSumTest() {
        assertEquals(3, Utils.calcSum(1, 2));
    }

    @Test
    void returnOneTest() {
        assertEquals("one", Utils.returnOne());
    }

    @Test
    void returnTwo() {
//        missed Utils.returnTwo() function invocation
//        Utils.returnTwo();
    }
}
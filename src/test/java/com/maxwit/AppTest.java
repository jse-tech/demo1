package com.maxwit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        var ver = System.getProperty("java.version");
        System.out.println(ver);
        Assert.assertTrue(true);
    }
}

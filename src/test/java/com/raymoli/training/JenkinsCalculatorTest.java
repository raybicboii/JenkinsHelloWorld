package com.raymoli.training;

import org.junit.Assert;
//import org.junit.Test;
import org.testng.annotations.Test;

public class JenkinsCalculatorTest {

    private JenkinsCalculator jenkinsCalculator = new JenkinsCalculator();

    @Test
    public void addNumbers() {
        Assert.assertEquals(8, jenkinsCalculator.addNumbers(5, 3));
    }

    @Test
    public void subtractNumbers() {
        Assert.assertEquals(9, jenkinsCalculator.subtractNumbers(16, 7));
    }
}
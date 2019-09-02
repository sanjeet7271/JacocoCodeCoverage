package com.CodeCoverage;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMessageBuilder {
	@Test
    public void testNameMkyong() {

        MessageBuilder obj = new MessageBuilder();
        Assert.assertEquals("Hello mkyong", obj.getMessage("mkyong"));

    }

}

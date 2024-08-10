package org.thyron;

import org.testng.annotations.Test;

public class Test1
{
    @Test(dependsOnGroups = {"setup"})
    public void testMethod1()
    {
        System.out.println("TestMethod1");
    }
}

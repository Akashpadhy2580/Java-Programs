package org.thyron;

import org.testng.annotations.Test;

public class Test2
{
    @Test(dependsOnGroups = {"setup"})
    public void testMethod2()
    {
        System.out.println("TestMethod2");
    }
}

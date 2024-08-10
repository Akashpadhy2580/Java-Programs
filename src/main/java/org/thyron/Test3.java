package org.thyron;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3
{
    @Test(groups = {"setup"})
    public void testMethod3()
    {
        System.out.println("TestMethod3");
    }
}

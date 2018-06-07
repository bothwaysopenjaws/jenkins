package test;

import application.Application;
import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
    @Test
    public void testAdd() {
        int i = 2;
        int j = 3;

        Application application = new Application();

        int k = application.add(i,j);

        Assert.assertEquals("not good", k, 5);

    }

}

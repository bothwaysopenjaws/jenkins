package Test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ApplicationTest {
    @Test
    public void testAdd() {
        int i = 2;
        int j = 3;

        int k = Application.add(i,j);

        Assert.assertEquals("not good", k, 5);

    }

}

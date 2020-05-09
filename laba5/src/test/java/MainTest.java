import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainTest {
    private final double EPS = 1e-9;

    @Test
    public void testMinimum() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            list.add(i);

        Assert.assertEquals(0, Main.minimum(0, 1, list), EPS);
    }

    @Test
    public void testNull() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            list.add(i);
        Assert.assertEquals(null, Main.minimum(0, 7, list));
    }
}

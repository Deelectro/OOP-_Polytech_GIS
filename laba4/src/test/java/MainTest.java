import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    public void testSwap() {
        List<String> strings = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add("строчка " + i);
            strings2.add("строчка " + i);
        }

        Assert.assertNotEquals(strings2, Main.swap(1, 4, strings));
    }

    @Test
    public void testSwap2() {
        List<Integer> integers = new ArrayList<>();
        List<Integer> integers2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
            integers2.add(i);
        }

        Main.swap(-1, 4, integers);
        Assert.assertEquals(integers, integers2);
    }
}

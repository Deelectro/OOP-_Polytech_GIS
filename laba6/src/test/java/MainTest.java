import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    private final double EPS = 1e-9;

    @Test
    public void testsum() {
        Main main = new Main();
        Assert.assertEquals(10, main.sum(5, 5), EPS);
    }

}

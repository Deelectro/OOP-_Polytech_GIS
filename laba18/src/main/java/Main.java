import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        BigInteger x = new BigInteger("8444444444444444444");
        BigInteger y = new BigInteger("9000000000000000000");

        BigInteger z = avg(x, y);
        System.out.println(z);
    }

    public static BigInteger avg(BigInteger a, BigInteger b) {
        BigInteger c;
        BigInteger div = new BigInteger("2");

        c = a.add(b);
        c = c.divide(div);

        return c;
    }
}

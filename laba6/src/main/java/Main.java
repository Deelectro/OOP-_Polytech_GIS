public class Main implements Calculator{
    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.sum(1,2));
    }
}

public class Main {
    public static void main(String[] args) {
        min(5,1,-2);
    }

    public static void min(int a, int b, int c) {
        int min = a;

        if (min > b || min > c) {
            if (b > c) {
                min = c;
            } else {
                min = b;
            }
        }
        System.out.println(min);
    }
}

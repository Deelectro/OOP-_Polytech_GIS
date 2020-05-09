import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int SIZE = 5;
        int[] array = new int[SIZE];

        fill(array);

        simpleSwap(1,4, array);

        System.out.println(Arrays.toString(array));
    }

    public static boolean simpleSwap(int i, int j, int[] anArray) {
        if (i < anArray.length && j < anArray.length) {
            if (i > -1 && j > -1) {
                int temp = anArray[i];
                anArray[i] = anArray[j];
                anArray[j] = temp;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void fill(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = i;
        }
    }

}

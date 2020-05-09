import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    final static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            integers.add(random.nextInt(1000));
        }

        System.out.println(integers + "\n Минимальное значение: " + minimum(1, 3, integers));
    }

    public static <T extends Comparable<T>> T minimum (int begin, int end, List<T> list) {
        List<T> sublist;

        if (begin < end && begin > -1 && end < list.size()) {
            sublist = new ArrayList<>(list.subList(begin, end));

            T min = sublist.get(0);

            for (T element: sublist)
                if (min.compareTo(element) > 0)
                    min = element;

            return min;
        } else {
            return null;
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            stringList.add("Новая строчка " + i);
        }
        swap(1, 2, stringList);

        for (String string: stringList)
            System.out.println(string);
    }

    public static <T> List<T> swap(int i, int j, List<T> list){

        if (i > -1 && j > -1 && i < list.size() && j < list.size()) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        return list;
    }
}

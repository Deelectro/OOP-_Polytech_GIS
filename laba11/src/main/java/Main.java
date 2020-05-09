import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new LinkedList<>();

        people.add(new Person("Илья", "Патюк", 19));
        people.add(new Person("Ирина", "Аркадьева", 55));
        people.add(new Person("Ирина", "Аркадьева", 36));
        people.add(new Person("Айседора", "Дункан", 50));
        people.add(new Person("Сергей", "Есенин", 30));

        Collections.sort(people);
        System.out.println(people);
    }
}

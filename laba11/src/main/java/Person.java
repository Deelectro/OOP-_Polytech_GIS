public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{ имя = '" + name + "\' фамилия = '" + surname + "'\', возраст = " + age + '}';
    }

    @Override
    public int compareTo(Person o) {
        int result = this.getName().compareTo(o.getName());
        if (result == 0) {
            result = this.getSurname().compareTo(o.getSurname());
            if (result == 0) {
                if (this.age > o.getAge()) { return 1; }
                else if (this.age < o.getAge()) { return -1; }
                else { return 0; }
            }
        }
        return result;
    }
}

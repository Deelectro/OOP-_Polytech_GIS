import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SpaceShip s1 = new SpaceShip(123);
        SpaceShip s2 = new SpaceShip(12);
        SpaceShip s3 = new SpaceShip(1);

        List<SpaceShip> spaceships = new LinkedList<>();

        spaceships.add(s1);
        spaceships.add(s2);
        spaceships.add(s3);

        averageSpeed(spaceships);
        minimumSpeed(spaceships);
    }

    public static void averageSpeed(List<SpaceShip> spaceships) {
        double sum = 0.0;
        for (SpaceShip ship: spaceships)
            sum += ship.getSpeed();
        System.out.println("Средняя скорость кораблей: " + sum / spaceships.size());
    }

    public static void minimumSpeed(List<SpaceShip> spaceships) {
        int min = spaceships.get(0).getSpeed();
        for (SpaceShip ship: spaceships) {
            if (ship.getSpeed() < min)
                min = ship.getSpeed();
        }
        System.out.println("Минимальная скорость кораблей: " + min);
    }

}

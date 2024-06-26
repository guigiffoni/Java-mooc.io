package Oop;

public class HealthStation {
    private int times = 0;

    public int weight(Person person) {
        times++;

        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weightings() {
        return times;
    }
}

package Objectception;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personList;

    public Room() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public boolean isEmpty() {
        if (this.personList.size() > 0) {
            return false;
        }

        return true;
    }

    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }

        Person shortest = personList.get(0);

        for (Person person : personList) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }

        return shortest;
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }

        Person shortest = this.shortest();
        this.personList.remove(shortest);

        return shortest;
    }

    public ArrayList<Person> getPersons() {
        return this.personList;
    }
}

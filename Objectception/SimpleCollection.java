package Objectception;

import java.util.ArrayList;

public class SimpleCollection {
    private ArrayList<String> stringList = new ArrayList<>();

    public SimpleCollection(String value) {

    }

    public void add(String value) {
        stringList.add(value);
    }

    private String foo() {
        int listLength = this.stringList.size();

        if (listLength == 0) {
            return "collection empty";
        }

        if (listLength == 1) {
            return "collection has 1 element\n";
        }

        if (listLength > 1) {
            return "collection has " + listLength + " elements\n";
        }
        
        return null;
    }

    public String longest() {
        if (this.stringList.isEmpty()) {
            return null;
        }

        String longest = "";

        for (String string: stringList) {
            if (longest.length() < string.length()) {
                longest = string;
            }
        }

        return longest;
    }

    @Override
    public String toString() {
        String acc = this.foo();

        for (String bar: stringList) {
            acc += bar + "\n";
        }

        return acc;
    }
}

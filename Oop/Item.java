package Oop;

public class Item {
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }

        if (compare instanceof Item == false) {
            return false;
        }

        Item comparedItem = (Item) compare;
        return comparedItem.identifier.equals(this.identifier);
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}

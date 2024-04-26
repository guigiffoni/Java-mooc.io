package Objectception;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private int weight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.weight = 0;
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int itemWeight = item.getWeight();

        if (itemWeight + this.weight < this.maxWeight) {
            this.weight += itemWeight;
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return this.weight;
    }

    public Item heaviestItem() {
        Item heaviest = this.items.get(0);

        for (Item item : this.items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        int itemLength = this.items.size();

        if (itemLength == 1) {
            return itemLength + " item (" + this.weight + " kg)";
        }
        
        if (itemLength > 1) {
            return itemLength + " items (" + this.weight + " kg)";
        }

        return null;
    }
}

package Objectception;

import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> suitcaseList;

    public Hold(int maxWeight) {
        this.totalWeight = 0;
        this.maxWeight = maxWeight;
        this.suitcaseList = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight + suitcase.totalWeight() < this.maxWeight) {
            suitcaseList.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcaseList) {
            for (Item item : suitcase.getItems()) {
                System.out.println(item);
            }
        }
    }

    @Override
    public String toString() {
        return this.suitcaseList.size() + " suitcases (" + this.totalWeight + " kg)";
    }
}

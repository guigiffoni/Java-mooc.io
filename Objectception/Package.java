package Objectception;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();

    public Package() {}

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int weight = 0;

        for (Gift gift: gifts) {
            weight += gift.getWeight();
        }

        return weight;
    }
}

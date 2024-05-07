package Objectception;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJokes() {
        int repertoir = this.jokes.size();

        if (repertoir == 0) {
            return "jokes are short in supply";
        }

        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(repertoir);

        return this.jokes.get(index);
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}

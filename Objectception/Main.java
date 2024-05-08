package Objectception;

public class Main {
    public static void main(String[] args) {
        JokeManager manager = new JokeManager();

        TextUserInterface ui = new TextUserInterface(manager);
        ui.start();
    }
}

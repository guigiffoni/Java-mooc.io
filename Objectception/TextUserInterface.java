package Objectception;

import FileShenanigans.AskInput;

public class TextUserInterface {
    private JokeManager manager;
    private AskInput asker;

    public TextUserInterface(JokeManager manager) {
        this.manager = manager;
        this.asker = new AskInput();
    }

    private void listCommands() {
        System.out.println("commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }

    public void start() {
        while (true) {
            this.listCommands();
            String input = this.asker.question("");

            if (input.equals("X")) {
                break;
            }

            switch (input) {
                case "1":
                    this.manager.addJoke(this.asker.question("joke to add: "));

                    break;
                case "2":
                    System.out.println(this.manager.drawJokes());
                    break;
                case "3":
                    this.manager.printJokes();
                    break;
                default:
                    break;
            }
        }
    }
}

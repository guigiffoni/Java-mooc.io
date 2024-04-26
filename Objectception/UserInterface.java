package Objectception;

import FileShenanigans.AskInput;

public class UserInterface {
    private TodoList todos;
    private AskInput input;

    public UserInterface(TodoList todos) {
        this.todos = todos;
        this.input = new AskInput();
    }

    public void start() {
        while (true) {
            String command = this.input.question("command: ");

            if (command.equals("stop")) {
                this.input.close();

                break;
            }

            if (command.equals("add")) {
                String task = this.input.question("to add: ");
                this.todos.add(task);

                continue;
            }

            if (command.equals("list")) {
                this.todos.print();

                continue;
            }

            if (command.equals("remove")) {
                int toRemove = Integer.parseInt(this.input.question("which one to remove? "));

                this.todos.remove(toRemove);

                continue;
            }
        }
    }
}

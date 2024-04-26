package FileShenanigans;

import java.util.Scanner;

public class AskInput {
    private Scanner scanner;

    public AskInput() {
        this.scanner = new Scanner(System.in);
    }

    public String question(String questionString) {
        System.out.print(questionString);

        return this.scanner.nextLine();
    }

    public void close() {
        this.scanner.close();
    }
}

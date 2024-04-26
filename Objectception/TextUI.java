package Objectception;

import FileShenanigans.AskInput;

public class TextUI {
    private SimpleDictionary dictionary;
    private AskInput input;

    public TextUI(SimpleDictionary dictionary) {
        this.input = new AskInput();
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            String command = this.input.question("command: ");

            if (command.equals("end")) {
                System.out.println("bye");
                this.input.close();

                break;
            }

            if (command.equals("add")) {
                String newWord = this.input.question("word: ");
                String newTranslation = this.input.question("translation: ");

                this.dictionary.add(newWord, newTranslation);

                continue;
            }

            if (command.equals("search")) {
                String wordSearched = this.input.question("to be translated: ");

                String translation = this.dictionary.translate(wordSearched);

                if (translation == null) {
                    System.out.println("word " + wordSearched + " was not found");

                    continue;
                }
                
                System.out.println("translation: " + translation);
                continue;
            }

            System.out.println("nada");
        }
    }
}

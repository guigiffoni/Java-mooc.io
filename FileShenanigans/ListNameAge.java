package FileShenanigans;

import java.nio.file.Paths;
import java.util.Scanner;

public class ListNameAge {
    public static void main(String[] args) {
        String fileName = new AskInput().question("name of the file: ");

        try {
            Scanner file = new Scanner(Paths.get("FileShenanigans/" + fileName));

            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] nameAge = line.split(",");

                System.out.println(nameAge[0] + ", age: " + nameAge[1] + " years");
            }

            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

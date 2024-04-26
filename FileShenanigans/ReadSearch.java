package FileShenanigans;

import java.nio.file.Paths;
import java.util.Scanner;

public class ReadSearch {
    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);
        System.out.print("Name of the file: ");
        String fileName = foo.nextLine();

        System.out.print("Search for: ");
        String name = foo.nextLine();
        foo.close();

        try {
            Scanner fileScanner = new Scanner(Paths.get("FileShenanigans/" + fileName));
            
            while (fileScanner.hasNextLine()) {
                if (fileScanner.nextLine().equals(name)) {
                    System.out.println("found!");

                    break;
                }

                if (fileScanner.hasNextLine() == false) {
                    System.out.println("not found.");

                    break;
                }
            }

            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Couldn't read the file " + fileName);
        }

        foo.close();
    }
}

package FileShenanigans;

import java.nio.file.Paths;
import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        AskInput input = new AskInput();

        String fileName = input.question("file? ");
        int low = Integer.parseInt(input.question("lower bound? "));
        int upper = Integer.parseInt(input.question("upper bound? "));

        try {
            Scanner file = new Scanner(Paths.get("FileShenanigans/" + fileName));
            int matches = 0;
            
            while (file.hasNextLine()) {
                int currentNumber = file.nextInt();
                
                if (currentNumber >= low && currentNumber <= upper) {
                    matches++;
                }
            }

            System.out.println("Numbers: " + matches);
            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        input.close();
    }
}

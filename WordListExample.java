import java.util.ArrayList;

public class WordListExample {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        
        System.out.println(strings);
        
        removeLast(strings);
        removeLast(strings);
        
        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        strings.remove(strings.size() - 1);
    }

    public static int sum(ArrayList<Integer> numbers) {
        int total = 0;

        for (int number: numbers) {
            total += number;
        }

        return total;
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number: numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

    public static void print(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}

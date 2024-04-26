public class ArrayShenanigans {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};

        printNeatly(numbers);
        printArrayInStars(numbers);
    }

    public static void printArrayInStars(int[] array) {
        for (int item: array) {
            for (int i = 0; i < item; i++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

    public static void printNeatly(int[] array) {
        String acc = "";
        for (int item: array) {
            acc += item + ", ";
        }

        System.out.println(acc.substring(0, acc.length() - 2));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int total = 0;

        for (int item: array) {
            total += item;
        }

        return total;
    }

    public static final int[] swapArray(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];

        numbers[index1] = numbers[index2];
        numbers[index2] = temp; 

        return numbers;
    }
}

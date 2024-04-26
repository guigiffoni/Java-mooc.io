public class ProgramStructure {
    public static void main(String[] args) {
        System.out.println(greatest(3, 6));
    }

    public static int greatest(int number1, int number2) {
        if ((number1 - number2) <= 0) {
            return number2;
        } else {
            return number1;
        }
    }

    public static int smallest(int number1, int number2) {
        if ((number1 - number2) <= 0) {
            return number1;
        } else {
            return number2;
        }
    }

    public static String word() {
        return "mundo";
    }

    public static int numberUno() {
        return 1;
    }

    public static void divisibleByThreeInRage(int beginning, int end) {
        for (int i = 0; i < end - beginning + 1; i++) {
            if ((beginning + i) % 3 == 0) {
                System.out.println(beginning + i);
            }
        }
    }

    public static void division(float numerator, float denominator) {
        System.out.println(numerator / denominator);
    }

    public static void printFromNumberToOne(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(number - i);
        }
    }

    public static void printUntilNumber(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(i + 1);
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}

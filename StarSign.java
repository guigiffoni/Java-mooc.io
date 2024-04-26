public class StarSign {
    public static void printStars(int number) {
        String str = "";
        for (int i = 0; i < number; i++) {
            str += "*";
        }

        System.out.println(str);
    }

    public static void printSpaces(int number) {
        String str = "";
        for (int i = 0; i < number; i++) {
            str += " ";
        }

        System.out.print(str);
    }

    public static void printSquare(int number) {
        for (int i = 0; i < number; i++) {
            printStars(number);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            printStars(i + 1);
        }
    }

    public static void main(String[] args) {
        printSpaces(4);
    }
}
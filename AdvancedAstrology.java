public class AdvancedAstrology {    
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

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            printStars(i + 1);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 0; i < height; i++) {
            printSpaces(height - i - 1);
            printStars(i * 2 + 1);
        }

        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        christmasTree(10);
    }
}

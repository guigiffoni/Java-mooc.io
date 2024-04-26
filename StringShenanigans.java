import java.util.Scanner;

public class StringShenanigans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] foo = {
            {"alex", "sunshine"},
            {"emma", "haskell"}
        };

        System.out.print("enter username: ");
        String user = scanner.nextLine();

        System.out.print("enter password: ");
        String pass = scanner.nextLine();

        int i = 0;
        while (i < foo.length) {
            if (foo[i][0].equals(user) && foo[i][1].equals(pass)) {
                System.out.println("You have successfully logged in!");

                break;
            }

            if (++i == foo.length) {
                System.out.println("Incorrect username or password!");
            }
        }

        scanner.close();
    }
}

package FileShenanigans;

import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        AskInput foo = new AskInput();
    
        String fileName = foo.question("file: ");
        String team = foo.question("team: ");

        try (Scanner file = new Scanner(Paths.get("FileShenanigans/" + fileName))) {
            int gameCount = 0;
            int winCount = 0;
            int loseCount = 0;

            while (file.hasNextLine()) {
                String[] dados = file.nextLine().split(",");
                int jogo1 = Integer.parseInt(dados[2]);
                int jogo2 = Integer.parseInt(dados[3]);

                if (dados[0].equals(team)) {
                    if (jogo1 > jogo2) {
                        winCount++;
                    } else {
                        loseCount++;
                    }

                    gameCount++;
                }

                if (dados[1].equals(team)) {
                    if (jogo1 < jogo2) {
                        winCount++;
                    } else {
                        loseCount++;
                    }

                    gameCount++;
                }
            }

            System.out.println("games: " + gameCount);
            System.out.println("wins: " + winCount);
            System.out.println("losses: " + loseCount);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

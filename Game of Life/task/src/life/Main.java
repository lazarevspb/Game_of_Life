package life;

import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  height = scanner.nextInt();
        int  width = scanner.nextInt();
        boolean[][] bArea = new boolean[height][height];

        initmap(bArea,width);
        printMap(bArea);

    }

    private static void printMap(boolean[][] bArea) {
        for (int i = 0; i < bArea.length; i++) {
            for (int j = 0; j < bArea[i].length; j++) {
                if (bArea[i][j] == true){
                    System.out.print('O');
                }else {
                    System.out.print(" ");
                }

            }
            System.out.printf("\n");
        }
    }

    private static void initmap(boolean[][] bArea, int width) {
        Random random = new Random(width);
        for (int i = 0; i < bArea.length; i++) {
            for (int j = 0; j < bArea[i].length; j++) {
                bArea[i][j] = random.nextBoolean();
            }
        }
    }
}

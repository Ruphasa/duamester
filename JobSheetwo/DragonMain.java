package JobSheetwo;

import java.util.Scanner;
import java.util.Random;

public class DragonMain {
    public static void main(String[] args) {

        String option;
        Scanner sc = new Scanner(System.in);
        Dragon dragon1 = new Dragon();
        for (int i = 0; i < dragon1.map.length; i++) {
            for (int j = 0; j < dragon1.map.length; j++) {
                dragon1.map[i][j] = "   ";
            }
        }
        Random random = new Random();
        dragon1.x = random.nextInt(5);
        dragon1.y = random.nextInt(5);
        dragon1.width = random.nextInt(5, 9);
        dragon1.height = random.nextInt(5, 9);
        dragon1.map[dragon1.y][dragon1.x] = " ^ ";
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            dragon1.printPosition();
            System.out.println("Where you want to go?");
            System.out.println("s. Move Down");
            System.out.println("w. Move Up");
            System.out.println("a. Move Left");
            System.out.println("d. Move Right");
            option = sc.nextLine();
            switch (option) {
                case "s":
                    dragon1.moveDown();
                    break;
                case "w":
                    dragon1.moveUp();
                    break;
                case "a":
                    dragon1.moveLeft();
                    break;
                case "d":
                    dragon1.moveRight();
                default:
                    continue;
            }
        } while (dragon1.gameOver == false);
    }
}

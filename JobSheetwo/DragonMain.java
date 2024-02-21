package JobSheetwo;

import java.util.Scanner;
import java.util.Random;

public class DragonMain {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        Dragon dragon1 = new Dragon();
        Random random = new Random();
        dragon1.x = random.nextInt(10);
        dragon1.y = random.nextInt(10);
        dragon1.width = random.nextInt(10, 20);
        dragon1.height = random.nextInt(10, 20);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            dragon1.printPosition();
            System.out.println("Where you want to go?");
            System.out.println("1. Move Down");
            System.out.println("2. Move Up");
            System.out.println("3. Move Left");
            System.out.println("4. Move Right");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    dragon1.moveDown();
                    break;
                case 2:
                    dragon1.moveUp();
                    break;
                case 3:
                    dragon1.moveLeft();
                    break;
                case 4:
                    dragon1.moveRight();
                default:
                    continue;
            }
        } while (dragon1.gameOver==false);
    }
}

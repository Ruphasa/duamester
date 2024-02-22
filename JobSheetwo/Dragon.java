package JobSheetwo;

public class Dragon {

    int x, y, width, height;
    boolean gameOver;
    String map[][] = new String[10][10];

    void moveLeft() {
        if (x - 1 < 0) {
            detectCollision(y, x);
        } else if (map[y][x - 1].equals(" * ")) {
            System.out.println("You have been here!");
        } else {
            map[y][x] = " * ";
            x--;
            map[y][x] = " ^ ";

        }
    }

    void moveRight() {
        if (x + 1 > width) {
            detectCollision(y, x);
        } else if (map[y][x + 1].equals(" * ")) {
            System.out.println("You have been here!");
        } else {
            map[y][x] = " * ";
            x++;
            map[y][x] = " ^ ";
        }
    }

    void moveUp() {
        if (y - 1 < 0) {
            detectCollision(y, x);
        } else if (map[y - 1][x].equals(" * ")) {
            System.out.println("You have been here!");
        } else {
            map[y][x] = " * ";
            y--;
            map[y][x] = " ^ ";
        }
    }

    void moveDown() {
        if (y + 1 > height) {
            detectCollision(y, x);
        } else if (map[y + 1][x].equals(" * ")) {
            System.out.println("You have been here!");
        } else {
            map[y][x] = " * ";
            y++;
            map[y][x] = " ^ ";
        }
    }

    void printPosition() {
        System.out.println("+------------------------------+");
        for (int i = 0; i < map.length; i++) {
            System.out.print("|");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.print("|\n");
        }
        System.out.println("+------------------------------+");
        System.out.println("(" + y + "," + x + ")");
    }

    void detectCollision(int x, int y) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("+------------------------------+");
        for (int i = 0; i < map.length; i++) {
            System.out.print("|");
            for (int j = 0; j < map[i].length; j++) {
                if (i>=height||j>=width) {
                    System.out.print(" X ");
                }else{
                    System.out.print(map[i][j]);
                }
            }
            System.out.print("|\n");
        }
        System.out.println("+------------------------------+");
        System.out.println("GAME OVER ~");
        gameOver = true;
    }
}

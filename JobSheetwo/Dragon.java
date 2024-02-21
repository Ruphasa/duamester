package JobSheetwo;

public class Dragon {

    int x, y, width, height;
    boolean gameOver;

    void moveLeft(){
        x++;
        if (x>width) {
            detectCollision(x, y);
        }
    }
    void moveRight(){
        x--;
        if (x<0) {
            detectCollision(x, y);
        }
    }

    void moveUp(){
        y--;
        if (y<0) {
            detectCollision(x, y);
        }
    }

    void moveDown(){
        y++;
        if (y>height) {
            detectCollision(x, y);
        }
    }

    void printPosition(){
        System.out.println("("+x+","+y+")");
    }

    void detectCollision(int x,int y){
        System.out.println("GAME OVER ~");
        gameOver=true;
    }
}

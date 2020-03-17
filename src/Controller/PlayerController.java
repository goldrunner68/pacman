package Controller;

import javafx.scene.input.KeyEvent;

public class PlayerController {
    private int dx;
    private int dy;
    private int x = 40;
    private int y = 60;
    private int w;
    private int h;


    public PlayerController() {
    }

    public void move() {

        x += dx;
        y += dy;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public int getWidth() {

        return w;
    }

    public int getHeight() {

        return h;
    }



    public void keyPressed(KeyEvent e) {


    }

    public void keyReleased(KeyEvent e) {

    }
}

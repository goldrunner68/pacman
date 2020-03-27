package Controller;

import javafx.scene.Scene;
import view.PlayerPacman;


public class ClavierFleche {
    private static int valY, valX;
    private PlayerPacman palyer;

    private Scene scene;

    public ClavierFleche(Scene scene) {
        this.scene = scene;
    }

    public ClavierFleche() {
    }

    public static void deplacmentSprite(Scene scene) {

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    valY = valY + 1;
                    System.out.println(" getValY " +getValY() );
                    break;
                case DOWN:
                    valY = valY - 1;
                    System.out.println(" getValY " +getValY() );
                    break;
                case LEFT:
                    valX = valX - 1;
                    setValX(valX);
                    System.out.println(" getValX " +getValX() );
                    break;
                case RIGHT:
                    valX = valX + 1;
                    setValX(valX);
                    System.out.println(" getValX " +getValX() );
                    break;
                default:

            }
        });

    }

    public static int getValY() {
        return valY;
    }

    public  void setValY(int valY) {
    }

    public static int getValX() {

        return valX;
    }

    public static void setValX(int valX) {

    }
}

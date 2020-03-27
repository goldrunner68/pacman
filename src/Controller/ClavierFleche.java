package Controller;

import javafx.scene.Group;
import javafx.scene.Scene;
import view.PlayerPacman;


public class ClavierFleche extends PlayerPacman {
    private static int valY, valX;
    private PlayerPacman palyer;

    private Scene scene;

    public ClavierFleche(Group root, PlayerPacman palyer, Scene scene) {
        super(root);
        this.palyer = palyer;
        this.scene = scene;
    }

    public static void deplacmentSprite(Scene scene) {

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    valY = valY + 1;

                    System.out.println(" getValY " + getValKeyUP_DOWN_pos_Y());
                    break;
                case DOWN:
                    valY = valY - 1;
                    System.out.println(" getValY " + getValKeyUP_DOWN_pos_Y());
                    break;
                case LEFT:
                    valX = valX - 1;
                    setValX(valX);

                    System.out.println(" getValX " + getValKeyLEFT_RIGHT_pos_X());
                    break;
                case RIGHT:
                    valX = valX + 1;
                    setValX(valX);
                    System.out.println(" getValX " + getValKeyLEFT_RIGHT_pos_X());
                    break;
                default:

            }
        });

    }

    public static int getValKeyUP_DOWN_pos_Y() {
        //incremente ou decremente quand clavier KEY_UP ou KEY_DOWN
        return valY;
    }

    public void setValY(int valY) {
    }

    public static int getValKeyLEFT_RIGHT_pos_X() {
//incremente ou decremente la valeur KEY_LEFT ou KEY_RIGHT
        return valX;
    }

    public static void setValX(int valX) {

    }
}

package view;


import Controller.Clavier;
import javafx.scene.Group;
import javafx.scene.image.ImageView;


public class PacmanSprite<valeurX> {
    private Group root;
    private ImageView puckman;
    private int playerControllerX, playerControllerY;
    private int index = 10;
    private Clavier clavier;
    private int valeurX;


    public PacmanSprite(Group root, int playerControllerX, int playerControllerY) {
        this.root = root;
        this.playerControllerX = playerControllerX;
        this.playerControllerY = playerControllerY;

    }

    public double getPlayerControllerX() {
        setPlayerControllerX(valeurX);
        return playerControllerX;
    }

    public void setPlayerControllerY() {
        this.playerControllerY = 500;

    }

    public void setPlayerControllerX(int valeurX) {
        this.playerControllerX = valeurX;

    }

    public double getPlayerControllerY() {
        setPlayerControllerY();
        return playerControllerY;
    }


}

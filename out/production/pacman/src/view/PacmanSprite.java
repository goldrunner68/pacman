package view;
import Controller.ClavierFleche;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;


public class PacmanSprite {
    private Group root;
    private ImageView puckman;
    private int playerControllerX, playerControllerY;

    private ClavierFleche clavierFleche;// retour des valeurs fleche int


    public PacmanSprite(Group root, int playerControllerX, int playerControllerY) {
        this.root = root;
        this.playerControllerX = playerControllerX;
        this.playerControllerY = playerControllerY;

    }
    public void setPlayerControllerX() {


        this.playerControllerX =500;

    }

    public void setPlayerControllerY() {
        this.playerControllerY = 500;

    }

    public int getPlayerControllerX() {
        setPlayerControllerX();
        return playerControllerX;
    }

    public int getPlayerControllerY() {
        setPlayerControllerY();
        return playerControllerY;
    }



}

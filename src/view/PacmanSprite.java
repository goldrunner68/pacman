package view;
import javafx.scene.Group;
import javafx.scene.image.ImageView;


public class PacmanSprite<valeurX> {
    private Group root;
    private ImageView puckman;
    private int playerControllerX, playerControllerY;
    private int valeurX;


    public PacmanSprite(Group root, int playerControllerX, int playerControllerY) {
        this.root = root;
        this.playerControllerX = playerControllerX;
        this.playerControllerY = playerControllerY;

    }

    public int getPlayerControllerX() {
        setPlayerControllerX();
        return playerControllerX;
    }

    public int getPlayerControllerY() {
        setPlayerControllerY();
        return playerControllerY;
    }

    public void setPlayerControllerX() {
        this.playerControllerX = 500;

    }

    public void setPlayerControllerY() {
        this.playerControllerY = 500;

    }


}

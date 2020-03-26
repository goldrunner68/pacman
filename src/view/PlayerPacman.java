package view;



import javafx.scene.Group;
import javafx.scene.image.ImageView;

import static Controller.ClavierFleche.getValX;


public class PlayerPacman {
    private Group root;
    private ImageView puckman;
    private int playerControllerX,playerControllerY;


    public PlayerPacman(Group root, int playerControllerX, int playerControllerY) {
        this.root = root;
        this.playerControllerX = 500;
        this.playerControllerY = 500;
        loadImage();
    }


    public void loadImage() {
        puckman= new  ImageView("src/Asset/Images/puckman.png");
        puckman.setX(getPlayerControllerX());
        puckman.setY(getPlayerControllerY());
        puckman.setFitWidth(64);
        puckman.setFitHeight(64);
        root.getChildren().add(puckman);
    }
    public void setPlayerControllerX() {

    }

    public void setPlayerControllerY() {

    }

    public double getPlayerControllerX() {

        return playerControllerX;
    }

    public double getPlayerControllerY() {

        return playerControllerY;
    }


}

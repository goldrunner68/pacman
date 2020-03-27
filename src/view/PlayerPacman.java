package view;

import javafx.scene.Group;
import javafx.scene.image.ImageView;


public class PlayerPacman {
    private Group root;
    private int playerControllerX,playerControllerY;


    public PlayerPacman(Group root) {
        this.root = root;
        loadImage();
    }

    public void loadImage() {
        ImageView puckman = new ImageView("src/Asset/Images/puckman.png");
        puckman.relocate(getPlayerControllerX(), getPlayerControllerY());//getteur pour la position du pacman
        puckman.setTranslateX(getPlayerControllerX());
        puckman.setTranslateY(getPlayerControllerY());
        puckman.setFitWidth(64);
        puckman.setFitHeight(64);
        root.getChildren().add(puckman);
    }

    public void setPlayerControllerY(int playerControllerY) {
        this.playerControllerY = playerControllerY;
    }

    public int getPlayerControllerX() {//valeur pour la position du pacman

        return playerControllerX;
    }

    public void setPlayerControllerX(int playerControllerX) {
        this.playerControllerX = playerControllerX;
    }

    public int getPlayerControllerY() {//valeur pour la position du pacman
        return playerControllerY;
    }


}

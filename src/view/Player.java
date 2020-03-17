package view;

import Controller.PlayerController;
import javafx.scene.Group;
import javafx.scene.image.ImageView;


public class Player {
    private Group root;
    private ImageView puckman;
    private PlayerController playerController;

    public Player(Group root, PlayerController playerController) {
        this.root = root;
        this.playerController = playerController;
        loadImage();
    }

    void loadImage() {

        puckman= new  ImageView("src/Asset/Images/puckman.png");
        puckman.setX(50);
        puckman.setY(50);
        puckman.setFitWidth(64);
        puckman.setFitHeight(64);
        root.getChildren().add(puckman);
    }


}

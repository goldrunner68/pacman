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
        puckman.setFitWidth(64);
        puckman.setFitHeight(64);
        root.getChildren().add(puckman);
    }
    public void setPlayerControllerX() {

    }

    public void setPlayerControllerY() {
    }


    public int getPlayerControllerX() {//valeur pour la position du pacman
        return playerControllerX;
    }

    public int getPlayerControllerY() {//valeur pour la position du pacman
        return playerControllerY;
    }


}

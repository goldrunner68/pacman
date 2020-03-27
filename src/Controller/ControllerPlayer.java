package Controller;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import model.Sprite;
import view.ViewHandler;
import view.ViewJeu;

public class ControllerPlayer {


    private final Scene scene;
    private final Group root;
    private Text score;
    private int index =0;
    private ImageView pacman;
    public ControllerPlayer(ViewHandler viewHandler, ViewJeu viewJeu, Scene scene, Group root) {
        this.scene = scene;
        this.root = root;
        this.scene.setOnKeyPressed(e -> {//controle clavier
            switch (e.getCode()) {
                case UP:
                    pacman = new ImageView("src/Asset/Images/puckman.png");
                    pacman.setTranslateX(500);
                    pacman.setTranslateY(500);
                    pacman.setFitWidth(64);
                    pacman.setFitHeight(64);
                    root.getChildren().add(pacman);
                case DOWN:
                    break;
                case LEFT:

                    System.out.println(index);
                    break;
                case RIGHT:

                    break;
                default:

            }
        });
    }

}
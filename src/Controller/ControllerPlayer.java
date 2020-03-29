package Controller;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ControllerPlayer {


    private final Scene scene;
    private final Group root;

    private Text score;
    private int index;
    private double axeX;
    private double axeY;
    private ImageView pacman;

    public ControllerPlayer(Scene scene, Group root) {
        this.scene = scene;
        this.root = root;
        pacman = new ImageView("src/Asset/Images/puckman.png");
        root = new Group(pacman);
        this.scene.setOnKeyPressed(e -> {//controle clavier
            switch (e.getCode()) {
                case UP:
                    break;
                case DOWN:
                    break;
                case LEFT:
                    axeX = axeX - 1;
                    moveLEFT(axeX);
                    break;
                case RIGHT:
                    System.out.println("fleche");
                    axeX = axeX + 1;
                    moveRIGHT(axeX);
                    break;
                default:

            }
        });


    }


    public void moveRIGHT(double axeX) {
        this.axeX = axeX;

    }

    public void moveLEFT(double axeX) {
        this.axeX = axeX;


    }
}

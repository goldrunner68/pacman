package view;

import Controller.Clavier;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import model.Model;

import java.util.ArrayList;

public class ViewJeu {
    private Group root;
    private ImageView imageDeFond, pacman;
    private ArrayList<Integer> niveau1;
    private Model univers;
    private Text score, timeLaps;
    private PacmanSprite player;
    private int playerControllerX, playerControllerY;
    private Clavier clavier;
    private PacmanSprite pacmanSprite;

    //


    public ViewJeu(Group root) {
        this.root = root;
        initBackground();
        scoreAffichage();
        timeAffichage();
        loadImage();
        setVueJeu();

    }

    private void initBackground() {
        univers = new Model(root, niveau1);// le tableau du niveau construit
        imageDeFond = new ImageView("Asset/Images/pacmanFondInGame.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imageDeFond.setFitHeight((int) primaryScreenBounds.getHeight());
        imageDeFond.setFitWidth((int) primaryScreenBounds.getWidth());
        player = new PacmanSprite(root, playerControllerX, playerControllerY);//le sprite pacman

    }
    public void scoreAffichage(){

        score = new Text("SCORE : 00000");
        score.setFont(Font.font ("Verdana", 30));
        score.setFill(Color.GREEN);
        score.setX(680);
        score.setY(150);
    }

    public void timeAffichage() {
        timeLaps = new Text("TIME LAPS: 00000");
        timeLaps.setFont(Font.font("Verdana", 30));
        timeLaps.setFill(Color.GREEN);
        timeLaps.setX(970);
        timeLaps.setY(150);
    }

    public void loadImage() {
        pacman = new ImageView("src/Asset/Images/puckman.png");
        pacmanSprite = new PacmanSprite(root, playerControllerX, playerControllerY);
        pacman.setX(pacmanSprite.getPlayerControllerX());
        pacman.setY(pacmanSprite.getPlayerControllerY());
        pacman.setFitWidth(64);
        pacman.setFitHeight(64);

    }


    public void setVueJeu() {
        root.getChildren().clear();
        root.getChildren().add(imageDeFond);
        root.getChildren().add(score);
        root.getChildren().add(timeLaps);
        univers.constructionLevel();// le tableau du niveau construit
        root.getChildren().add(pacman);


        }


}

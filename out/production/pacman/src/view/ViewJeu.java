package view;


import Controller.ControllerPlayer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import model.Model;

import java.util.ArrayList;

public class ViewJeu {

    private ViewHandler viewHandler;
    private  ViewJeu viewJeu;
    private Group root;
    private ImageView imageDeFond;
    private ImageView pacman;
    private ArrayList<Integer> niveau1;
    private Model univers;
    private Text score, timeLaps;
    private Scene scene;
    private int valx, valy;


    //


    public ViewJeu(Group root) {
        this.root = root;
        initBackground();
        scoreAffichage();
        timeAffichage();
        setVueJeu();
    }

    private void initBackground() {
        univers = new Model(root,niveau1);// le tableau du niveau construit
        imageDeFond = new ImageView("Asset/Images/pacmanFondInGame.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imageDeFond.setFitHeight((int) primaryScreenBounds.getHeight());
        imageDeFond.setFitWidth((int) primaryScreenBounds.getWidth());

    }
    public void scoreAffichage(){

        score = new Text("SCORE : 00000");
        score.setFont(Font.font ("Verdana", 30));
        score.setFill(Color.GREEN);
        score.setX(680);
        score.setY(150);
   }
    public void timeAffichage(){

        System.out.println();
        timeLaps = new Text();

        timeLaps.setText("time");
        timeLaps.setFont(Font.font ("Verdana", 30));
        timeLaps.setFill(Color.GREEN);
        timeLaps.setX(970);
        timeLaps.setY(150);
    }

    public void setVueJeu() {
        root.getChildren().clear();
        root.getChildren().add(imageDeFond);
        root.getChildren().add(score);
        root.getChildren().add(timeLaps);
        univers.constructionLevel();// le tableau du niveau construit

    }

        }












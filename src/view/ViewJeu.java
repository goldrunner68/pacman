package view;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import model.Chrono;
import model.Model;
import javafx.scene.text.*;


import java.util.ArrayList;
import java.util.Timer;

public class ViewJeu {
    private Group root;
    private ImageView imageDeFond,boule,brique;
    private ArrayList<Integer> niveau1;
    private Model univers;
    private Text score,timeLaps;
    private Timer timer;
    private Player player;


    //


    public ViewJeu(Group root, ViewHandler viewHandler) {
        Jeu jeu = new Jeu();
        this.root = root;
        initBackground();
        scoreAffichage();
        timeAffichage();
        afficherJeu();
    }




    private void initBackground() {
        univers = new Model(root,niveau1);
        imageDeFond = new ImageView("Asset/Images/pacmanFondInGame.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imageDeFond.setFitHeight((int) primaryScreenBounds.getHeight());
        imageDeFond.setFitWidth((int) primaryScreenBounds.getWidth());

    }
    public void scoreAffichage(){
        Chrono chrono = new Chrono();
        score = new Text("SCORE : 00000");
        score.setFont(Font.font ("Verdana", 30));
        score.setFill(Color.GREEN);
        score.setX(680);
        score.setY(150);
   }
    public void timeAffichage(){
        timeLaps = new Text( "TIME LAPS: 00000");
        timeLaps.setFont(Font.font ("Verdana", 30));
        timeLaps.setFill(Color.GREEN);
        timeLaps.setX(970);
        timeLaps.setY(150);
    }


    public void afficherJeu() {
        root.getChildren().clear();
        root.getChildren().add(imageDeFond);
        root.getChildren().add(score);
        root.getChildren().add(timeLaps);
        univers.constructionLevel();



        }










}

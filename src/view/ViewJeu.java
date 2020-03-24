package view;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import model.Model;
import javafx.scene.text.*;


import java.util.ArrayList;

public class ViewJeu {
    private Group root;
    private ImageView imageDeFond;
    private ArrayList<Integer> niveau1;
    private Model univers;
    private Text score,timeLaps;
    private Player player;
    private int playerControllerX,playerControllerY;

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
        player = new Player(root,playerControllerX,playerControllerY);//le sprite pacman
    }
    public void scoreAffichage(){

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


    public void setVueJeu() {
        root.getChildren().clear();
        root.getChildren().add(imageDeFond);
        root.getChildren().add(score);
        root.getChildren().add(timeLaps);
        univers.constructionLevel();// le tableau du niveau construit
        player.loadImage();//le sprite pacman


        }










}

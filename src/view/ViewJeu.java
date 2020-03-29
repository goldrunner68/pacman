package view;


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
    private ViewJeu viewJeu;
    private Group root;
    private ImageView imageDeFond;
    private ImageView pacman;
    private ArrayList<Integer> niveau1;
    private Model univers;
    private Text score, timeLaps;
    private Scene scene;

    private double cp;
    private double axeX, axeY;
    private static double minX = 670;
    private static double minY = 364;
    private static double maxX = 1246;
    private static double maxY = 812;
    private double moveX;
    private double moveY;

    //


    public ViewJeu(Group root, Scene scene) {
        this.root = root;
        this.scene = scene;
        initBackground();
        scoreAffichage();
        timeAffichage();
        personnage();
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

    public void timeAffichage() {

        System.out.println();
        timeLaps = new Text();
        timeLaps.setText("time");
        timeLaps.setFont(Font.font("Verdana", 30));
        timeLaps.setFill(Color.GREEN);
        timeLaps.setX(970);
        timeLaps.setY(150);
    }

    public void personnage() {// affichage, controlle et deplacement

        moveX = minX + (axeX * 8);
        moveY = minY + (axeY * 8);
        pacman = new ImageView("src/Asset/Images/puckman.png");
        pacman.relocate(moveX, moveY);
        scene.setOnKeyPressed(e -> {//controle clavier

            switch (e.getCode()) {
                case UP:
                    if (moveY >= minY) {
                        axeY--;
                        moveY = minY + (axeY * 8);
                    }
                    System.out.println(moveY);
                    break;
                case DOWN:
                    if (moveY <= maxY) {
                        axeY++;
                        moveY = minY + (axeY * 8);
                    }
                    System.out.println(moveY);
                    break;
                case LEFT:
                    if (moveX >= minX) {
                        axeX--;
                        moveX = minX + (axeX * 8);
                    }
                    System.out.println(moveX);
                    break;
                case RIGHT:
                    if (moveX <= maxX) {
                        axeX++;
                        moveX = minX + (axeX * 8);
                    }
                    System.out.println(moveX);

                    break;
                default:

            }
            pacman.relocate(moveX, moveY);
        });


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












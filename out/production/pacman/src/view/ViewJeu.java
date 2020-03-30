package view;


import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import model.CarteDuMonde;

import java.util.ArrayList;

public class ViewJeu {


    private ViewHandler viewHandler;
    private ViewJeu viewJeu;
    private Group root;
    private ImageView imageDeFond;
    private ImageView pacman;
    private ArrayList<Integer> niveau1;
    private CarteDuMonde univers;
    private Text score, timeLaps;
    private Scene scene;

    private double cp;
    private double axeX, axeY;
    private static double minX = 670;
    private static double minY = 560;//entree perso
    private static double maxX = 1246;
    private static double maxY = 812;
    private double moveX;
    private double moveY;
    private String url = "src/Asset/Images/puckman.png";
    private Image pac;
    private  ImageView boule;
    //


    public ViewJeu(Group root, Scene scene) {
        this.root = root;
        this.scene = scene;
        initBackground();
        scoreAffichage();
        timeAffichage();
        personnage();
        setVueJeuRoot();

    }

    private void initBackground() {
        univers = new CarteDuMonde(root,niveau1);// le tableau du niveau construit
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
        pac = new Image(url);
        pacman = new ImageView(pac);
        pacman.relocate(moveX, moveY);
        scene.setOnKeyPressed(e -> {//controle clavier

            switch (e.getCode()) {
                case UP:
                    if (moveY >= 364) {
                        axeY--;
                        url = "src/Asset/Images/puckmanHaut.png";
                        pacman.setImage(new Image(url));//change image

                    }
                    moveY = minY + (axeY * 8);
                    moveX = minX + (axeX * 8);
                    pacman.relocate(moveX, moveY);
                    break;
                case DOWN:
                    if (moveY <= maxY) {
                        axeY++;
                        url = "src/Asset/Images/puckmanBas.png";
                        pacman.setImage(new Image(url));//change image

                    }
                    moveY = minY + (axeY * 8);
                    moveX = minX + (axeX * 8);
                    pacman.relocate(moveX, moveY);
                    break;

                case LEFT:
                        axeX--;
                        url = "src/Asset/Images/puckmanGauche.png";
                        pacman.setImage(new Image(url));//change image
                        if (((moveX % 670) == 0)) {
                            moveX=1246;
                            axeX=0;

                    }
                    moveY = minY + (axeY * 8);
                    moveX = minX + (axeX * 8);
                    pacman.relocate(moveX, moveY);
                    break;

                case RIGHT:
                        axeX++;
                        url = "src/Asset/Images/puckmanDroite.png";
                        pacman.setImage(new Image(url));//change image
                    if (((moveX % maxX) == 0)) {
                      moveX =minX;
                      axeX =0;
                    }
                    moveY = minY + (axeY * 8);
                    moveX = minX + (axeX * 8);
                    pacman.relocate(moveX, moveY);
                    break;


            }

                    System.out.println("moveX "+moveX+" ");

        }

        );


    }

    public void setVueJeuRoot() {
        root.getChildren().clear();
        root.getChildren().add(imageDeFond);
        root.getChildren().add(score);
        root.getChildren().add(timeLaps);
        univers.constructionLevel();// le tableau du niveau construit
        root.getChildren().add(pacman);

    }

        }












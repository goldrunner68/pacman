package view;



import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
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
    private Text score, timeLaps;
    private Scene scene;
    private double cp;
    private CarteDuMonde univers;
    private double moveX=670,moveY=560;
    private int maxX=1246;
    private int minX=670;
    private int minY=500;
    private int maxY=900;
    private int vitessePacman=8;

    private String url = "src/Asset/Images/puckman.png";
    private Image pac;
    private ImageView boule;
    private Rectangle rectangle;
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
        univers = new CarteDuMonde(root, niveau1);// le tableau du niveau construit
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

        pac = new Image(url);
        pacman = new ImageView(pac);
        pacman.relocate(moveX, moveY);
        scene.setOnKeyPressed(e -> {//controle clavier

            switch (e.getCode()) {
                case UP:

                    moveY-=vitessePacman;
                    if (moveY<424){
                        moveY=752;
                    }
                        url = "src/Asset/Images/puckmanHaut.png";
                        pacman.setImage(new Image(url));//change image

                    break;

                case DOWN:
                    moveY+=vitessePacman;
                    if (moveY>752){
                        moveY=424;
                    }
                        url = "src/Asset/Images/puckmanBas.png";
                        pacman.setImage(new Image(url));//change image

                    break;

                case LEFT:

                   moveX-=vitessePacman;
                    if (moveX<minX){
                        moveX=maxX;
                    }
                    url = "src/Asset/Images/puckmanGauche.png";
                    pacman.setImage(new Image(url));//change image

                    break;

                case RIGHT:
                  moveX+=vitessePacman;
                 if (moveX>maxX){
                     moveX=minX;
                 }
                    url = "src/Asset/Images/puckmanDroite.png";
                    pacman.setImage(new Image(url));//change image

                    break;
            }

                    pacman.relocate(moveX, moveY);
                    System.out.println(moveX+" "+moveY);
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












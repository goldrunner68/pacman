package view;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;
import model.Model;

import java.util.ArrayList;

public class ViewJeu {
    private Group root;
    private Jeu jeu;
    private ImageView imageDeFond,boule,brique;
    private ArrayList niveau1;
    private Model univers;


    //


    public ViewJeu(Group root, ViewHandler viewHandler) {

        jeu = new Jeu();
        this.root = root;

        initBackground();
        afficherJeu();
    }

    private void initBackground() {
        univers = new Model(root,imageDeFond,niveau1);
        imageDeFond = new ImageView("Asset/Images/pacmanFondInGame.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imageDeFond.setFitHeight((int) primaryScreenBounds.getHeight());
        imageDeFond.setFitWidth((int) primaryScreenBounds.getWidth());


    }

    public void afficherJeu() {
        root.getChildren().clear();
        root.getChildren().add(imageDeFond);
        univers.constructionLevel();


        }










}

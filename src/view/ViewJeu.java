package view;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class ViewJeu {
    private Group root;
    private ViewHandler viewHandler;
    private ImageView spritePacman;
    private Jeu jeu;
    private ImageView imageDeFond;
    private double vitesse = 10;

    public ViewJeu(Group root, ViewHandler viewHandler) {
        jeu = new Jeu();
        this.root = root;
        this.viewHandler = viewHandler;

        initBackground();
        afficherJeu();
    }
    private void initBackground() {
        imageDeFond = new ImageView("Asset/Images/pacmanFondInGame.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imageDeFond.setFitHeight((int) primaryScreenBounds.getHeight());
        imageDeFond.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    public void afficherJeu() {
        root.getChildren().clear();
        root.getChildren().addAll(imageDeFond);

        }




    public void moveBareLeft() {
        spritePacman.setX(spritePacman.getX() - vitesse);
    }

    public void moveBareRight() {
        spritePacman.setX(spritePacman.getX() + vitesse);
    }





}
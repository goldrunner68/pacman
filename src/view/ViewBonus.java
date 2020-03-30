package view;

import Controller.ControllerMenuBonus;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class ViewBonus {
    private Group root;
    private Scene scene;
    private ImageView imageDeBonus, affichePub;
    private Button jouer;
    private Text option;
    private Text bonus;
    private Text histoire;
    private Button quitter;


    public ViewBonus(Group root) {
        this.root = root;
        initBackground();
        texteMenuBonus();
        historyAffichage();
        setVueOption();

    }

    private void initBackground() {

        imageDeBonus = new ImageView("src/Asset/Images/imageBonus.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imageDeBonus.setFitHeight((int) primaryScreenBounds.getHeight());
        imageDeBonus.setFitWidth((int) primaryScreenBounds.getWidth());

    }

    public void historyAffichage() {
        affichePub = new ImageView("src/Asset/Images/1.png");
        affichePub.setX(100);
        affichePub.setY(0);
    }

    private void texteMenuBonus() {

        jouer = new Button("Jouer");
        jouer.setLayoutX(1200);
        jouer.setLayoutY(300);
        jouer.setStyle(" -fx-font: 50px Tahoma;" +
                "-fx-background-radius: 20;");
        ///


        ////
        quitter = new Button("Quitter");
        quitter.setLayoutX(1200);
        quitter.setLayoutY(700);
        quitter.setStyle(" -fx-font: 50px Tahoma;" +
                "-fx-background-radius: 20;");


        ////

    }

    public void setVueOption() {
        root.getChildren().clear();
        root.getChildren().add(imageDeBonus);
        root.getChildren().add(jouer);
        root.getChildren().add(affichePub);
        root.getChildren().add(quitter);

    }

    public Button getLancerJeu() {
        return jouer;
    }


    public Button getLancerQuitter() {
        return quitter;
    }

    void setEvents(ControllerMenuBonus controllerMenuBonus) {
        jouer.setOnMouseClicked(controllerMenuBonus);

        quitter.setOnMouseClicked(controllerMenuBonus);
    }
}

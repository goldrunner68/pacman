package view;

import Controller.ControllerMenu;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;

import java.io.File;

public class ViewMenu {
    private Group root;
    private ImageView imgBg;
    private Button jouer, bonus, quitter;
    private Image titre;
    private Menu menu;

    public ViewMenu(Group root, Menu menu) {
        this.root = root;
        this.menu = menu;
        initBackground();
        texteMenu();
        musicMenu();
    }

    private void initBackground() {
        imgBg = new ImageView("Asset/Images/wallpaper-pacman.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imgBg.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBg.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    private void texteMenu() {


        titre = new Image("Asset/Images/pacman_h7qq3c34.gif");


        ///
        jouer = new Button("Jouer",new ImageView(titre));;
        jouer.setLayoutX(1200);
        jouer.setLayoutY(100);
        jouer.setStyle(" -fx-font: 50px Tahoma;" +
                "-fx-background-color:BLACK;"+
                "-fx-text-fill: white;"+
                "-fx-background-radius: 20;");
        ///

        /////
        bonus = new Button("Bonus");
        bonus.setLayoutX(1200);
        bonus.setLayoutY(500);
        bonus.setStyle(" -fx-font: 50px Tahoma;" +
                "-fx-background-color:BLACK;"+
                "-fx-text-fill: white;"+
                "-fx-background-radius: 20;");

        ////
        quitter = new Button("Quitter");
        quitter.setLayoutX(1200);
        quitter.setLayoutY(700);
        quitter.setStyle(" -fx-font: 50px Tahoma;" +
                "-fx-background-color:BLACK;"+
                "-fx-text-fill: white;"+
                "-fx-background-radius: 20;");
        ////


        ////

    }

    private void musicMenu() {

    }

    public void setVueMenuRoot() {
        root.getChildren().clear();
        final File file = new File("src/Asset/Sons/pacman_beginning.wav");
        final Media media = new Media(file.toURI().toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        MediaView mediaView = new MediaView(mediaPlayer);
        root.getChildren().add(mediaView);
        root.getChildren().addAll(imgBg);

        root.getChildren().add(jouer);
        root.getChildren().add(bonus);
        root.getChildren().add(quitter);

    }

    public Button getLancerJeu() {
        return jouer;
    }


    public Button getLancerOption() {
        return bonus;
    }

    public Button getLancerQuitter() {
        return quitter;
    }

    void setEvents(ControllerMenu controllerMenu){
        jouer.setOnMouseClicked(controllerMenu);
        bonus.setOnMouseClicked(controllerMenu);
        quitter.setOnMouseClicked(controllerMenu);
    }
}

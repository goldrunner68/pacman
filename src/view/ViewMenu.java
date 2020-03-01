package view;

import Controller.ControllerMenu;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Menu;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;

import java.io.File;

public class ViewMenu {
    private Group root;
    private ImageView imgBg;
    private Text jouer, option, quitter, titre,bonus;
    private Menu model;

    public ViewMenu(Group root, Menu model) {
        this.root = root;
        this.model = model;
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

    private void texteMenu(){


        titre = new Text(1000, 100, "PACMAN");

        titre.setStyle(" -fx-font: 100px Tahoma;-fx-fill: " +
                "linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
                "-fx-stroke: black;");

        ///
        jouer = new Text(1300, 300,"Jouer");
        jouer.setStyle(" -fx-font: 50px Tahoma;-fx-fill: " +
                "linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
                "-fx-stroke: black;");
        ///
        option = new Text(1300, 500, "Options");
        option.setStyle(" -fx-font: 50px Tahoma;-fx-fill: " +
                "linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
                "-fx-stroke: black;");
        /////
        bonus = new Text(1300, 700, "Bonus");
        bonus.setStyle(" -fx-font: 50px Tahoma;-fx-fill: " +
                "linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
                "-fx-stroke: black;");
        ////
        quitter = new Text(1300, 900, "Quitter");
        quitter.setStyle(" -fx-font: 50px Tahoma;-fx-fill: " +
                "linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
                "-fx-stroke: black;");
        ////


        ////

    }
    private void musicMenu(){

    }
    void setVueCompletMenu(){
        root.getChildren().clear();
        final File file = new File("src/Asset/Sons/pacman_beginning.wav");
        final Media media = new Media(file.toURI().toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        MediaView mediaView = new MediaView(mediaPlayer);
        root.getChildren().add(mediaView);
        root.getChildren().addAll(imgBg);
        root.getChildren().add(titre);
        root.getChildren().add(jouer);
        root.getChildren().add(option);
        root.getChildren().add(bonus);
        root.getChildren().add(quitter);

    }
    public Text getLancerJeu() {
        return jouer;
    }


    public Text getLancerOption(){
        return option;
    }
    public Text getLancerQuitter(){
        return quitter;
    }

    void setEvents(ControllerMenu controllerMenu){
        jouer.setOnMouseClicked(controllerMenu);
        option.setOnMouseClicked(controllerMenu);
        quitter.setOnMouseClicked(controllerMenu);
    }
}

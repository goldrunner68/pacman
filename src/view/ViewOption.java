package view;

import Controller.ControllerMenu;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class ViewOption {
    private Group root;
    private Scene scene;
    private ImageView imageDeBonus;
    private Text jouer;
    private Text option;
    private Text bonus;
    private Text quitter;

    public ViewOption(Group root) {
        this.root = root;
        initBackground();
        texteMenu();
        setVueOption();
    }

    private void initBackground() {

        imageDeBonus = new ImageView("src/Asset/Images/imageBonus.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imageDeBonus.setFitHeight((int) primaryScreenBounds.getHeight());
        imageDeBonus.setFitWidth((int) primaryScreenBounds.getWidth());

    }

    private void texteMenu() {

        jouer = new Text(1300, 300, "Jouer");
        jouer.setStyle(" -fx-font: 50px Tahoma;-fx-fill: " +
                "linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
                "-fx-stroke: black;");
        ///
        option = new Text(1300, 500, "Options");
        option.setStyle(" -fx-font: 50px Tahoma;-fx-fill: " +
                "linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
                "-fx-stroke: black;");
        /////

        ////
        quitter = new Text(1300, 900, "Quitter");
        quitter.setStyle(" -fx-font: 50px Tahoma;-fx-fill: " +
                "linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);" +
                "-fx-stroke: black;");
        ////


        ////

    }

    public void setVueOption() {
        root.getChildren().clear();
        root.getChildren().add(imageDeBonus);
        root.getChildren().add(jouer);
        root.getChildren().add(option);
        root.getChildren().add(quitter);

    }

    public Text getLancerJeu() {
        return jouer;
    }


    public Text getLancerOption() {
        return option;
    }

    public Text getLancerQuitter() {
        return quitter;
    }

    void setEvents(ControllerMenu controllerMenu) {
        jouer.setOnMouseClicked(controllerMenu);
        option.setOnMouseClicked(controllerMenu);
        quitter.setOnMouseClicked(controllerMenu);
    }
}

package view;

import Controller.ControllerMenu;
import Controller.ControllerPlayer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ViewHandler extends Application {

    private final static int WIDTH = 800;
    private Stage primaryStage;
    private ViewMenu viewMenu;
    private ViewJeu viewJeu;
    private ViewOption viewOption;


    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
        int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();
        Group root = new Group();
        Scene scene = new Scene(root, screenWidth, screenHeight, Color.BLACK);

        Menu menu = new Menu();
        this.viewMenu = new ViewMenu(root, menu);
        viewJeu = new ViewJeu(root);
        viewOption = new ViewOption(root);
        ControllerMenu controllerMenu = new ControllerMenu(this, menu);
        ControllerMenu controllerOption = new ControllerMenu(this, menu);
        ControllerPlayer controllerPlayer = new ControllerPlayer(this, viewJeu, scene, root);

        //controllerJeu = new ControllerJeu(this);
        afficherMenuPrincipal();
        Music.playMainMenuMusic();
        primaryStage.setTitle("Pacman");
        primaryStage.setResizable(false);
        primaryStage.setFullScreen(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    //Getters et Setters
    public void setEventHandlerMenu(ControllerMenu controllerMenu) {
        viewMenu.setEvents(controllerMenu);

    }


    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void afficherMenuPrincipal() {
        viewMenu.setVueMenu();
    }

    public void setVueJeu() {
        viewJeu.setVueJeu();
    }

    public void setVueOption() {
        viewOption.setVueOption();
    }

    public ViewMenu getViewMenu() {
        return viewMenu;
    }

    public ViewJeu getViewJeu() {
        return viewJeu;
    }

    public ViewOption getViewOption() {
        return viewOption;
    }


}

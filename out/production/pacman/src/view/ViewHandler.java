package view;

import Controller.ControllerMenu;
import Controller.ControllerMenuBonus;
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
    private ViewBonus viewBonus;


    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
        int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();
        Group root = new Group();
        Scene scene = new Scene(root, screenWidth, screenHeight, Color.BLACK);

        Menu menu = new Menu();
        this.viewMenu = new ViewMenu(root, menu);
        viewJeu = new ViewJeu(root, scene);
        viewBonus = new ViewBonus(root);
        ControllerMenu controllerMenu = new ControllerMenu(this, menu);
        ControllerMenuBonus controllerMenuBonus = new ControllerMenuBonus(this, menu);
////////////////////////////////////////
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
    public void setEventHandlerMenuBonus(ControllerMenuBonus controllerMenuBonus) {
        viewBonus.setEvents(controllerMenuBonus);


    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }


    public void afficherMenuPrincipal() {
        viewMenu.setVueMenuRoot();
    }

    public void afficherJeu() {
            System.out.println("clic btn jeu ");
viewJeu.setVueJeuRoot();
    }

    public void setVueOption() {
        System.out.println("clic btn option");
        viewBonus.setVueOption();
    }

    public ViewMenu getVueMenu() {
        return viewMenu;
    }

    public ViewJeu getVueJeu() {
        return viewJeu;
    }

    public ViewBonus getVueBonus() {
        return viewBonus;
    }


}

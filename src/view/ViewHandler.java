package view;

import Controller.Clavier;
import Controller.ControllerMenu;
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
    private ViewMenu menu;
    private ViewJeu viewJeu;
    private Clavier clavier;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
        int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();
        Group root = new Group();
        Scene scene = new Scene(root, screenWidth, screenHeight, Color.BLACK);
        Clavier.deplacmentSprite(scene);//controle fleche
        Menu menu = new Menu();
        this.menu = new ViewMenu(root,menu);
        viewJeu = new ViewJeu(root);

        ControllerMenu controllerMenu = new ControllerMenu(this, menu);
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
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void afficherMenuPrincipal(){
        menu.setVueMenu();

    }
    public void setVueJeu(){
        viewJeu.setVueJeu();
    }


    public ViewMenu getMenu() {
        return menu;
    }

    public ViewJeu getViewJeu(){
        return viewJeu;
    }

    public void setEventHandlerMenu(ControllerMenu controllerMenu){
        menu.setEvents(controllerMenu);

    }



}

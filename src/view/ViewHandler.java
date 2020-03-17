package view;

import Controller.ControllerKeyboard;
import Controller.ControllerMenu;
import Controller.ControllerOption;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class ViewHandler extends Application {

    private final static int WIDTH = 800;

    private Stage primaryStage;
    private Group root2;
    private Scene scene;
    private ViewMenu menu;
    private ViewJeu viewJeu;
    private Jeu jeu;
    private ImageView paddle;



    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
        int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();
        Group root = new Group();
        Scene scene = new Scene(root, screenWidth, screenHeight, Color.BLACK);
        Menu model = new Menu();
        menu = new ViewMenu(root, model);

        viewJeu = new ViewJeu(root,this);
        jeu = new Jeu();
        ControllerMenu controllerMenu = new ControllerMenu(this, model);

        //controllerJeu = new ControllerJeu(this);
        afficherMenuPrincipal();
        Music.playMainMenuMusic();
        primaryStage.setTitle("Pacman");
        primaryStage.setResizable(false);
        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void afficherMenuPrincipal(){

        menu.setVueCompletMenu();
        ControllerKeyboard controllerKeyboard = new ControllerKeyboard(this, jeu);
    }

    public void moveLeft() {
        if (paddle.getX() > -20) {
            paddle.setX(paddle.getX() - 3);
        }
    }

    public void moveRight() {
        if (paddle.getX() < WIDTH - 23) {
            paddle.setX(paddle.getX() + 3);
        }
    }


    //Getters et Setters
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    public ViewMenu getMenu() {
        return menu;
    }

    public ViewJeu getViewJeu(){
        return viewJeu;
    }
    public void setVueCompletMenu(){
        menu.setVueCompletMenu();
    }
    public void setVueJeu(){
        viewJeu.afficherJeu();
    }
    public void setEventHandlerMenu(ControllerMenu controllerMenu){
        menu.setEvents(controllerMenu);

    }



}

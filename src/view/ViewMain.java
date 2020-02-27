package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;

public class ViewMain extends Application {
    private BorderPane borderPaneRoot;
    private Scene scene;
    private Button btnJouer;


    @Override
    public void start(Stage menuViewStage){
        displayMenu();
        borderPaneRoot = new BorderPane();
        borderPaneRoot.setPadding(new Insets(15, 20, 10, 10));//fait du padding
        /// TOP BTN
        borderPaneRoot.setTop(btnJouer);//j ajoute le Btn en Haut dans le root
        scene = new Scene(borderPaneRoot,1024,768);
        menuViewStage.setTitle("Le menu");
        menuViewStage.setScene(scene);
        menuViewStage.show();
    }

    private void displayMenu(){
        borderPaneRoot.getChildren().clear();
        btnJouer = new Button();
        btnJouer.setText("Jouer");
        borderPaneRoot.getChildren().add(btnJouer);
    }

}

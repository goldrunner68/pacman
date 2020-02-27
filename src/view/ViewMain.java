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
        menuViewStage.setTitle("Le menu");
        borderPaneRoot = new BorderPane();
        borderPaneRoot.setPadding(new Insets(15, 20, 10, 10));//fait du padding
        /// TOP BTN
        borderPaneRoot.setTop(btnJouer);//j ajoute le Btn en Haut dans le root
        scene = new Scene(borderPaneRoot,1024,768);
        menuViewStage.setScene(scene);
        menuViewStage.show();
    }

    private void displayMenu(){
        borderPaneRoot.getChildren().clear();
        btnJouer = new Button("Jouer");
        btnJouer.setText("Jouer");
        btnJouer.setLayoutX(100);
        btnJouer.setLayoutY(100);
        borderPaneRoot.getChildren().add(btnJouer);


    }




}

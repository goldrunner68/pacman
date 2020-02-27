package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ViewMenu extends Application {
    private StackPane stackPaneroot;
    private Scene scene;

    @Override
    public void start(Stage menuViewStage){
        menuViewStage.setTitle("Le menu");
        stackPaneroot = new StackPane();
        scene = new Scene(stackPaneroot,1024,768);
        menuViewStage.setScene(scene);
        menuViewStage.show();
    }

}

package Controller;


import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;
import view.ViewHandler;

public class ControllerBonus implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private Menu model;


    public void ControllerOption(ViewHandler launcher, Menu model) {
        this.model = model;
        this.launcher = launcher;


    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(launcher.getViewMenu().getLancerJeu())) {
            launcher.setVueJeu();
        } else if (event.getSource().equals(launcher.getViewMenu().getLancerOption())) {
            launcher.setVueOption();

        } else if (event.getSource().equals(launcher.getViewMenu().getLancerQuitter())) {
            launcher.getPrimaryStage().close();
        }

    }

}

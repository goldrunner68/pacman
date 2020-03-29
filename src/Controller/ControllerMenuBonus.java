package Controller;


import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;
import view.ViewHandler;

public class ControllerMenuBonus implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private Menu model;

    public ControllerMenuBonus(ViewHandler launcher, Menu model) {
        this.launcher = launcher;
        this.model = model;
    }



    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(launcher.getVueBonus().getLancerJeu())) {
            launcher.setVueJeu();

        } else if (event.getSource().equals(launcher.getVueBonus().getLancerQuitter())) {
            launcher.getPrimaryStage().close();
        }

    }

}

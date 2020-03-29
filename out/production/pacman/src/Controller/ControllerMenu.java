package Controller;


import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;
import view.ViewHandler;

public class ControllerMenu implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private Menu model;


    public ControllerMenu(ViewHandler launcher, Menu model) {
            this.model = model;
            this.launcher = launcher;
            this.launcher.setEventHandlerMenu(this);

    }
    @Override
    public void handle(MouseEvent event){
        if (event.getSource().equals(launcher.getVueMenu().getLancerJeu())) {
            launcher.setVueJeu();
        } else if (event.getSource().equals(launcher.getVueMenu().getLancerOption())) {
            launcher.setVueOption();

        } else if (event.getSource().equals(launcher.getVueMenu().getLancerQuitter())) {
            launcher.getPrimaryStage().close();
        }

    }

}

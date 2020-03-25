package Controller;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class Clavier {
    public Clavier() {

        this.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                System.out.println("clavier");
            }
        });
        this.setOnKeyReleased(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {

            }
        });
    }

    private void setOnKeyPressed(EventHandler<KeyEvent> keyEventEventHandler) {
    }

    private void setOnKeyReleased(EventHandler<KeyEvent> keyEventEventHandler) {
    }


}

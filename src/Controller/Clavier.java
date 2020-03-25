package Controller;


import javafx.scene.Scene;

public class Clavier {
    private Scene scene;

    public Clavier(Scene scene) {
        this.scene = scene;
    }

    public static void deplacmentSprite(Scene scene) {
        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    System.out.println("up");
                    break;
                case DOWN:
                    System.out.println("down");
                    break;
                case LEFT:
                    System.out.println("left");
                    break;
                case RIGHT:
                    System.out.println("right");
                    break;
                default:
                    System.out.println(e.getCode());
            }
        });


    }
}

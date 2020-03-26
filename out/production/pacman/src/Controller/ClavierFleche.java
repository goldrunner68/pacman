package Controller;

import javafx.scene.Scene;


public class ClavierFleche {

    private static int valY,valX;
    private Scene scene;

    public ClavierFleche(Scene scene) {
        this.scene = scene;
    }


    public static void deplacmentSprite(Scene scene) {

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                     valY = valY + 1;
                    System.out.println("UP "+valY);
                    break;
                case DOWN:
                    valY = valY -1;
                    System.out.println("DOWN "+valY);
                    break;
                case LEFT:
                    valX = valX -1;
                    System.out.println("LEFT "+valX);
                    break;
                case RIGHT:
                    valX = valX +1;
                    System.out.println("RIGHT "+valX);
                    break;
                default:
                    System.out.println(e.getCode());
            }
        });


    }
}

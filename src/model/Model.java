package model;

import javafx.scene.Group;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Model {
    private Group root;

    private ImageView boule,brique;
    private ArrayList niveau1;

    public Model(Group root, ImageView boule, ArrayList niveau1) {
        this.root = root;
        this.boule = boule;
        this.niveau1 = niveau1;
    }


    private int[] level(){
        int plateau[] = {
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3,
                1, 2, 2, 1, 2, 2, 2, 2, 2, 1, 3,
                1, 1, 2, 1, 2, 2, 2, 1, 2, 1, 3,
                0, 2, 2, 2, 2, 2, 2, 1, 2, 0, 3,//44
                1, 2, 1, 2, 2, 2, 2, 2, 2, 1, 3,
                1, 2, 1, 1, 2, 2, 1, 2, 1, 1, 3,
                1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 3,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3//44
        };

        return plateau;
    }
    public void constructionLevel(){
        int[] plateau = level();
        niveau1 = new ArrayList();
        int col = 0;
        int ligne =0;
        for(int index = 0; index < 88; index++)
        {
            col = col+64;
            niveau1.add(plateau[index]);
            if (niveau1.get(index).equals(3)){// si 3 passe a la ligne
                ligne = ligne+64;
                col =0;
            }
            if (niveau1.get(index).equals(1)){// si 1 affiche une brique
                brique = new ImageView("Asset/Images/Brick_Block.png");
                brique.setX(600+col);
                brique.setY(300+ligne);
                brique.setFitWidth(64);
                brique.setFitHeight(64);
                root.getChildren().add(brique);
            }
            if (niveau1.get(index).equals(2)){// si 1 affiche une boule
                boule = new ImageView("Asset/Images/boule.png");
                boule.setX(600+col);
                boule.setY(300+ligne);
                boule.setFitWidth(64);
                boule.setFitHeight(64);
                root.getChildren().add(boule);
            }


        }
    }
}

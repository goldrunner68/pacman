package model;

import javafx.scene.Group;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Model {
    private Group root;
    private ArrayList<Integer> niveau1;

    public Model(Group root, ArrayList<Integer> niveau1) {
        this.root = root;

        this.niveau1 = niveau1;
    }

// creation du niveau dans un tableau
    private int[] level(){
        int plateau[] = {
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 2, 2, 1, 4, 2, 2, 2, 4, 1,
                1, 1, 2, 1, 2, 2, 2, 1, 2, 1,
                0, 2, 2, 2, 2, 2, 2, 1, 2, 0,
                1, 2, 1, 2, 2, 2, 2, 2, 2, 1,
                1, 2, 1, 1, 2, 2, 1, 2, 1, 1,
                1, 2, 2, 2, 4, 1, 1, 4, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1
        };

        return plateau;
    }
    public void constructionLevel(){
        // axe X
        int valeuX = 670;
        // axe Y
        int valeurY = 300;

        // j ajoute dans un arrayList la valeur INT du tableau
        int[] plateau = level();
        niveau1 = new ArrayList<>();
        int col = 0;
        int ligne =0;
        for(int index = 0; index < level().length; index++)
        {

            col = col+64;
            niveau1.add(plateau[index]);
            if ((index%10)==0){
                //  a la fin du dixieme caractere
                // je passe a ligne (64px*64px)
                ligne = ligne+64;
                col =0;
            }

            if (niveau1.get(index).equals(1)){
                // si valeur 1 j'affiche une brique
                ImageView brique = new ImageView("Asset/Images/Brick_Block.png");
                brique.setX(valeuX +col);
                brique.setY(valeurY +ligne);
                brique.setFitWidth(64);
                brique.setFitHeight(64);
                root.getChildren().add(brique);
            }
            if (niveau1.get(index).equals(2)){
                // si 2 affiche une boule
                ImageView boule = new ImageView("Asset/Images/boule.png");
                boule.setX(valeuX +col);
                boule.setY(valeurY +ligne);
                boule.setFitWidth(64);
                boule.setFitHeight(64);
                root.getChildren().add(boule);
            }
            if (niveau1.get(index).equals(4)){
                // si 4 affiche une boule de feu
                ImageView boom = new ImageView("Asset/Images/Fire.gif");
                boom.setX(valeuX +col);
                boom.setY(valeurY +ligne);
                boom.setFitWidth(64);
                boom.setFitHeight(64);
                root.getChildren().add(boom);
            }

        }
    }

}

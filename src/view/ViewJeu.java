package view;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Screen;

import java.util.ArrayList;

import static javafx.scene.paint.Color.RED;

public class ViewJeu {
    private Group root;
    private ViewHandler viewHandler;
    private ImageView spritePacman;
    private Jeu jeu;
    private ImageView imageDeFond;
    private double vitesse = 10;
    Text affichagePlateau;
    private ArrayList niveau1;
    private Text aff;
    private Rectangle rectangle;

    //


    public ViewJeu(Group root, ViewHandler viewHandler) {

        jeu = new Jeu();
        this.root = root;
        this.viewHandler = viewHandler;

        initBackground();

        afficherJeu();
    }
private void univers(){
    int plateau[] ={
            1,1,1,1,
            2,2,2,1,
    };

    niveau1 = new ArrayList();

    for(int i = 0; i < 8; i++)
    {
        niveau1.add(plateau[i]);


        if (niveau1.get(0).equals(1)){
            Rectangle rectangle = new Rectangle();
            rectangle.setX(20);
            rectangle.setY(50);
            rectangle.setWidth(200);
            rectangle.setHeight(150);
            rectangle.setFill(Color.RED);
        }
        if (niveau1.get(0).equals(2)){
            Rectangle rectangle = new Rectangle();
            rectangle.setX(20);
            rectangle.setY(50);
            rectangle.setWidth(200);
            rectangle.setHeight(150);
            rectangle.setFill(Color.BLUE);
        }
    }

}
    private void initBackground() {



        imageDeFond = new ImageView("Asset/Images/pacmanFondInGame.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imageDeFond.setFitHeight((int) primaryScreenBounds.getHeight());
        imageDeFond.setFitWidth((int) primaryScreenBounds.getWidth());


    }

    public void afficherJeu() {
        root.getChildren().clear();
        root.getChildren().add(rectangle);

        }










}

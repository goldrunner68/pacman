package view;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class ViewJeu {
    private Group root;
    private ViewHandler viewHandler;
    private ImageView spritePacman;
    private Jeu jeu;
    private ImageView imageDeFond;
    private double vitesse = 10;
    //


    public ViewJeu(Group root, ViewHandler viewHandler) {

        jeu = new Jeu();
        this.root = root;
        this.viewHandler = viewHandler;

        initBackground();
        afficherJeu();
    }
    private void initBackground() {
        TiledMap tiledMap = new TmxMapLoader().load("level1.tmx");
        TiledMapRenderer tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
        OrthographicCamera camera = new OrthographicCamera(960, 900);
        camera.position.set(posX, posY, 0);
        camera.update();
        tiledMapRenderer.setView(camera);
        tiledMapRenderer.render();
        imageDeFond = new ImageView("Asset/Images/pacmanFondInGame.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        imageDeFond.setFitHeight((int) primaryScreenBounds.getHeight());
        imageDeFond.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    public void afficherJeu() {
        root.getChildren().clear();
        root.getChildren().addAll(imageDeFond);

        }




    public void moveBareLeft() {
        spritePacman.setX(spritePacman.getX() - vitesse);
    }

    public void moveBareRight() {
        spritePacman.setX(spritePacman.getX() + vitesse);
    }





}

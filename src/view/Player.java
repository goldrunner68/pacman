package view;


import Controller.MoveX;
import javafx.scene.Group;
import javafx.scene.image.ImageView;


public class Player {
    private Group root;
    private ImageView puckman;
    private int playerControllerX,playerControllerY;
    private MoveX moveX;
    private int index = 10;


    public Player(Group root, int playerControllerX, int playerControllerY) {
        this.root = root;
        this.playerControllerX = playerControllerX;
        this.playerControllerY = playerControllerY;
        loadImage();
    }

    public void setPlayerControllerX() {
        moveX = new MoveX();
        this.playerControllerX=0;
        System.out.println( this.playerControllerX);

    }

    public void setPlayerControllerY() {
        this.playerControllerY = 500;

    }

    public double getPlayerControllerX() {
        setPlayerControllerX();
        return playerControllerX;
    }

    public double getPlayerControllerY() {
       setPlayerControllerY();
        return playerControllerY;
    }

    public void loadImage() {
        puckman= new  ImageView("src/Asset/Images/puckman.png");
        puckman.setX(getPlayerControllerX());
        puckman.setY(getPlayerControllerY());
        puckman.setFitWidth(64);
        puckman.setFitHeight(64);
        root.getChildren().add(puckman);
    }


}
